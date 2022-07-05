package task3

fun main (){
    val totalPrice = 2000 * 100  // переведем руб в коп
    val discountStart = 1_000 * 100
    val discountUp10 = 10_000 * 100
    val discount1 = 100 * 100
    val discount2 = 0.05
    val discount3 = 0.01
    val regularUser = true
    val result: Int = if (totalPrice > discountStart){
        if (totalPrice > discountUp10){
            if (regularUser) {
                (totalPrice * (1 - discount2) * (1 - discount3)).toInt()
            } else {
                (totalPrice * (1 - discount2)).toInt()
            }
        } else {
            if (regularUser) {
                ((totalPrice - discount1) * (1 - discount3)).toInt()
            } else {
                totalPrice - discount1
            }
        }
    } else {
        if (regularUser){
            (totalPrice * (1 - discount3)).toInt()
        } else totalPrice
    }
    println("Сумма с учетом скидки ${result / 100} руб ${result % 100} коп ")
}