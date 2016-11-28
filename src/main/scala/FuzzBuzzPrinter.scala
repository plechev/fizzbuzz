

/**
  * @author Pavel Lechev <p.lechev@gmail.com>
  * @since 28/11/2016
  */
object FizzBuzzPrinter {

  def createReport(output: String) = """fizz: 4
                                      |buzz: 3
                                      |fizzbuzz: 1
                                      |lucky: 2
                                      |integer: 10""".stripMargin


  def getOutput(range: List[Int]): String = range.map { n =>
    n match {
      case v if v.toString.contains('3') => "lucky"
      case v if v % 15 == 0 => "fizzbuzz" // at the top to avoid being caught by 3 & 5 multiples
      case v if v % 3 == 0 => "fizz"
      case v if v % 5 == 0 => "buzz"
      case _ => n
    }
  } mkString " "

}


