
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kimseak/local/2nt/bvc-power/setting up project/play-java-starter-example/conf/routes
// @DATE:Mon May 08 09:41:20 ICT 2017

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
  Assets_3: controllers.Assets,
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  UserController_2: controllers.UserController,
  // @LINE:13
  SecurityController_0: controllers.SecurityController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Assets_3: controllers.Assets,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    UserController_2: controllers.UserController,
    // @LINE:13
    SecurityController_0: controllers.SecurityController
  ) = this(errorHandler, Assets_3, HomeController_1, UserController_2, SecurityController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_3, HomeController_1, UserController_2, SecurityController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.home()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/save""", """controllers.UserController.saveUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list-user""", """controllers.UserController.findAllUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.SecurityController.login"""),
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
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
    HomeController_1.home(),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/save")))
  )
  private[this] lazy val controllers_UserController_saveUser2_invoker = createInvoker(
    UserController_2.saveUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "saveUser",
      Nil,
      "POST",
      """User""",
      this.prefix + """user/save"""
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
    SecurityController_0.login,
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:6
    case controllers_HomeController_home1_route(params) =>
      call { 
        controllers_HomeController_home1_invoker.call(HomeController_1.home())
      }
  
    // @LINE:9
    case controllers_UserController_saveUser2_route(params) =>
      call { 
        controllers_UserController_saveUser2_invoker.call(UserController_2.saveUser())
      }
  
    // @LINE:10
    case controllers_UserController_findAllUser3_route(params) =>
      call { 
        controllers_UserController_findAllUser3_invoker.call(UserController_2.findAllUser())
      }
  
    // @LINE:13
    case controllers_SecurityController_login4_route(params) =>
      call { 
        controllers_SecurityController_login4_invoker.call(SecurityController_0.login)
      }
  }
}
