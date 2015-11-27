
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/100481892/ds-forum_project/conf/routes
// @DATE:Thu Nov 26 23:37:43 EST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.Application.mainPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main$post<[^/]+>""", """controllers.Application.newCommentClick(post:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.Application.postPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.Application.createPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""", """controllers.Application.commentPage(id:Integer ?= -1)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""", """controllers.Application.createComment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_mainPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_Application_mainPage1_invoker = createInvoker(
    Application_1.mainPage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "mainPage",
      Nil,
      "GET",
      """ Main Page""",
      this.prefix + """main"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_newCommentClick2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main"), DynamicPart("post", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_newCommentClick2_invoker = createInvoker(
    Application_1.newCommentClick(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newCommentClick",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """main$post<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_postPage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_Application_postPage3_invoker = createInvoker(
    Application_1.postPage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "postPage",
      Nil,
      "GET",
      """ Posting Page""",
      this.prefix + """post"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_createPost4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_Application_createPost4_invoker = createInvoker(
    Application_1.createPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createPost",
      Nil,
      "POST",
      """""",
      this.prefix + """post"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_commentPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment")))
  )
  private[this] lazy val controllers_Application_commentPage5_invoker = createInvoker(
    Application_1.commentPage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "commentPage",
      Seq(classOf[Integer]),
      "GET",
      """ Commenting Page""",
      this.prefix + """comment"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_createComment6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment")))
  )
  private[this] lazy val controllers_Application_createComment6_invoker = createInvoker(
    Application_1.createComment(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createComment",
      Nil,
      "POST",
      """""",
      this.prefix + """comment"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_mainPage1_route(params) =>
      call { 
        controllers_Application_mainPage1_invoker.call(Application_1.mainPage())
      }
  
    // @LINE:10
    case controllers_Application_newCommentClick2_route(params) =>
      call(params.fromPath[Integer]("post", None)) { (post) =>
        controllers_Application_newCommentClick2_invoker.call(Application_1.newCommentClick(post))
      }
  
    // @LINE:13
    case controllers_Application_postPage3_route(params) =>
      call { 
        controllers_Application_postPage3_invoker.call(Application_1.postPage())
      }
  
    // @LINE:14
    case controllers_Application_createPost4_route(params) =>
      call { 
        controllers_Application_createPost4_invoker.call(Application_1.createPost())
      }
  
    // @LINE:17
    case controllers_Application_commentPage5_route(params) =>
      call(params.fromQuery[Integer]("id", Some(-1))) { (id) =>
        controllers_Application_commentPage5_invoker.call(Application_1.commentPage(id))
      }
  
    // @LINE:18
    case controllers_Application_createComment6_route(params) =>
      call { 
        controllers_Application_createComment6_invoker.call(Application_1.createComment())
      }
  
    // @LINE:21
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}