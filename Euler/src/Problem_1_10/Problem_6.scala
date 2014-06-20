package Problem_1_10

object Problem_6 {
    def main(args: Array[String]): Unit = {
        var squareOfSum: Long = 0
        var sumOfSquare: Long = 0
        for (i <- 1 to 100) {
            squareOfSum += i
            sumOfSquare += i * i
        }
        println(squareOfSum * squareOfSum - sumOfSquare)
    }
}