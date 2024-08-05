import scala.annotation.nowarn

val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

@nowarn
def filterPrime(list: List[Int]): List[Int] = {
  def checkPrime(n: Int): Boolean = {
    if (n <= 1) false

    for (i <- 2 until n) {
      if (n % i == 0) return false
    }

    true
  }

  list.filter(n => checkPrime(n))
}

@main
def main() = {

  val primeNum = filterPrime(numList)

  println(primeNum)
}
