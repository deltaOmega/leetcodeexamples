import org.scalatest.{FlatSpec, Matchers}

class AddArrayToFormTest extends FlatSpec with Matchers {

  it should "pass the addtoform" in {

   AddArrayToForm.addToArrayForm(Array(1,2,0,0), 34) should contain theSameElementsAs List(1,2,3,4)
   AddArrayToForm.addToArrayForm(Array(2,7,4), 181) should contain theSameElementsAs List(4,5,5)
   AddArrayToForm.addToArrayForm(Array(2,1,5), 806) should contain theSameElementsAs List(1,0,2,1)
   AddArrayToForm.addToArrayForm(Array(9,9,9,9,9,9,9,9,9,9), 1) should contain theSameElementsAs List(1,0,0,0,0,0,0,0,0,0,0)

   /* Input: A = [1,2,0,0], K = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234
    Example 2:

      Input: A = [2,7,4], K = 181
    Output: [4,5,5]
    Explanation: 274 + 181 = 455
    Example 3:

      Input: A = [2,1,5], K = 806
    Output: [1,0,2,1]
    Explanation: 215 + 806 = 1021
    Example 4:

      Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
    Output: [1,0,0,0,0,0,0,0,0,0,0]
    Explanation: 9999999999 + 1 = 10000000000*/

  }

}