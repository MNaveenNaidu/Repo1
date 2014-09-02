object Basics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sumInts1(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts1(a + 1, b)      //> sumInts1: (a: Int, b: Int)Int

  def cube(x: Int) = x * x                        //> cube: (x: Int)Int

  def sumInts2(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumInts2(a + 1, b)//> sumInts2: (a: Int, b: Int)Int

  sumInts2(4, 5)                                  //> res0: Int = 41
}