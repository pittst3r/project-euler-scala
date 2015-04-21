import org.scalatest.WordSpec
import projectEuler._

class Problem2Spec extends WordSpec {
  "Problem2" should {
    "give the solution '4613732'" in {
      val prob = new Problem2
      assert(prob.solution == 4613732)
    }
  }
}
