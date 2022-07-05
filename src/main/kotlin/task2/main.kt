package task2

fun main(){
    val likes = 101
    println("Понравилось $likes ${people(likes)}")
}

fun people (likes: Int): String {
    if (likes % 10 == 1) return "человеку"
    else return "людям"
}