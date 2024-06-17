package practical_1

object q5 {
  def pace(distance:Int):Double={
    val speed = 8
    8*distance
  }
  def tempo(distance:Int):Double={
    val speed = 7
    7*distance
  }

  def main(args:Array[String]):Unit={
    var totTime = pace(2)+pace(5)+tempo(3)

    var hours = totTime.toInt / 60
    var mins = totTime.toInt % 60

    println("The total running time is "+hours+" hours and "+mins+" mins")
  }
}
