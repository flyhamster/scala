package Problem_1_10

object Problem_6 {
    val LimitValue = 100
    def main(args: Array[String]): Unit = {
        var squareOfSum: Long = 0
        var sumOfSquare: Long = 0
        for (i <- 1 to LimitValue) {
            squareOfSum += i
            sumOfSquare += i * i
        }
        println(squareOfSum * squareOfSum - sumOfSquare)
        another()
    }

    def another() = {
        var squareOfSum: Long = LimitValue * (LimitValue + 1) / 2
        var sumOfSquare: Long = LimitValue * (LimitValue + 1) * (2 * LimitValue + 1) / 6
        println(squareOfSum * squareOfSum - sumOfSquare)
    }
}