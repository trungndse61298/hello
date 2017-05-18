
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PLAY/hello-world/hello/conf/routes
// @DATE:Thu Apr 13 21:01:03 ICT 2017


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
