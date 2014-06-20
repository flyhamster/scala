package Problem_1_10

import scala.util.control.Breaks._

object Problem_09 {
    def main(args: Array[String]): Unit = {
        breakable {
            for (c <- 500 to 1 by -1; b <- 500 to 1 by -1; a <- 500 to 1 by -1; if (a + b + c == 1000); if ((a * a + b * b) == c * c)) {
                println(a * b * c)
                break
            }
        }
    }
}