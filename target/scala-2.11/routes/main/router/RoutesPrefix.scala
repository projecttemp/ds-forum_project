
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/100481892/ds-forum_project/conf/routes
// @DATE:Thu Nov 26 23:37:43 EST 2015


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
