package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dtos.AppSummary;
import play.i18n.Messages;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final play.i18n.MessagesApi messagesApi;

    @Inject
    public HomeController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }

    public Result index(Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        String welcome = messages.at("index.welcome");
        return ok(views.html.index.render(welcome));
    }


}
