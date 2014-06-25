package Problem_11_20

object Problem_12 {
    def main(args: Array[String]): Unit = {
        var count = 0
        var triangularNum = 0
        var k = 1
        while (count < 5) {
            count = 0
            triangularNum += k
            k += 1
            var array = new Array[Int](triangularNum)
            for (i <- 2 until array.length; if (array(i) != -1)) {
                for (j <- i + i until array.length by i) {
                    array(j) = -1
                }
            }
            
            for (value <- array; if (value != -1)) {
                count += 1
            }
        }
        println(triangularNum)
    }
}