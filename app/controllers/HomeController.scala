package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class HomeController @Inject() (
    cc: ControllerComponents
)
  extends AbstractController(cc) {

    val mbs = 300
    val size = 1024 * 1024 * mbs

    val array = scala.util.Random.nextBytes(size)

  def hi = Action {
    Ok(s"Stored an array of ${mbs}MB: ${array(size - 1)}")
  }
}
