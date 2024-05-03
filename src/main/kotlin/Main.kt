fun main() {
    val store = Store()
    store.addPreferences("sedan")
    val preferredItem = "sedan"
    store.recommendations(preferredItem)
}
class Store (){
    var cars = mutableListOf("jeep","sedan")
    var furnitures = mutableListOf("couch","beds")
    var groceries = mutableListOf("vegetables","fruits")
    var userPreferences = mutableListOf<String>()
    fun addPreferences(item:String){
        userPreferences.add(item)
    }
    fun recommendations(item: String){
        if (item in cars){
            println(cars)
        }
        else if (item in furnitures){
            println(furnitures)
        }
        else if (item in groceries){
            println(groceries)
        }
        else{
            println("Item not found")
        }
    }
}