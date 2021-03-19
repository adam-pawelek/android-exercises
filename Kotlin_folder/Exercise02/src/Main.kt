

fun  sum(number1: Number, number2: Number): Number {
    return number1.toDouble() + number2.toDouble()
}


fun main(){

    val number1 = readLine()!!.toDouble()
    val number2 = readLine()!!.toDouble()
    println(sum(number1, number2))
}