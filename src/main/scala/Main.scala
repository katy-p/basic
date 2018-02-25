object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val four: Int = 2+2

    for {
      elem <- args
    } println(s"Hello $elem!")
  }
}
