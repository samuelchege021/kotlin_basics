class Fruits{
    var name=""
    var color=""
    var shape=""
    var price=0

}


fun main() {
    var myobj=Fruits()
    myobj.name="oranges"
    myobj.color="yellow"
    myobj.shape="circle"
    myobj.price=20



    var myfruits=Fruits()
    myfruits.name="mangoe"
    myfruits.color="yellow"
    myfruits.shape="circular"
    myfruits.price=50



    println("my favorite is ${myobj.name} and cost ${myobj.price} kenya shilling")
    println("he chooeses to eat ${myfruits.name} which cost him ${myfruits.price} ,it was ${myfruits.color} and ${myfruits.shape} in shape")

}