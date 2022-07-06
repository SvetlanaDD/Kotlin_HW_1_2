package task3

fun main (){
    val totalPrice = 11000 * 100  // переведем руб в коп
    val discountStart = 1_000 * 100
    val discountUp10 = 10_000 * 100
    val discount1 = 100 * 100
    val discount2 = 0.05
    val discount3 = 0.01
    val regularUser = true
    var result: Int

    if (totalPrice > discountStart){
        if (totalPrice > discountUp10) result = (totalPrice * (1 - discount2)).toInt()
        else result = totalPrice - discount1
    } else result = totalPrice

    if (regularUser) result *= (1 - discount3).toInt()

    println("Сумма с учетом скидки ${result / 100} руб ${result % 100} коп ")
}