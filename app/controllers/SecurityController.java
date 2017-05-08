package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import models.UserToken;
import play.api.libs.iteratee.Cont;
import play.data.Form;
import play.data.validation.Constraints;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.unauthorized;

/**
 * Created by kimseak on 5/7/17.
 */
public class SecurityController extends Controller {

    public final static String AUTH_TOKEN_HEADER = "X-AUTH-TOKEN";
    public static final String AUTH_TOKEN = "authToken";


    public Result login(){

        //Form_Login
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(loginForm.errorsAsJson());
        }

        Login login = loginForm.get();

        User user = User.findByNameAndPassword(login.username, login.password);
        if (user == null) {
            return unauthorized();
        }else{
            UserToken token = new UserToken();
            String authToken = token.createToken(user.id);
            ObjectNode authTokenJson = Json.newObject();
            authTokenJson.put(AUTH_TOKEN, authToken);

            return ok(Json.toJson(UserToken.find.where().eq("authToken", authToken).findUnique()));
        }
    }

    public Result logout(){

        String header = request().getHeader("X-AUTH-TOKEN");
        UserToken token = UserToken.find.where().eq("authToken", header).findUnique();
        if(token == null)
            return ok("you are not login");
        token.delete();

        return redirect("/");

    }

    public static class Login{

        @Constraints.Required
        public String username;

        @Constraints.Required
        public String password;

    }



}
