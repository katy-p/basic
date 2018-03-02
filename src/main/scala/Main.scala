import katy.Adder

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val am: Adder = new Adder



    val four: Int = am.add(2,2)

    println(s"""Four = "$four" """)

    for {
      elem <- args
    } println(s"Hello $elem!")
  }
}
