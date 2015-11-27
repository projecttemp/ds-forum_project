
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/index.css")),format.raw/*8.102*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.102*/("""">
        <!-- <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.64*/routes/*10.70*/.Assets.versioned("images/favicon.png")),format.raw/*10.109*/(""""> -->
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/index.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
    </head>
    <body class="main_body">
        <div id="page_title">
            <h1>Distributed Computing Forum</h1>
        </div>
        
        <div id="new_post">
            <a href="./post" target="_parent"> 
                <button class="new_post_button">New Post</button>
            </a>
        </div>
        
        <div class="all_posts">
            <h2>Posts:</h2>
            """),_display_(/*26.14*/if(Application.posts.size() == 0)/*26.47*/ {_display_(Seq[Any](format.raw/*26.49*/("""
                """),format.raw/*27.17*/("""<h3>Not A Single Post To Be Found...</h3>
            """)))}),format.raw/*28.14*/("""
            """),_display_(/*29.14*/for(post <- Application.posts) yield /*29.44*/ {_display_(Seq[Any](format.raw/*29.46*/("""
                """),format.raw/*30.17*/("""<p class="post_main">
                    <span class = "post_id">("""),_display_(/*31.47*/post/*31.51*/.id),format.raw/*31.54*/(""")&emsp;</span>
                    <span class = "post_title">"""),_display_(/*32.49*/post/*32.53*/.title),format.raw/*32.59*/("""</span>
                    <br>
                    <span class = "post_user_general">by: <span class = "post_user_specific">"""),_display_(/*34.95*/post/*34.99*/.owner),format.raw/*34.105*/("""</span></span>
                    <br>
                    <br>
                    <span class = "post_content">""""),_display_(/*37.52*/post/*37.56*/.content),format.raw/*37.64*/(""""</span>
                    <br>
                    <br>
                    <span class = "post_comments_title">Comments:</span>
                    <br>
                    """),_display_(/*42.22*/if(Application.comments.size() == 0)/*42.58*/ {_display_(Seq[Any](format.raw/*42.60*/("""
                    
                    """)))}/*44.23*/else/*44.28*/{_display_(Seq[Any](format.raw/*44.29*/("""
                        """),_display_(/*45.26*/for(comment <- Application.comments.get(post.id)) yield /*45.75*/ {_display_(Seq[Any](format.raw/*45.77*/("""
                            """),_display_(/*46.30*/if(comment.mainID == post.id)/*46.59*/ {_display_(Seq[Any](format.raw/*46.61*/("""
                                """),format.raw/*47.33*/("""<span class = "post_comment_full">
                                    <span class = "post_comment_user">"""),_display_(/*48.72*/comment/*48.79*/.owner),format.raw/*48.85*/(""": </span>
                                    <span class = "post_comment_content">""""),_display_(/*49.76*/comment/*49.83*/.content),format.raw/*49.91*/(""""</span>
                                    <br/>
                                </span>    
                            """)))}),format.raw/*52.30*/("""
                        """)))}),format.raw/*53.26*/("""
                    """)))}),format.raw/*54.22*/("""
                    """),format.raw/*55.21*/("""<br>
                    <form action=""""),_display_(/*56.36*/routes/*56.42*/.Application.newCommentClick(post.id)),format.raw/*56.79*/("""">
                        <input class="new_comment_button" type="submit" value="Add Comment">
                    </form>
                    
                    <br>
                    <br>
                </p>
            """)))}),format.raw/*63.14*/("""
        """),format.raw/*64.9*/("""</div>
        
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 27 02:56:16 EST 2015
                  SOURCE: C:/Users/100481892/ds-forum_project/app/views/main.scala.html
                  HASH: ea62d78c2a31bde6d2342191cced674ac6e48108
                  MATRIX: 743->1|853->16|883->20|974->85|999->90|1088->153|1102->159|1165->201|1249->259|1263->265|1325->306|1419->373|1434->379|1495->418|1552->448|1567->454|1629->495|2106->945|2148->978|2188->980|2234->998|2321->1054|2363->1069|2409->1099|2449->1101|2495->1119|2591->1188|2604->1192|2628->1195|2719->1259|2732->1263|2759->1269|2915->1398|2928->1402|2956->1408|3102->1527|3115->1531|3144->1539|3354->1722|3399->1758|3439->1760|3503->1806|3516->1811|3555->1812|3609->1839|3674->1888|3714->1890|3772->1921|3810->1950|3850->1952|3912->1986|4046->2093|4062->2100|4089->2106|4202->2192|4218->2199|4247->2207|4405->2334|4463->2361|4517->2384|4567->2406|4635->2447|4650->2453|4708->2490|4975->2726|5012->2736
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|57->26|57->26|57->26|58->27|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|65->34|65->34|68->37|68->37|68->37|73->42|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|83->52|84->53|85->54|86->55|87->56|87->56|87->56|94->63|95->64
                  -- GENERATED --
              */
          