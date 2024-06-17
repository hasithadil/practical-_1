package practical_1

object q3 {
  def volume(radious: Double):Double={
    val p = math.Pi
    (4.0/3.0)*p*radious*radious*radious
  }

  def main(args:Array[String]): Unit={
    var vol = volume(5)
    println("The volume of sphere radious with 5 is :" + vol)
  }
}
