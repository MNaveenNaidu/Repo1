package week1
//Named functions
object Variable {
  def main(args:Array[String]){
    printString("lol","mohol","gandu")
  }
  def printString(args:String*)={
   var i:Int=0
   for(arg <-  args){
     println("Arg value[" +i +"]")
     i=i+1
   }
  }

}