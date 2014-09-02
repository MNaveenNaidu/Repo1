package week4
//Functions with call By value

object callByName  {
def main(args:Array[String]){
  delayed(time())
}
def time()={
  println("time in nan0 seconds")
  System.nanoTime
}
def delayed(t : =>Long)={
  println("In delayed method")
  println(":Param:"+t)
  t
}
}