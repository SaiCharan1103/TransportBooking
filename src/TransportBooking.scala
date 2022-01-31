import java.time.LocalDate
import scala.util.Random

object TransportBooking {
    def main(args: Array[String]): Unit ={
      println("Welcome to Transport Booking app")
      val s=Random
      val d= LocalDate.now()
      println("The Avalaiable tickets are: " +s.nextInt(100))
      println("Which ticket you want to book(Bus,Train,Air): ")
      var ch:String=""
      ch=scala.io.StdIn.readLine().toLowerCase()
      ch match {
        case "bus" =>
          println("Enter your Bus Pickup Station? ")
          var bus: String = ""
          bus = scala.io.StdIn.readLine()
          println("Enter your Bus Dropout Station? ")
          var bus1: String = ""
          bus1 = scala.io.StdIn.readLine()

          bus match {
            case bus => println("Your Bus ticket is Booked from : " + bus +" to "+bus1+" on "+d)
            }
        case "train"=>
          println("Enter your Train Pickup Station?")
          var tr:String=""
          tr=scala.io.StdIn.readLine()
          println("Enter your Train Dropout Station?")
          var tr1: String = ""
          tr1=scala.io.StdIn.readLine()
          tr match{
            case tr=>println("Your Train ticket is Booked from: " +tr+" to "+tr1+" on "+d)
          }
        case "air"=>
          println("Enter your Air Pickup Station?")
          var air:String=""
          air=scala.io.StdIn.readLine()
          println("Enter your Air Dropout Station?")
          var air1:String=""
          air1=scala.io.StdIn.readLine()
          air match{
            case air=>println("Your Air ticket is Booked from: " +air+" to "+ air1+" on "+d)
          }
        case _=>println("Invalid Input")
      }
    }
  }