package com.mycompany.training.storefront.service.impl;

import com.mycompany.training.storefront.service.CustomerStatusService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.daos.UserDao;

public class DefaultCustomerStatusService implements CustomerStatusService {

    private ModelService modelService;
    private UserDao userDao;

    @Override
    public int getCustomerAttemptCount(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        return customer != null ? customer.getAttemptCount() : 0;
    }

    @Override
    public void incrementAttemptCount(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        if (customer != null) {
            customer.setAttemptCount(customer.getAttemptCount() + 1);
            modelService.save(customer);
        }
    }


    @Override
    public void resetCustomerAttemptCount(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        if (customer != null) {
            customer.setAttemptCount(0);
            modelService.save(customer);
        }
    }

    @Override
    public boolean customerIsLocked(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        return customer != null ? customer.getStatus() : false;
    }

    @Override
    public void lockCustomer(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        if (customer != null) {
            customer.setStatus(false);
            modelService.save(customer);
        }
    }

    @Override
    public void unlockCustomer(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        if (customer != null) {
            customer.setStatus(true);
            modelService.save(customer);
        }
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
