package controllers;


import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import play.libs.Json;
import play.mvc.Result;
import services.UserService;
import util.Util;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by kimseak on 5/7/17.
 */
public class UserController {

    @Inject
    private UserService service ;
    private User user;

    //save user
    public Result saveUser(){

        JsonNode json = request().body().asJson();
        if(json == null){
            return badRequest(Util.createRespone("Expecting Json data", false));
        }
        service.saveUser(Json.fromJson(json, User.class));
        return ok(" current user has been inserted to database");
    }

    //find all user
    public Result findAllUser(){
        return ok(Json.toJson(service.findAllUser()));
    }



}
