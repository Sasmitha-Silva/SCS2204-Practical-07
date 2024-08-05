val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def calculateSquare(list: List[Int]): List[Int] = {
  list.map(n => n * n)
}

@main
def main() = {

  val sqrList = calculateSquare(numList)

  println(sqrList)
}
