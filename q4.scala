package practical_1

object q4 {
  def discount(price:Double,discountPercentage:Double):Double={
    var dis = price*discountPercentage
    return price - dis;
  }

  def totalPrice(price:Double,disPercentage:Double,numOfCopies:Int):Double={
    var disPrice = discount(price,disPercentage)
    disPrice*numOfCopies
  }

  def shipping(numOfCopies:Int):Double={
    val first50 = 3.0
    val additional = 0.75

    if(numOfCopies <= 50){
      first50
    } else{
      val additonalCopies = numOfCopies - 50
      first50 + additonalCopies*additional
    }
  }

  def main(args:Array[String]):Unit={
    val coverPrice = 24.95
    val discountPercentage = 0.40
    val numberOfCopies = 60

    var total = totalPrice(coverPrice,discountPercentage,numberOfCopies)
    var shippingPrice = shipping(numberOfCopies)

    var totalAmount = total + shippingPrice
    println("Total whole sale cost for 60 copies : " + totalAmount)

  }
}
