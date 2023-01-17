fun main() {
    val printNameToUppercase :(String) ->String = { value:String->value.toUpperCase() }
//    lowercase
    val printNameToLowercase :(String) ->String = {
        it.toLowerCase() }

    println(printNameToUppercase("Steve"))
    println(printNameToLowercase("STEVE"))
}