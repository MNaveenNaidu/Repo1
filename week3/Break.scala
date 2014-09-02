package week3
import scala.util.control._

object Break  {
def main(args:Array[String]){
  var a = 0;
  val numlist=List(1,2,3,4,5,6,7,8)
  val loop=new Breaks
  loop.breakable{
  for(a <- numlist){
    println("Values of a  ==/t"  + a)
      if(a==4){
        loop.break
      }
    }
  }
  println("Kya be chote");
}
}
