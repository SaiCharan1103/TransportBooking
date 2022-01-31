import java.io.File
import java.io.PrintWriter
import scala.io.Source

object readfile {
  def main(args: Array[String]): Unit = {
    println("The following is content which is read: ")
    val FileObj=new File("abc.txt" )
    val print_Writer = new PrintWriter(FileObj)
    print_Writer.write(" How are you? ")
    print_Writer.write(" which language are you learning? ")
    print_Writer.write(" Hello ")
    print_Writer.write(123)
    print_Writer.write(144)
    print_Writer.close()
    val fname = "abc.txt"
    val fSource = Source.fromFile(fname)
    for(line<-fSource.getLines.toArray)
    {
      println(line)
    }
    fSource.close()
  }
}
