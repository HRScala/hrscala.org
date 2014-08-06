package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

case class GenerateForms(slickDriver: String, outputFolder: String, pkg: String, schema: Option[String])

object Application extends Controller {

  def index = Action {
    Redirect("http://meetup.com/hrscala")
  }

  def deepIndex(ignored: String) = Action {
    Redirect("http://meetup.com/hrscala")
  }

}