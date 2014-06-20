/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
package Problem_1_10

object Problem_4 {
    def main(args: Array[String]): Unit = {
        //    println(isSymmetry(9009))

        var max = 0
        for (i <- 999 to 100 by -1; j <- 999 to 100 by -1; if (isSymmetry(i * j)); if (max < i * j)) {
            max = i * j
            println("i : " + i + " j : " + j + " max : " + max)
        }
    }

    def isSymmetry(num: Int): Boolean = {
        var strNum = num.toString;
        var length = strNum.length()
        for (i <- 0 to length / 2; if (!strNum.charAt(i).equals(strNum.charAt(length - 1 - i)))) {
            return false
        }
        return true
    }
}