object Main extends App {

  val test = Vector(5, 2, 8, 1, 9, 3, 7, 4, 6)
  val withDuplicates = Vector(5, 2, 2, 8, 1, 1, 9, 3, 3)

  println("=== Merge Sort ===")
  println("Input:  " + test)
  println("Output: " + Sorting.mergeSort(test))

  println()
  println("=== Top-N Sort (N=3) ===")
  println("Input:  " + test)
  println("Top 3:  " + Sorting.topN(test, 3))
  println("Check:  " + test.sorted.take(3))

  val dups = Vector(5, 1, 1, 2, 8, 1, 9)
  println()
  println("With duplicates: " + dups)
  println("Top 3:  " + Sorting.topN(dups, 3))
  println("Check:  " + dups.sorted.take(3))

  println()
  println("=== Unique Merge Sort ===")
  println("Input:  " + withDuplicates)
  println("Output: " + Sorting.uniqueMergeSort(withDuplicates))
}
