import org.scalatest._

class FuzzBuzzPrinterSpec extends FlatSpec with Matchers {

  "FuzzBuzzPrinter" should """print a number for non multiples of 3, 5 or 15""" in {
    val output = FuzzBuzzPrinter.getOutput(List(1,2,4,7,8,11,13,14,16,17))
    output shouldEqual "1 2 4 7 8 11 13 14 16 17"
  }

  it should """print "fuzz" for multiples of 3""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 7).toList)
    output shouldEqual "1 2 fuzz 4 buzz fuzz 7"
  }

  it should """print "fuzz" for multiples of 3 only""" in {
    val output = FuzzBuzzPrinter.getOutput(List(3,6,9,12,18))
    output shouldEqual "fuzz fuzz fuzz fuzz fuzz"
  }

  it should """print "buzz" for multiples of 5""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 10).toList)
    output shouldEqual "1 2 fuzz 4 buzz fuzz 7 8 fuzz buzz"
  }

  it should """print "buzz" for multiples of 5 only""" in {
    val output = FuzzBuzzPrinter.getOutput(List(5, 10, 20, 25, 35))
    output shouldEqual "buzz buzz buzz buzz buzz"
  }

  it should """print "fuzzbuzz" for multiples of 15""" in {
    val output = FuzzBuzzPrinter.getOutput((1 to 17).toList)
    output shouldEqual "1 2 fuzz 4 buzz fuzz 7 8 fuzz buzz 11 fuzz 13 14 fuzzbuzz 16 17"
  }

  it should """print "fuzzbuzz" for multiples of 15 only""" in {
    val output = FuzzBuzzPrinter.getOutput(List(15, 30, 45, 60))
    output shouldEqual "fuzzbuzz fuzzbuzz fuzzbuzz fuzzbuzz"
  }

  it should """print "fuzz" "buzz" and "fuzzbuzz" for random multiples of 3, 5 and 15 only""" in {
    val output = FuzzBuzzPrinter.getOutput(List(3, 6, 5, 12, 15, 30, 45, 60, 10))
    output shouldEqual "fuzz fuzz buzz fuzz fuzzbuzz fuzzbuzz fuzzbuzz fuzzbuzz buzz"
  }


}

