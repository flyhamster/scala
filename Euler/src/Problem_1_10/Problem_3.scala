/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
package Problem_1_10

import scala.util.control.Breaks._

object Problem_3 {
    def main(args: Array[String]): Unit = {
        var num = 600851475143L
        //    var num = 13195
        //    ex1(num)
        ex2(num)
        //    ex3(num)
        println("end")

    }

    def ex1(num: Long) = {
        var flag = true
        var max = 0

        for (i <- 3 to math.sqrt(num).toInt; if (num % i != 0)) {
            for (j <- 2 to i - 1; if (flag)) {
                //        println("i : " + i + " j : " + j)
                if (i % j == 0) {
                    flag = false
                }
            }

            if (flag) {
                max = i
            }
            flag = true
        }
        println(max)
    }

    def ex2(num: Long) = {
        var sqrtNum = math.sqrt(num).toInt
        var array = new Array[Int](sqrtNum)
        println("sqrtNum : " + sqrtNum)
        for (i <- 2 until array.length; if (array(i) != -1)) {
            for (j <- i + i until array.length by i) {
                array(j) = -1
            }
        }

        //    for (index <- 0 until array.length) {
        //      println(index + " : " + array(index))
        //    }

        breakable {
            for (max <- sqrtNum - 1 to 2 by -1; if (array(max) != -1); if (num % max == 0)) {
                println(max)
                break
            }
        }
    }

    def ex3(num: Long) = {
        var sqrtNum = math.sqrt(num).toInt
        for (i <- sqrtNum to 2 by -1; if (num % i == 0)) {
            println(i)
            break
        }
    }
}