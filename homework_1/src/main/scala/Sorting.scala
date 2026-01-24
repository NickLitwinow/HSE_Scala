import scala.collection.mutable.PriorityQueue

object Sorting {

  def mergeSort(vec: Vector[Int]): Vector[Int] = {
    if (vec.length <= 1) {
      vec
    } else {
      val mid = vec.length / 2
      val left = vec.take(mid)
      val right = vec.drop(mid)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  private def merge(left: Vector[Int], right: Vector[Int]): Vector[Int] = {
    var result = Vector[Int]()
    var i = 0
    var j = 0

    while (i < left.length && j < right.length) {
      if (left(i) <= right(j)) {
        result = result :+ left(i)
        i = i + 1
      } else {
        result = result :+ right(j)
        j = j + 1
      }
    }

    while (i < left.length) {
      result = result :+ left(i)
      i = i + 1
    }

    while (j < right.length) {
      result = result :+ right(j)
      j = j + 1
    }

    result
  }

  def topN(vec: Vector[Int], n: Int): Vector[Int] = {
    if (n <= 0) {
      Vector()
    } else if (n >= vec.length) {
      vec.sorted
    } else {
      val heap = PriorityQueue[Int]()
      
      for (elem <- vec) {
        if (heap.size < n) {
          heap.enqueue(elem)
        } else if (elem < heap.head) {
          heap.dequeue()
          heap.enqueue(elem)
        }
      }
      
      heap.dequeueAll.toVector.sorted
    }
  }

  def uniqueMergeSort(vec: Vector[Int]): Vector[Int] = {
    if (vec.length <= 1) {
      vec
    } else {
      val mid = vec.length / 2
      val left = vec.take(mid)
      val right = vec.drop(mid)
      mergeUnique(uniqueMergeSort(left), uniqueMergeSort(right))
    }
  }

  private def mergeUnique(left: Vector[Int], right: Vector[Int]): Vector[Int] = {
    var result = Vector[Int]()
    var i = 0
    var j = 0

    while (i < left.length && j < right.length) {
      if (left(i) < right(j)) {
        if (result.isEmpty || result.last != left(i)) {
          result = result :+ left(i)
        }
        i = i + 1
      } else if (left(i) > right(j)) {
        if (result.isEmpty || result.last != right(j)) {
          result = result :+ right(j)
        }
        j = j + 1
      } else {
        if (result.isEmpty || result.last != left(i)) {
          result = result :+ left(i)
        }
        i = i + 1
        j = j + 1
      }
    }

    while (i < left.length) {
      if (result.isEmpty || result.last != left(i)) {
        result = result :+ left(i)
      }
      i = i + 1
    }

    while (j < right.length) {
      if (result.isEmpty || result.last != right(j)) {
        result = result :+ right(j)
      }
      j = j + 1
    }

    result
  }
}
