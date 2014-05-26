/*
 *Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. 
 */
package Problem_1_10

object Problem_2 {

  def main(args: Array[String]): Unit = {
    var a = 1
    var b = 2
    var sum = 0
    while (b <= 4000000) {
      if (b % 2 == 0) sum += b
      b += a
      a = b - a
    }

    println(sum)
  }
}