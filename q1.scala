package practical_1

object q1 {

  def area(radius: Double):Double={
    math.Pi*radius*radius
  }

  def main(args:Array[String]):Unit={
    var diskArea = area(5);
    println("The area of the disc is :" + diskArea)
  }
}
