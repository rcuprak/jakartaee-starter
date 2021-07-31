package org.ctjava;

import jakarta.inject.Inject;
import org.ctjava.starter.HelloWorldBean;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Simple integration test. This test starts-up a Payara container, deploys the application, and runs a test (within the container)
 * @author Ryan Cuprak
 */
@ExtendWith(ArquillianExtension.class)
public class HelloWorldBeanTest {

    /**
     * Injects the starter bean
     */
    @Inject
    private HelloWorldBean starterBean;

    /**
     * Creates the test archive
     * @return web archive for testing
     */
    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class)
            .addPackage("org.ctjava.starter")
            .addAsWebInfResource("beans.xml");
    }

    /**
     * Simple test, this runs in the container
     */
    @Test
    public void testStarterBean() {
        assertEquals("Hello from a bean!",starterBean.getMessage());
    }
    
}
