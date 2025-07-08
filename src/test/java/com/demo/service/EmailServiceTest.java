package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    private EmailService emailService;

    @Before
    public void setUp() {
        emailService = EmailService.getInstance();
    }

    @Test
    public void testSingletonInstance() {
        EmailService anotherInstance = EmailService.getInstance();
        assertSame("Instances should be same (singleton)", emailService, anotherInstance);
    }

    @Test(expected = RuntimeException.class)
    public void testSendEmailThrowsException() {
        Order order = new Order();
        emailService.sendEmail(order);  // should throw RuntimeException
    }

    @Test
    public void testSendEmailSetsCustomerNotifiedFalseBeforeException() {
        Order order = new Order();
        try {
            emailService.sendEmail(order);
        } catch (RuntimeException e) {
            assertFalse("Customer should not be notified", order.isCustomerNotified());
        }
    }

    @Test
    public void testSendEmailWithCC() {
        Order order = new Order();
        boolean result = emailService.sendEmail(order, "cc@example.com");

        assertTrue("Email should be sent successfully", result);
        assertTrue("Customer should be notified", order.isCustomerNotified());
    }
}
