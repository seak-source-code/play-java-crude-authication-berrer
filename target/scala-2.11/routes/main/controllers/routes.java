
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kimseak/github/play-java-crude-authication-berrer/conf/routes
// @DATE:Mon May 08 14:39:32 ICT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSecurityController SecurityController = new controllers.ReverseSecurityController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserRoleController UserRoleController = new controllers.ReverseUserRoleController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSecurityController SecurityController = new controllers.javascript.ReverseSecurityController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserRoleController UserRoleController = new controllers.javascript.ReverseUserRoleController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
