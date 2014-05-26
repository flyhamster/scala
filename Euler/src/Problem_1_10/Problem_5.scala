/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package Problem_1_10

import scala.collection.mutable.ArrayBuffer

object Problem_5 {

  def main(args: Array[String]): Unit = {

    var exponentArray = new Array[Int](20)
    for (i <- 2 to 10) {
      for (j <- 2 to i; if (i % j == 0); if (i >= j)) {

      }
    }
    getPrimeArray(10)
  }

  def getPrimeArray(num: Int): List[Int] = {
    var primeArray = Array(num + 1)
    for (i <- 2 until primeArray.length; if (primeArray(i) != -1)) {
      for (j <- i + i until primeArray.length by i) {
        primeArray(j) = -1
      }
    }

    var primeArrayBuffer = new ArrayBuffer[Int]()
//    for (k <- primeArray) {
//
//    }
    
//    primeArray.foreach(n => if(primeArray[n] != -1)) yield n
    
    
    
    
    
    //    for (k <- 2 until primeArray.length) {
    //      println(k + " : " + primeArray(k))
    //    }

    //    for(k <- 2 until pri)

//    return primeArrayBuffer
    return null
  }
}