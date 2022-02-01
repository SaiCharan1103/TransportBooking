import scala.collection.mutable.ArrayBuffer

object makeCSV extends App {

    val rows = ArrayBuffer[Array[String]]()

    // Read the CSV data
    using(io.Source.fromFile("abcd.csv")){ source =>
      for (line <- source.getLines){
        rows +=line.split(",").map(_.trim)
      }
    }
    for (row <- rows){
      println(s"${row(0)} | ${row(1)} | ${row(2)} ")
    }

    def using[A <: {def close(): Unit}, B](resource: A)(f: A=> B): B=
      try {
        f(resource)
      }finally {
        resource.close()
      }

  }