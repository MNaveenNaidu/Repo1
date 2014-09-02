package week4

object NamedArguments  {
  def main(args:Array[String]){
    printInt(a=4,b=6)
  }
  def printInt(a:Int,b:Int)={
    println("Value of a " +a)
    println("value of b " +b)
  }

}