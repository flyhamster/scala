package Problem_1_10

object Problem_2 {

  def main(args: Array[String]): Unit = {
    var a = 1
    var b = 2
    var sum = 0
    for (i <- 2 to 4000000; if (b <= 4000000)) {
      if (b % 2 == 0) {
        sum += b
      }
      b += a
      a = b - a
    }
    println(sum)
  }
}