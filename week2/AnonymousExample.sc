object AnonymousExample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sumInts1(f:Int=> Int, a: Int, b: Int): Int = {
    def loop(acc: Int, a: Int ): Int =
      if (a > b) acc else loop(f(a)+acc, a + 1)
      loop(0,a)
    

  }                                               //> sumInts1: (f: Int => Int, a: Int, b: Int)Int
  sumInts1(x=>x*x,4,5)                            //> res0: Int = 41
}