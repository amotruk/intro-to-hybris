package com.epam.training.service.impl;

import com.epam.training.model.OrganizationModel;
import com.epam.training.service.OrganizationService;

public class DefaultOrganizationService implements OrganizationService{

    @Override
    public Integer getCustomersCount(final OrganizationModel organization) {
        return organization.getCustomers().size();
    }
}
