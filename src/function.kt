fun mayclass(){


    var name="emobilis"

    println("I learn coding at $name")



}
fun main() {
    mayclass()
    addtwonumber()
    students("tom","john",45)
    students("shiko","jane",20)

}

fun addtwonumber(){

    var num1=7
    var num2=9

    println("The sum of $num1 and $num2 is ${num1+num2}")
}


fun students(fname:String,lname:String,age:Int){

    println("students name is $fname $lname and he or she is $age years old")
}
