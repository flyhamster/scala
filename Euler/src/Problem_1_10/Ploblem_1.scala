package Problem_1_10

object Problem_1 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (b <- 0 to 9; c <- 0 to 9; d <- 0 to 9) {
      if ((b + c + d) % 3 == 0) {
        sum += (b + "" + c + "" + d).toInt
      } else if (d % 5 == 0) {
        sum += (b + "" + c + "" + d).toInt
      }
    }
    println(sum)
  }
}