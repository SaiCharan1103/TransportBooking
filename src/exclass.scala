object exclass {
  def main(args: Array[String]): Unit = {
    case class Message(sender: String, recipient: String, body: String)
    val message1 = Message("Collections@scala.com", "traits@scala.com", "How much do you know?")
    println(message1.body)
    //Comparasion
    val message2=Message("abc@gmail.com","xyz@gmail.com","Hello ")
    val message3=Message("abc@gmail.com","xyz@gmail.com","Hello ")
    val messageAreSame=message2==message3
    println(messageAreSame)
    //copying
    val message4=Message("abc123@gmail.com","xyz789@gmail.com","Hello ")
    val message5=message4.copy(sender = message4.recipient,recipient = message2.recipient)
    println(message5.sender)
    println(message5.recipient)
  }
}