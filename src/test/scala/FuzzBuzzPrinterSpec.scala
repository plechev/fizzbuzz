import org.scalatest._

class FuzzBuzzPrinterSpec extends FlatSpec with Matchers {


  "FuzzBuzzPrinter" should """print a number for a given number input""" in {
    val underTest = FuzzBuzzPrinter
    val output = underTest.getOutput((1 to 15))
    output shouldEqual "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"
  }

}

