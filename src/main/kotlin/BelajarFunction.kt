//membuat function
fun hello(){
    println("Hello")
}
fun sayGoodBye(){
    println("Good Bye !")
}
fun sayHello(firstName:String,lastName:String=""){
    println("Hello $firstName $lastName")
}
// buat function untuk menampilkan brand mobil
// brand : Almaz  ->default tahun:2022
// year:2022
 fun showCar(brand:String, year:Int=2022){
    println("Brand : $brand Year: $year")
 }

fun biodata(name:String, age:Int,identityCode:Int,address:String){
    println(" Name :$name \n Age:$age \n Identity Code: $identityCode \n" +
            "Address : $address")
}
fun main() {
    hello()
    sayGoodBye()
    sayHello("Steve","Job")
    sayHello("Bill")
    showCar("Almaz")
    biodata(identityCode=123456,name="Steve",address="NewYork",age=50)
}

