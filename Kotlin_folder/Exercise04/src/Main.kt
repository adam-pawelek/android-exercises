

class Fruit {
    private var name: String
    private var color: String
    constructor(name: String, color: String){
        this.name = name
        this.color = color
    }
    @Override
    override fun toString(): String{
        return "Name : " + this.name + "     Color: " + this.color
    }

}


val fruits = mutableListOf<Fruit>()

fun main() {
    val pineapple = Fruit("Pineapple", "yellow")
    val apple = Fruit("Apple", "red")
    val banana = Fruit("Banana", "yellow")
    fruits.add(pineapple)
    fruits.add(apple)
    fruits.add(banana)
    for (i in fruits) {
        println(i.toString())
    }
}


