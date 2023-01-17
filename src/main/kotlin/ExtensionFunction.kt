fun String.hello() :String = "Hello $this"

fun main() {
    var name = "Steve"
    var hello:String = name.hello()

    println(hello)
}