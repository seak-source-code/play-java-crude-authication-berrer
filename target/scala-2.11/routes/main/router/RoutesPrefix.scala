
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kimseak/local/2nt/bvc-power/setting up project/play-java-starter-example/conf/routes
// @DATE:Mon May 08 09:41:20 ICT 2017


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
