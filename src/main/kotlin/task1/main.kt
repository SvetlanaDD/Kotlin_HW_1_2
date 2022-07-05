package task1 // Денежные переводы

fun main() {
    val amount: Int = 5_000_00
    val fee: Int = calculateFee (amount)
    print ("Комиссия за перевод = $fee коп")
}

fun calculateFee (amount: Int): Int {
    val fee: Int = if((amount*0.0075).toInt() > 3500) {
        (amount*0.0075).toInt()
    } else 3500
    return fee
}