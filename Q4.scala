object Q4 {
  def main(args: Array[String]): Unit={
    val Profit = profit(25)
    println("Highest Profit ="+ Profit)
    println("Best ticket price = " + 25)
  }

  def attendees(i: Int): Int={
    120+(15-i)/5*20
  }

  def revenue(i: Int): Int={
    attendees(i)*i
  }

  def cost(i: Int): Int={
    500+3*attendees(i)
  }

  def profit(i: Int): Int={
    revenue(i)-cost(i)
  }

}
