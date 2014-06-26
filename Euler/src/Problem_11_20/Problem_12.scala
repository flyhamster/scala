package Problem_11_20

object Problem_12 {
    def main(args: Array[String]): Unit = {
        var triangularNum = 1
        var k = 2
        while (getCount(triangularNum) < 500) {
            triangularNum += k
            k += 1
        }
        println(triangularNum)
    }

    def getCount(size: Int): Int = {
        var sqrt = math.sqrt(size).toInt
        var count = 2
        for (i <- 2 to sqrt; if (size % i == 0)) {
            count += 2
        }
        println("num : " + size + " sqrt : " + math.sqrt(size).toInt + " ---- " + count)
        return count
    }
}