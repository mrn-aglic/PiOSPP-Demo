package demo

import scala.io.Source

object ReadFromFile {
	def readFromFile() : Unit = {
	  
	  println("Sadr�aj datoteke je: ")
	  
	  Source.fromFile("demo.txt").foreach{
	    print
	  }
	}
}