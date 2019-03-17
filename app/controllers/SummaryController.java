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


public class SummaryController extends Controller {

    private final play.i18n.MessagesApi messagesApi;

    @Inject
    public SummaryController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }


    public Result appSummary(Http.Request request) {
        Messages messages = this.messagesApi.preferred(request);
        String welcome = messages.at("index.welcome");
        JsonNode jsonNode = Json.toJson(new AppSummary(welcome));

        return ok(jsonNode).as("application/json");
    }


    public Result postTest() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Post Request Test => Data Sending Success"));
        return ok(jsonNode).as("application/json");
    }

}
