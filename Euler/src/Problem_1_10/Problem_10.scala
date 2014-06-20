package Problem_1_10

object Problem_10 {
    val LimitValue = 2000000
    def main(args: Array[String]): Unit = {
        var array = new Array[Int](LimitValue)
        for (i <- 2 until array.length; if (array(i) != -1)) {
            for (j <- i + i until array.length by i) {
                array(j) = -1
            }
        }

        var sum : Long = 0;
        for (i <- 2 until array.length; if (array(i) != -1)) {
            sum += i
        }
        println(sum)
    }
}