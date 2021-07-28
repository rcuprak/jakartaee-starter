package org.ctjava.starter;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import java.util.logging.Logger;

/**
 * Simple start-up bean. The post-construct method fires when the server is started.
 * @author Ryan Cuprak
 */
@Singleton
@Startup
public class StartupBean {

    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger("StartupBean");

    /**
     * Executes on startup, no need for a "startup" servlet.
     */
    @PostConstruct
    public void init() {
        LOGGER.info("Application initializing...");
    }

}
