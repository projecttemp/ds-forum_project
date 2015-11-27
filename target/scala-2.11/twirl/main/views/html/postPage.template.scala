
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object postPage_Scope0 {
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

class postPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Application.Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>Make A New Post</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/post.css")),format.raw/*8.101*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/postPage.js")),format.raw/*9.73*/("""" type="text/javascript"></script>
    </head>
    <body class="main_body">
        """),_display_(/*12.10*/helper/*12.16*/.form(routes.Application.createPost)/*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
            """),format.raw/*13.13*/("""<div>
                <h1>Make A New Post</h1>
            </div>
            
            <div class = "inputs">
                <label>
                    <span class = "post_title">Title:</span>
                    <input class="post_title_input" type="text" name="title" placeholder="Post Title" value=""""),_display_(/*20.111*/form("title")/*20.124*/.value),format.raw/*20.130*/("""" required>
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
                    <textarea class="post_message_input" style="resize:none" maxlength="500000" name="content" placeholder="Post Content" value=""""),_display_(/*36.147*/form("content")/*36.162*/.value),format.raw/*36.168*/("""" required></textarea>
                </label>
            </div>
            
            <div id="new_post">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <a href="./.." target="_parent"> 
                    <button class="post_button" type="submit">Post New Topic!</button>
                </a>
            </div>
        """)))}),format.raw/*51.10*/("""
    """),format.raw/*52.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(form:Form[Application.Post]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[Application.Post]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


}

/**/
object postPage extends postPage_Scope0.postPage
              /*
                  -- GENERATED --
                  DATE: Fri Nov 27 02:28:57 EST 2015
                  SOURCE: C:/Users/100481892/ds-forum_project/app/views/postPage.scala.html
                  HASH: 5f435128d884e1bc30424a80b2673bc4929317b6
                  MATRIX: 767->1|892->31|922->35|1090->177|1104->183|1166->224|1218->250|1232->256|1296->300|1411->388|1426->394|1471->430|1511->432|1553->446|1897->762|1920->775|1948->781|2290->1095|2312->1107|2340->1113|2724->1469|2749->1484|2777->1490|3247->1929|3280->1935
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|43->12|43->12|43->12|43->12|44->13|51->20|51->20|51->20|59->28|59->28|59->28|67->36|67->36|67->36|82->51|83->52
                  -- GENERATED --
              */
          