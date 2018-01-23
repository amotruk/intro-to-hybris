package com.mycompany.training.storefront.service.impl;

import com.mycompany.training.storefront.service.CustomerStatusService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.daos.UserDao;

public class DefaultCustomerStatusService implements CustomerStatusService{

    private ModelService modelService;
    private UserDao userDao;

    @Override
    public int getCustomerAttemptCount(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        return customer.getAttemptCount();
    }

    @Override
    public void incrementAttemptCount(String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        customer.setAttemptCount(customer.getAttemptCount() + 1);
        modelService.save(customer);
    }


    @Override
    public void resetCustomerAttemptCount(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        customer.setAttemptCount(0);
        modelService.save(customer);
    }

    @Override
    public boolean getCustomerStatus(final String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        return customer.getStatus();
    }

    @Override
    public void lockCustomer(String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        customer.setStatus(false);
        modelService.save(customer);
    }

    @Override
    public void unlockCustomer(String userUid) {
        CustomerModel customer = (CustomerModel) userDao.findUserByUID(userUid);
        customer.setStatus(true);
        modelService.save(customer);
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
