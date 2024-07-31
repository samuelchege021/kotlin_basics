open class parent{
    var dad="like watching football"
    var mum="like going shopping"

}


class daughter:parent(){
    fun da(){

        println("mum $mum")
    }

}

class son:parent(){

    fun so(){
        println("dad $dad")
    }


}

fun main() {
    var obj=daughter()
    obj.da()
    var obj2=son()
    obj2.so()
}