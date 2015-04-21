import org.scalatest.WordSpec
import projectEuler._

class Problem1Spec extends WordSpec {
  "Problem1" should {
    "give the solution '233168'" in {
      val prob = new Problem1
      assert(prob.solution == 233168)
    }
  }
}
