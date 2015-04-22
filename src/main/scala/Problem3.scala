package projectEuler

/** Problem 3
  *
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143?
  *
  */
class Problem3 {
  def solution = {
    val num = 600851475143L
    primes.takeWhile { (p) =>
      p <= num && num % p == 0
    }
  }

  def numbersFrom(start: Long): Stream[Long] = {
    start #:: numbersFrom(start + 1)
  }

  lazy val primes: Stream[Long] = {
    2L #:: numbersFrom(3).filter { (i) =>
      primes.takeWhile { (p) =>
        p * p <= i
      }.forall { (p) =>
        i % p > 0
      }
    }
  }
}
