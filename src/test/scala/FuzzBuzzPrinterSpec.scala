import org.scalatest._

class FizzBuzzPrinterSpec extends FlatSpec with Matchers {

  "FizzBuzzPrinter" should """print a number for non multiples of 3, 5 or 15""" in {
    val output = FizzBuzzPrinter.getOutput(List(1,2,4,7,8,11,13,14,16,17))
    output shouldEqual "1 2 4 7 8 11 13 14 16 17"
  }

  it should """print "fizz" for multiples of 3""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 7).toList)
    output shouldEqual "1 2 fizz 4 buzz fizz 7"
  }

  it should """print "fizz" for multiples of 3 only""" in {
    val output = FizzBuzzPrinter.getOutput(List(3,6,9,12,18))
    output shouldEqual "fizz fizz fizz fizz fizz"
  }

  it should """print "buzz" for multiples of 5""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 10).toList)
    output shouldEqual "1 2 fizz 4 buzz fizz 7 8 fizz buzz"
  }

  it should """print "buzz" for multiples of 5 only""" in {
    val output = FizzBuzzPrinter.getOutput(List(5, 10, 20, 25, 35))
    output shouldEqual "buzz buzz buzz buzz buzz"
  }

  it should """print "fizzbuzz" for multiples of 15""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 20).toList)
    output shouldEqual "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
  }

  it should """print "fizzbuzz" for multiples of 15 only""" in {
    val output = FizzBuzzPrinter.getOutput(List(15, 30, 45, 60))
    output shouldEqual "fizzbuzz fizzbuzz fizzbuzz fizzbuzz"
  }

  it should """print "fizz" "buzz" and "fizzbuzz" for random multiples of 3, 5 and 15 only""" in {
    val output = FizzBuzzPrinter.getOutput(List(3, 6, 5, 12, 15, 30, 45, 60, 10))
    output shouldEqual "fizz fizz buzz fizz fizzbuzz fizzbuzz fizzbuzz fizzbuzz buzz"
  }

  it should """print "lucky" if number contains the digit '3' """ in {
    val output = FizzBuzzPrinter.getOutput((1 to 20).toList)
    output shouldEqual "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
  }


}

