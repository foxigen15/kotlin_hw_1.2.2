fun main() {
    val likes = 1231
    val likesLength = likes.toString().length
    val penultimateNumber = if (likesLength > 1) likes.toString()[likesLength - 2] else '0'
    val ending = if (likes % 10 == 1 && penultimateNumber != '1') "человеку" else "людям"

    println("Понравилось: $likes $ending")
}