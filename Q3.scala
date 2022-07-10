object Q3{
  def main(args: Array[String]): Unit ={
    println("Take home salary of the employee = RS "+ takehome_salary(40,30))
  }
  def working_hours(i:Int): Int ={
    250*i
  }
  def ot_hours(i:Int): Int ={
    85*i
  }
  def takehome_salary(x:Int, y:Int):Int={
    (working_hours(x)+ot_hours(y))*88/100 //deducting the salary
  }
}
