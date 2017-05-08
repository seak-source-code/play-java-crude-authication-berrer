
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kimseak/github/play-java-crude-authication-berrer/conf/routes
// @DATE:Mon May 08 14:39:32 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
