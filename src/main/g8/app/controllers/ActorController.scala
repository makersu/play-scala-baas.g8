package controllers

import javax.inject._

import actors.HelloActor
import actors.HelloActor.SayHello
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc._

//import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

@Singleton
class ActorController @Inject() (system: ActorSystem) extends Controller {

  val helloActor = system.actorOf(HelloActor.props, "hello-actor")

//  implicit val timeout: Timeout = 5.seconds
  implicit val timeout = Timeout(5 seconds)

  def sayHello(name: String) = Action.async {
    (helloActor ? SayHello(name)).mapTo[String].map { message =>
      Ok(message)
    }
  }

}
