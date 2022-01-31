object cmdtest {
  def main(args: Array[String]): Unit = {
    println("Scala Command Line Argument Example")

    def isNumber(s: String): Boolean = {
      for (i <- 0 until s.length) {
        if (!Character.isDigit(s.charAt(i))) return false
      }
      true
    }
    // Driver code
      val str = "54765"
    for(arg<-args)
    {
      println(arg)
    }

      if (isNumber(str)) println("Integer")
      else  {
        println("String")
      }
    }
  }