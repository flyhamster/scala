/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package Problem_1_10

import scala.collection.mutable.ArrayBuffer

object Problem_05 {
    def main(args: Array[String]): Unit = {
        var result: Long = 1
        for (i <- 2 to 10) {
            result = lcm(result, i);
        }
        println(result);
    }

    def lcm(a: Long, b: Long): Long = {
        return (a * b) / gcd(a, b)
    }

    def gcd(a: Long, b: Long): Long = {
        if (b == 0) {
            return a
        } else {
            gcd(b, a % b)
        }
    }
}