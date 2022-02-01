

object Collections {

  def testSeq():Unit={
    val aSequence=Seq(5,1,2,3,4)
    val thirdElement=aSequence.apply(2)
    val reversed=aSequence.reverse
    val concatenation=aSequence ++ Seq(5,6,7)
    val sortedSequence=aSequence.sorted
    println(aSequence)
    println(concatenation)
    println(sortedSequence)
    println (reversed)
  }
  def testList():Unit={
    val aList =List(1,2,3)
    val firstElem=aList.head
    val rest =aList.tail
    val aBiggerList=0+:aList:+4
    println(aBiggerList)
    println("The list is Empty: " +aList.isEmpty)
  }
  def testSet():Unit={
    val fruit = Set("banana", "oranges", "pears")
    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
  }
  def testMap():Unit={
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
  }
  val t=(1,2,3,4)
  t.productIterator.foreach{i=>println("Value= "+i)}

  val t1 = new Tuple2(1, "hello")
  println("Concatenated String: " + t1.toString())
  println("Swapping: "+t1.swap)



  def main(args: Array[String]): Unit = {
//    testList()
//    testSeq()
//    testSet()
//    testMap()
    println(t1)
  }
}
