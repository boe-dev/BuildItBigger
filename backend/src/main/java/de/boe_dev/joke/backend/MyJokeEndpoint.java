package de.boe_dev.joke.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myJokeApi",
        version = "v1",
        resource = "myJoke",
        namespace = @ApiNamespace(
                ownerDomain = "backend.joke.boe_dev.de",
                ownerName = "backend.joke.boe_dev.de",
                packagePath = ""
        )
)
public class MyJokeEndpoint {

    private static final Logger logger = Logger.getLogger(MyJokeEndpoint.class.getName());

    /**
     * This method gets the <code>MyJoke</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>MyJoke</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getMyJoke")
    public MyJoke getMyJoke(@Named("id") Long id) {
        // TODO: Implement this function
        logger.info("Calling getMyJoke method");
        return null;
    }

    /**
     * This inserts a new <code>MyJoke</code> object.
     *
     * @param myJoke The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertMyJoke")
    public MyJoke insertMyJoke(MyJoke myJoke) {
        // TODO: Implement this function
        logger.info("Calling insertMyJoke method");
        return myJoke;
    }
}