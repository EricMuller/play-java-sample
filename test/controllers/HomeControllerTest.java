package controllers;

import org.junit.Test;
import org.slf4j.Logger;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import play.test.Helpers;
import play.test.WithApplication;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

    org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");
        Result result = route(app, request);
        assertEquals(OK, result.status());

        String contentAsString = Helpers.contentAsString(result, mat);

        LOGGER.info(contentAsString);
    }


}
