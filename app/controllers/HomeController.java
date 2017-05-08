package controllers;


import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import static play.mvc.Results.ok;

/**
 * Created by kimseak on 5/8/17.
 */
public class HomeController  {

    @Security.Authenticated(Secured.class)
    public Result home(){
        return ok("rest-api-data");
    }
}
