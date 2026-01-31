object Main extends App {

  println("=== MySum ===")
  println("MySum(List(1, 2, 3, 4)) = " + Functions.MySum(List(1, 2, 3, 4)))
  println("MySum(List(-2, 5, 0)) = " + Functions.MySum(List(-2, 5, 0)))
  println("MySum(Nil) = " + Functions.MySum(Nil))

  println()
  println("=== MyRange ===")
  println("MyRange(1, 5) = " + Functions.MyRange(1, 5))
  println("MyRange(3, 3) = " + Functions.MyRange(3, 3))
  println("MyRange(5, 1) = " + Functions.MyRange(5, 1))
}
