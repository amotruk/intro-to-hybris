package com.epam.training.service;

import com.epam.training.model.OrganizationModel;

public interface OrganizationService {

    Integer getCustomersCount(final OrganizationModel organization);
}
