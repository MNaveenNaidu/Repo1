object Practice2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sum(a:Int)(b:Int)={
 
  val s=a+b
  println(s)
  }                                               //> sum: (a: Int)(b: Int)Unit
  
  val r=sum(2)(_)                                 //> r  : Int => Unit = <function1>
  r(3)                                            //> 5

}