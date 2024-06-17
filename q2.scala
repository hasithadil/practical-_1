package practical_1

object q2 {
 def convert(cel: Double): Double={
   cel*1.8 + 32
 }
 def main(args:Array[String]): Unit={
   var far = convert(35)
   println("Celcius 35 equla to faranhite " + far)
 }
}
