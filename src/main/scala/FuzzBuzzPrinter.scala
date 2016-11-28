

/**
  * @author Pavel Lechev <p.lechev@gmail.com>
  * @since 28/11/2016
  */
object FuzzBuzzPrinter {

  def getOutput(range: List[Int]): String = range.map { n =>
    n match {
      case v if v.toString.contains('3') => "lucky"
      case v if v % 15 == 0 => "fuzzbuzz" // at the top to avoid being caught by 3 & 5 multiples
      case v if v % 3 == 0 => "fuzz"
      case v if v % 5 == 0 => "buzz"
      case _ => n
    }
  } mkString " "

}


