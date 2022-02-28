fun main(){
    var x=sum(20,20,10,1)
    println(x)
    println("i love eating")
    var name=fullName("Rehema" ,"ephraim")
    println(name)
    var reminder=modulus(23,10)
    println(reminder)

}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int):Int{
    var add=num1+num2+num3+num4
    return add
}
fun interstingFactAboutMe(name: String){
    var x= "i love"+ " "+ String
    println(x)
}
fun fullName(firstName: String,lastName: String):String{
    var name= firstName + " " +lastName
    return name

}
fun modulus(num1: Int, num2: Int):Int{
    var reminder=num1%num2
    return reminder



}