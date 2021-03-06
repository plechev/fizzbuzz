

/**
  * @author Pavel Lechev <p.lechev@gmail.com>
  * @since 28/11/2016
  */
object FizzBuzzPrinter {

  def createReport(output: String): String = output.split(" ")
    .transform(s => if (s.forall(_.isDigit)) "integer" else s)
    .groupBy(k => k)
    .map { case (k, v) => "%s: %s" format(k, v.size) }
    .mkString("", "\n", "\n")

  def getOutput(range: List[Int]): String = range.map {
    case v if v.toString.contains('3') => "lucky"
    case v if v % 15 == 0 => "fizzbuzz" // at the top to avoid being caught by 3 & 5 multiples
    case v if v % 3 == 0 => "fizz"
    case v if v % 5 == 0 => "buzz"
    case n => n
  } mkString " "

}


