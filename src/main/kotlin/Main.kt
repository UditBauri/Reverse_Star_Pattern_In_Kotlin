fun main() {
    val s =5
    for(item in s downTo 1){
        for(data in 1..item){
            print("*")
        }
        println("")
    }
}