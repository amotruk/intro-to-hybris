package com.epam.training.attributehandlers;

import com.epam.training.model.OrganizationModel;
import com.epam.training.service.OrganizationService;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

public class CustomersNumberAttributeHandler extends AbstractDynamicAttributeHandler<Integer, OrganizationModel> {

    private OrganizationService organizationService;

    @Override
    public Integer get(OrganizationModel model) {
        return organizationService.getCustomersCount(model);
    }

    public OrganizationService getOrganizationService() {
        return organizationService;
    }

    public void setOrganizationService(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }
}
