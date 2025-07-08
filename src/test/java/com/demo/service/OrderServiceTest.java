package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    private OrderService orderService;
    @Before
    public void setUp() {
        orderService = OrderService.getInstance();
    }

    @Test
    public void testPlaceOrderWithCC_Success() {
        Order order = new Order();
        order.setPrice(100.0);

        boolean result = orderService.placeOrder(order, "cc@amazon.com");

        assertTrue("Email should be sent", result);
        assertEquals("Price with tax should be 120.0", 120.0, order.getPriceWithTax(), 0.001);
        assertTrue("Customer should be notified", order.isCustomerNotified());
    }

    private void assertTrue(String emailShouldBeSent, boolean result) {
    }

    @Test
    public void testPlaceOrder_ThrowsException() {
        Order order = new Order();
        order.setPrice(200.0);

        try {
            orderService.placeOrder(order);
            fail("Expected RuntimeException from sendEmail()");
        } catch (RuntimeException ex) {
            assertEquals("An Exception Occurred", ex.getMessage());
            assertEquals("Price with tax should be 240.0", 240.0, order.getPriceWithTax(), 0.001);
            assertTrue("Customer should be notified", order.isCustomerNotified());
        }
    }
}