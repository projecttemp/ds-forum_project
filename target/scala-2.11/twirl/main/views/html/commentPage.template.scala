
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object commentPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class commentPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Application.Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>Add A Comment</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/post.css")),format.raw/*8.101*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/commentPage.js")),format.raw/*9.76*/("""" type="text/javascript"></script>
    </head>
    <body class="main_body">
        """),_display_(/*12.10*/helper/*12.16*/.form(routes.Application.createComment)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
            """),format.raw/*13.13*/("""<div>
                <h1>Add A Comment</h1>
            </div>
            
            <div class = "inputs">
                <label>
                    <span class = "post_title">Response To:</span>
                    <input class="post_title_input" type="text" name="title" placeholder="Post Title" value=""""),_display_(/*20.111*/form("postTitle")/*20.128*/.value),format.raw/*20.134*/("""" disabled>
                </label>
                
                <br>
                <br>
                
                <label>
                    <span class = "post_user">Username:</span>
                    <input class="post_user_input" type="text" name="user" placeholder="John Doe" value=""""),_display_(/*28.107*/form("user")/*28.119*/.value),format.raw/*28.125*/("""" required>
                </label>
                
                <br>
                <br>
                
                <label>
                    <span class = "post_message">Message:</span>
                    <textarea class="post_message_input" style="resize:none" maxlength="500000" name="content" placeholder="Post Content" value="" required>"""),_display_(/*36.158*/form("content")/*36.173*/.value),format.raw/*36.179*/("""</textarea>
                </label>
                
                <input type="hidden" name="mainPostID" value=""""),_display_(/*39.64*/form("mainPostID")/*39.82*/.value),format.raw/*39.88*/("""">
                
            </div>
            
            <div id="new_post">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <button class="post_button" type="submit">Post Comment!</button>
                
            </div>
        """)))}),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(form:Form[Application.Comment]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Application.Comment]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object commentPage extends commentPage_Scope0.commentPage
              /*
                  -- GENERATED --
                  DATE: Fri Nov 27 02:30:28 EST 2015
                  SOURCE: C:/Users/100481892/ds-forum_project/app/views/commentPage.scala.html
                  HASH: 7cdfcdc8fa5156d35e33d2401e1c2bb5f9ce4108
                  MATRIX: 776->1|904->34|934->38|1100->178|1114->184|1176->225|1228->251|1242->257|1309->304|1424->392|1439->398|1487->437|1527->439|1569->453|1917->773|1944->790|1972->796|2314->1110|2336->1122|2364->1128|2759->1495|2784->1510|2812->1516|2959->1636|2986->1654|3013->1660|3394->2010|3427->2016
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|43->12|43->12|43->12|43->12|44->13|51->20|51->20|51->20|59->28|59->28|59->28|67->36|67->36|67->36|70->39|70->39|70->39|84->53|85->54
                  -- GENERATED --
              */
          