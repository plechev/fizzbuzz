import org.scalatest._

class FizzBuzzPrinterSpec extends FlatSpec with Matchers {

  "FizzBuzzPrinter" should """print a number for non multiples of 3, 5 or 15 or containing digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput(List(1, 2, 4, 7, 8, 11, 14, 16, 17))
    output shouldEqual "1 2 4 7 8 11 14 16 17"
  }

  it should """print "fizz" for multiples of 3 but not containing digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 7).toList.filter(!_.toString.contains('3')))
    output shouldEqual "1 2 4 buzz fizz 7"
  }

  it should """print "fizz" for multiples of 3 only and including digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput(List(3, 6, 9, 12, 18))
    output shouldEqual "lucky fizz fizz fizz fizz"
  }

  it should """print "buzz" for multiples of 5 but not containing digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 10).toList.filter(!_.toString.contains('3')))
    output shouldEqual "1 2 4 buzz fizz 7 8 fizz buzz"
  }

  it should """print "buzz" for multiples of 5 only and including digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput(List(5, 10, 20, 25, 35))
    output shouldEqual "buzz buzz buzz buzz lucky"
  }

  it should """print "fizzbuzz" for multiples of 15 but not containing digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput((1 to 20).toList.filter(!_.toString.contains('3')))
    output shouldEqual "1 2 4 buzz fizz 7 8 fizz buzz 11 fizz 14 fizzbuzz 16 17 fizz 19 buzz"
  }

  it should """print "fizzbuzz" for multiples of 15 only and including digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput(List(15, 30, 45, 60))
    output shouldEqual "fizzbuzz lucky fizzbuzz fizzbuzz"
  }

  it should """print "fizz" "buzz" and "fizzbuzz" for random multiples of 3, 5 and 15 only and including digit '3'""" in {
    val output = FizzBuzzPrinter.getOutput(List(3, 6, 5, 12, 15, 30, 45, 60, 10))
    output shouldEqual "lucky fizz buzz fizz fizzbuzz lucky fizzbuzz fizzbuzz buzz"
  }

  it should "produce report for tokens occurrences" in {
    val output = FizzBuzzPrinter.getOutput((1 to 20).toList)
    output shouldEqual "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
    val report = FizzBuzzPrinter.createReport(output)
    report should (
        include("fizz: 4") and
        include("buzz: 3") and
        include("fizzbuzz: 1") and
        include("lucky: 2") and
        include("integer: 10")
      )
  }


}

