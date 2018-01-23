package com.mycompany.training.storefront.service;

public interface CustomerStatusService {

    int getCustomerAttemptCount(final String userUid);

    void incrementAttemptCount(final String userUid);

    void resetCustomerAttemptCount(final String userUid);

    boolean getCustomerStatus(final String userUid);

    void lockCustomer(final String userUid);

    void unlockCustomer(final String userUid);
}
