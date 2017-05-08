package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.User;
import models.UserRole;
import play.libs.Json;
import play.mvc.Result;
import services.UserRoleService;
import util.Util;

import javax.inject.Inject;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by kimseak on 5/8/17.
 */
public class UserRoleController {

    @Inject
    UserRoleService service;
    UserRole userRole;

    public Result saveUserRole(){

        JsonNode json = request().body().asJson();
        if(json == null){
            return badRequest(Util.createRespone("Expecting Json data", false));
        }
        service.saveUserRole(Json.fromJson(json, UserRole.class));

        return ok("current user role has been inserted to database");
    }

    public Result findAllUserRole(){
        return  ok(Json.toJson(service.findAllUserRole()));
    }
}
