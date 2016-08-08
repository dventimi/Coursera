package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c<0 || r<0 || c>r) 0 else
      if (c==0 || r==0 || c==r) 1 else
        pascal(c-1, r-1) + pascal(c, r-1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def iter (acc: Int, chars: List[Char]): Int =
      if (chars.isEmpty || acc<0) acc else
        iter(test(acc, chars), chars.tail)
    def test (acc: Int, chars: List[Char]): Int =
      if (chars.isEmpty) acc else
        if (chars.head=='(') acc + 1 else
          if (chars.head==')') acc -1 else
          acc
    if (iter(0, chars)<0) false else true
    }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
