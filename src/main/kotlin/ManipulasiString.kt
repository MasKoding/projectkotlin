fun main() {
    var msg = "Aku Sayang kamu tapi boong"
    var data = msg.trim()
    for(i in 0..data.length-1){
        for(j in 0..i){
            print("_")

        }
        println(data.get(i))
    }

}