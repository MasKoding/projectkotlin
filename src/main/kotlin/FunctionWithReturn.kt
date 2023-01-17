// fun hitung luasPersegiPanjang

fun luasPersegiPanjang(panjang:Float,lebar:Float) :Float{
    return panjang*lebar
}
//return type
fun hello(msg:String) :String{
    return msg
}
fun main() {
    val luas = luasPersegiPanjang(5f,2f)
    val msg = hello("Hello return string")
    println("Luas : $luas")
    println(msg)

}

