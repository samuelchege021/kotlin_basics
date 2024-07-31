fun main() {
    val num1:Int=101
    val num2:Long=num1.toLong()
     var num3:Float=num1.toFloat()

    var num4:Int=num1.toInt()
    var num5:Double=num1.toDouble()
    var num6:Char=num1.toChar()
    var num7:Byte=num1.toByte()
    var num8:Short=num1.toShort()
    println(num2)
    println(num3)
    println(num4)
    println(num5)
    println(num6)
    println(num8)
}


//
//**
//* created by Chaitanya for Beginnersbook.com
//*/
//package beginnersbook

fun main(args : Array<String>){

    /**
     * Double to int type casting
     */
    println("4.554 to int: " + (4.554.toInt()))

    /**
     * int to Char type casting
     */
    println("66 to Char: " + (65.toChar()))

    /**
     * Char to int type casting
     */
    println("B to int: " + ('B'.toInt()))
}