package projectEuler

/** Problem 1
  *
  * If we list all the natural numbers below 10 that are multiples of 3 or 5,
  * we get 3, 5, 6 and 9. The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
class Problem1 {
  def solution = {
    val threes = 0 until 1000 by 3
    val fives = 0 until 1000 by 5
    threes.union(fives).distinct.sum
  }
}
