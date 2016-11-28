import org.scalatest._

class FuzzBuzzPrinterSpec extends FlatSpec with Matchers {


  "FuzzBuzzPrinter" should """print a number for a given number input""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 15).toList)
    output shouldEqual "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"
  }

  it should """print "fuzz" for multiples of 3""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 15).toList)
    output shouldEqual "1 2 fuzz 4 5 fuzz 7 8 fuzz 10 11 fuzz 13 14 fuzz"
  }

  it should """print "buzz" for multiples of 5""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 15).toList)
    output shouldEqual "1 2 fuzz 4 buzz fuzz 7 8 fuzz buzz 11 fuzz 13 14 fuzz"
  }

}

