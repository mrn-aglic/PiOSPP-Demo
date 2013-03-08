package demo

import scala.io.Source

object ReadFromFile {
	def readFromFile() : Unit = {
	  
	  println("Sadržaj datoteke je: ")
	  
	  Source.fromFile("demo.txt").foreach{
	    print
	  }
	}
}