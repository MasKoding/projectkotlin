
fun luasPP(panjang:Float,lebar:Float) :Float = panjang*lebar

fun luasLingkaran(r:Float) :Float = 3.14f*r*r

fun luas(msg:String) : Unit = println("$msg")


fun main() {
    luas("Persegi Panjang")
    println(luasPP(4f,5f))
    luas("Lingkaran")
    println(luasLingkaran(10f))
}