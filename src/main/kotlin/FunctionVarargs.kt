fun finalValue(name:String,vararg values:Int){
    var total = 0.0

    for (value in values){
        total+=value
    }
//    values.size  yaitu menghitung panjang atau ukuran array
    total /= values.size

    println("$name Rata-rata: $total")
}

fun main() {
    finalValue("Steve",10,9,8,7,6,7,7,8)
}
