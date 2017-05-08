
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kimseak/github/play-java-crude-authication-berrer/conf/routes
// @DATE:Mon May 08 14:39:32 ICT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Assets_4: controllers.Assets,
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_2: controllers.UserController,
  // @LINE:13
  SecurityController_3: controllers.SecurityController,
  // @LINE:18
  UserRoleController_1: controllers.UserRoleController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Assets_4: controllers.Assets,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_2: controllers.UserController,
    // @LINE:13
    SecurityController_3: controllers.SecurityController,
    // @LINE:18
    UserRoleController_1: controllers.UserRoleController
  ) = this(errorHandler, Assets_4, HomeController_0, UserController_2, SecurityController_3, UserRoleController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_4, HomeController_0, UserController_2, SecurityController_3, UserRoleController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.home()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/save/""" + "$" + """id<[^/]+>""", """controllers.UserController.saveUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list-user""", """controllers.UserController.findAllUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.SecurityController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.SecurityController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/role/save""", """controllers.UserRoleController.saveUserRole"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list-role""", """controllers.UserRoleController.findAllUserRole"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_home1_invoker = createInvoker(
    HomeController_0.home(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      """Home""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_saveUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/save/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_saveUser2_invoker = createInvoker(
    UserController_2.saveUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "saveUser",
      Seq(classOf[Long]),
      "POST",
      """User""",
      this.prefix + """user/save/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_findAllUser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list-user")))
  )
  private[this] lazy val controllers_UserController_findAllUser3_invoker = createInvoker(
    UserController_2.findAllUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "findAllUser",
      Nil,
      "GET",
      """""",
      this.prefix + """user/list-user"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SecurityController_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SecurityController_login4_invoker = createInvoker(
    SecurityController_3.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SecurityController",
      "login",
      Nil,
      "POST",
      """AUTHENCATION""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SecurityController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_SecurityController_logout5_invoker = createInvoker(
    SecurityController_3.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SecurityController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserRoleController_saveUserRole6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/role/save")))
  )
  private[this] lazy val controllers_UserRoleController_saveUserRole6_invoker = createInvoker(
    UserRoleController_1.saveUserRole,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserRoleController",
      "saveUserRole",
      Nil,
      "POST",
      """UserRole""",
      this.prefix + """user/role/save"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserRoleController_findAllUserRole7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list-role")))
  )
  private[this] lazy val controllers_UserRoleController_findAllUserRole7_invoker = createInvoker(
    UserRoleController_1.findAllUserRole,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserRoleController",
      "findAllUserRole",
      Nil,
      "GET",
      """""",
      this.prefix + """user/list-role"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:6
    case controllers_HomeController_home1_route(params) =>
      call { 
        controllers_HomeController_home1_invoker.call(HomeController_0.home())
      }
  
    // @LINE:9
    case controllers_UserController_saveUser2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_saveUser2_invoker.call(UserController_2.saveUser(id))
      }
  
    // @LINE:10
    case controllers_UserController_findAllUser3_route(params) =>
      call { 
        controllers_UserController_findAllUser3_invoker.call(UserController_2.findAllUser())
      }
  
    // @LINE:13
    case controllers_SecurityController_login4_route(params) =>
      call { 
        controllers_SecurityController_login4_invoker.call(SecurityController_3.login)
      }
  
    // @LINE:14
    case controllers_SecurityController_logout5_route(params) =>
      call { 
        controllers_SecurityController_logout5_invoker.call(SecurityController_3.logout)
      }
  
    // @LINE:18
    case controllers_UserRoleController_saveUserRole6_route(params) =>
      call { 
        controllers_UserRoleController_saveUserRole6_invoker.call(UserRoleController_1.saveUserRole)
      }
  
    // @LINE:19
    case controllers_UserRoleController_findAllUserRole7_route(params) =>
      call { 
        controllers_UserRoleController_findAllUserRole7_invoker.call(UserRoleController_1.findAllUserRole)
      }
  }
}
