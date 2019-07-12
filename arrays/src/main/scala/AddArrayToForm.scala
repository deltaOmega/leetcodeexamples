object AddArrayToForm {
  def addToArrayForm(A: Array[Int], K: Int): List[Int] = {
    val N = A.length
    var cur = K
    var i = N - 1
    var l = scala.collection.mutable.ListBuffer[Int]()
    while(i >= 0 || cur > 0) {
      if(i >= 0) cur += A(i)
      l+= (cur % 10)
      cur /= 10
      i -= 1
    }
    l.reverse.toList
  }
}

