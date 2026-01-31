object Functions {

  def MySum(a: List[Int]): Int = {
    a.foldLeft(0)((acc, x) => acc + x)
  }

  def MyRange(n: Int, m: Int): List[Int] = {
    (n, m) match {
      case (n, m) if n > m => Nil
      case (n, m) if n == m => List(n)
      case (n, m) => n :: MyRange(n + 1, m)
    }
  }
}
