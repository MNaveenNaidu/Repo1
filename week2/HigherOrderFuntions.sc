object HigherOrderFuntions {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else sum(f, a + 1, b) //> sum: (f: Int => Int, a: Int, b: Int)Int

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  //> sumInts: (a: Int, b: Int)Int
  def sumCube(a: Int, b: Int): Int = sum(cube, a, b)
  //> sumCube: (a: Int, b: Int)Int
  def sumfact(a: Int, b: Int): Int = sum(fact, a, b)
  //> sumfact: (a: Int, b: Int)Int

  def id(x: Int): Int = x //> id: (x: Int)Int
  def cube(x: Int): Int = x * x * x //> cube: (x: Int)Int
  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
  //> fact: (x: Int)Int

  sumInts(4, 6) //> res0: Int = 0
  sumCube(4, 7) //> res1: Int = 0

}