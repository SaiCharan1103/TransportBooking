object cmdtest {
  def main(args: Array[String]): Unit = {
    println("Scala Command Line Argument Example")
    for (a <- args)
      try {
        Integer.parseInt(a)
        println("The CLI argument is Integer: " + a)
      } catch {
        case e: Exception => println("The CLI argument is a String: " + a)
      }
  }
}
//    def isNumber(s: String): Boolean = {
//      for (i <- 0 until s.length) {
//        if (!Character.isDigit(s.charAt(i))) return false
//      }
//      true
//    }
//    for (str <- args) {
//      println(str)
//    }
//    val str = "hello Testing cmd"
//    if (isNumber(str)) println("Integer")
//    else {
//      println("String")
//    }
//  }
//}