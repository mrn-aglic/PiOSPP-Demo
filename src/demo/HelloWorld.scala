package demo

object HelloWorld {

  def main(args: Array[String]) : Unit = {
    println("Hello world!")
    
    print("Enter your name: ")
    var input = Console.readLine
    
    println("Welcome to Scala " + input)
    
    WriteToFile.writeToFile(input)
    
    ReadFromFile.readFromFile()
  }

}