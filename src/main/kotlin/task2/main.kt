package task2

fun main(){
    val likes = 101
    println("Понравилось $likes ${people(likes)}")
}

fun people (likes: Int): String {
    if (likes % 100 == 11) return "людям"
    if (likes % 10 == 1) return "человеку"
    else return "людям"
}