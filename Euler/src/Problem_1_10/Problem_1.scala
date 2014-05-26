/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package Problem_1_10

object Problem_1 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (b <- 0 to 9; c <- 0 to 9; d <- 0 to 9) {
      if ((b + c + d) % 3 == 0) {
        sum += (b + "" + c + "" + d).toInt
      } else if (d % 5 == 0) {
        sum += (b + "" + c + "" + d).toInt
      }
    }
    println(sum)
  }
}