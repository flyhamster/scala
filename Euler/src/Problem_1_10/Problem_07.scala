package Problem_1_10

import scala.util.control.Breaks._

object Problem_7 {
    val LimitValue: Long = 99999999990L
    def main(args: Array[String]): Unit = {
        var array = new Array[Int](math.sqrt(LimitValue).toInt)
        for (i <- 2 until array.length; if (array(i) != -1)) {
            for (j <- i + i until array.length by i) {
                array(j) = -1
            }
        }

        var temp = 0;
        breakable {
            for (i <- 2 until array.length; if (array(i) != -1)) {
                temp += 1
                if (temp == 10001) {
                    println(i)
                    break
                }
            }
        }
    }
}