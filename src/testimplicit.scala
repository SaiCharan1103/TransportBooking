object testimplicit {
  def main(args: Array[String]): Unit = {
    val value = 11
    implicit val multiplier = 3
    def multiply(implicit by:Int)=value * by
    println(multiply)
    val message="hello "
    implicit val name="World!"
    def str(implicit mix:String)=message+mix
    println(str)
  }
}
