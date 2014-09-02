package week4

object HigherOrderFuntions {
  def main(args:Array[String]){
    println(apply(layout,10))
  }
  def apply(f :Int => String,v:Int)=f(v)
  def layout[T](a:T)="[" + a.toString() + "]"

}