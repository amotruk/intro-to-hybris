package com.epam.training.service.impl;

import com.epam.training.model.OrganizationModel;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.CustomerModel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;


@UnitTest
public class DefaultOrganizationServiceTest {

    private DefaultOrganizationService organizationService;

    @Before
    public void setUp() {
        organizationService = new DefaultOrganizationService();
    }

    @Test
    public void getCustomersCount() {
        OrganizationModel model = new OrganizationModel();
        Collection<CustomerModel> customers = new ArrayList<>();

        customers.add(new CustomerModel());
        customers.add(new CustomerModel());
        customers.add(new CustomerModel());
        customers.add(new CustomerModel());
        customers.add(new CustomerModel());

        model.setCustomers(customers);

        assertTrue("Number of customers should be the same", customers.size() == this.organizationService.getCustomersCount(model));
    }
}