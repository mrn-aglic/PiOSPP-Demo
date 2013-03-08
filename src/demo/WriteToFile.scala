package demo

import java.io._

object WriteToFile {
   def writeToFile(input: String) = {
      
     val writer = new PrintWriter(new File("demo.txt"))
     
     writer.write(input)
     writer.close()
   }
}