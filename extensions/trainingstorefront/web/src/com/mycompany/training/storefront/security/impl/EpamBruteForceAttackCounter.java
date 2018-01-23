package com.mycompany.training.storefront.security.impl;

import com.mycompany.training.storefront.security.BruteForceAttackCounter;
import com.mycompany.training.storefront.service.CustomerStatusService;

public class EpamBruteForceAttackCounter implements BruteForceAttackCounter {

    private CustomerStatusService customerStatusService;
    private static final int ACCOUNT_LOCK_THRESHOLD = 3;

    @Override
    public void registerLoginFailure(String userUid) {
        this.customerStatusService.incrementAttemptCount(userUid);
    }

    @Override
    public boolean isAttack(String userUid) {
        int attemptCount = this.customerStatusService.getCustomerAttemptCount(userUid);
        return attemptCount >= ACCOUNT_LOCK_THRESHOLD;
    }

    @Override
    public void resetUserCounter(String userUid) {
        this.customerStatusService.resetCustomerAttemptCount(userUid);
    }

    @Override
    public int getUserFailedLogins(String userUid) {
        return this.customerStatusService.getCustomerAttemptCount(userUid);
    }

    public CustomerStatusService getCustomerStatusService() {
        return customerStatusService;
    }

    public void setCustomerStatusService(CustomerStatusService customerStatusService) {
        this.customerStatusService = customerStatusService;
    }
}
