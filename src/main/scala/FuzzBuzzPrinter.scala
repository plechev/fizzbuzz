

/**
  * @author Pavel Lechev <p.lechev@gmail.com>
  * @since 28/11/2016
  */
object FuzzBuzzPrinter {

  def getOutput(range: List[Int]): String = range.map { n =>
    n match {
      case v if v % 3 == 0 => "fuzz"
      case v if v % 5 == 0 => "buzz"
      case _ => n
    }
  } mkString " "

}


