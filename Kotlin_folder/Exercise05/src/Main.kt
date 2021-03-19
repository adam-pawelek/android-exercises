class Person {
    private var name: String
    private var email: String
    private  var phone: String?
    constructor(name: String, email: String, phone: String?){
        this.name = name
        this.email = email
        this.phone = phone
    }
    constructor(name: String,email: String){
        this.name = name
        this.email = email
        this.phone = null
    }
    fun displayData(){
        if(phone == null){
            println("Name: " + this.name + "\n" + "Email: " + this.email + "\nNo phone number \n")
        }
        else{
            println("Name: " + this.name + "\n" + "Email: " +this.email + "\nPhone: " + this.phone + "\n")
        }
    }
}

fun main() {
    val person1 = Person("Pekka","pekka@domain.com","020-123456")
    val person2 = Person("Minna","minna@domain.com",null)
    val person3 = Person("Adam","adam@domain.com")

    person1.displayData()
    person2.displayData()
    person3.displayData()
}


