package controllers;

import models.User;
import models.UserToken;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Date;

/**
 * Created by kimseak on 5/7/17.
 */
public class Secured extends Security.Authenticator {


    @Override
    public String getUsername(Http.Context ctx) {
        UserToken token = new UserToken();
        String[] authTokenHeaderValues = ctx.request().headers().get(SecurityController.AUTH_TOKEN_HEADER);
        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
            token = UserToken.find.where().eq("authToken", authTokenHeaderValues[0]).findUnique();

            if (token != null) {
                if(token.isExpire(token.expriedDate) == false){
                    token.delete();
                    return null;
                }
                else
                    return "can be acesss";
            }
        }
        return null;
    }
    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return unauthorized(Json.toJson(new Unauthorized()));
    }

    public class Unauthorized{
        public String error = "error";
        public String status = "401 Unauthorized";
        public String message = "Required to Login";
    }
}
