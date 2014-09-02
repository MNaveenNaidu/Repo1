package week3

object Rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = new Rational(4, 3)                     //> x  : Rationals = 4/3
  x.numer                                         //> res0: Int = 4
  x.denom                                         //> res1: Int = 3
  val y = new Rational(2, 3)                     //> y  : Rationals = 2/3
  x + y                                           //> res2: Rationals = 2/1
  x.neg                                           //> res3: Rationals = 4/-3
  val c = new Rational(1, 2)                     //> c  : Rationals = 1/2
  c - x                                           //> res4: Rationals = -5/6
  c + x                                           //> res5: Rationals = 11/6
  x < y                                           //> res6: Boolean = false
  x.max(c)                                        //> res7: Rationals = 4/3
}

class Rational(a: Int, b: Int) {
  private def gcd(u: Int, v: Int): Int = if (v == 0) u else gcd(v, u % v)
  private val g = gcd(a, b)
  def numer = a / g
  def denom = b / g

  def +(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  override def toString = numer + "/" + denom

  def neg = new Rational(-numer, denom)

  def - (that: Rational): Rational = this + that.neg
}