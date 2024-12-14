package org.ctjava.starter;

import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

/**
 * Simple start-up bean. The post-construct method fires when the server is started.
 * @author Ryan Cuprak
 */
@ApplicationScoped
public class StartupBean {

    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger("StartupBean");

    /**
     * Executes on startup, no need for a "startup" servlet.
     */
    public void init(@Observes Startup startup) {
        LOGGER.info("Startup!");
    }
}
