val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def filterEvenNumbers(list: List[Int]): List[Int] = {
  list.filter(n => n % 2 == 0)
}

@main
def main() = {

  val evenNum = filterEvenNumbers(numList)

  println(evenNum)
}

// // Method 02

// // format: off
// val filterEvenNumbers = (numbers: List[Int]) => numbers.filter(num => num % 2 == 0)
// // format: on
