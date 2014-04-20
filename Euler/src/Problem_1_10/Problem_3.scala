package Problem_1_10

object Problem_3 {

  def main(args: Array[String]): Unit = {
    var num = "600851475143".toLong
    var i = 3
    var continue = true
    while (continue) {
      if (num % i == 0) {
        for (j <- 2 to (num / i).toInt) {
        	if(){
        	  
        	}
        }

        println(num / i)
        continue = false
      } else {
        i += 2
      }
    }
  }
}