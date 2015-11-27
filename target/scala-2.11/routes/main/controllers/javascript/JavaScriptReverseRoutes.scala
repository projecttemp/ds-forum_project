
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/100481892/ds-forum_project/conf/routes
// @DATE:Thu Nov 26 23:37:43 EST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def newCommentClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newCommentClick",
      """
        function(post) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("post", post)})
        }
      """
    )
  
    // @LINE:13
    def postPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.postPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:18
    def createComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createComment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment"})
        }
      """
    )
  
    // @LINE:14
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:17
    def commentPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.commentPage",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:9
    def mainPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mainPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
        }
      """
    )
  
  }


}