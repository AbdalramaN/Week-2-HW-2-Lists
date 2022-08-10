fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations

    
    // Add (Element)
    numbers.add("six")
    println("adding number six : ${numbers}")
   	
    // Add (Index, Element)
    numbers.add(0, "six")
    println("change number six position : ${numbers}")
   	
    // Add All (List)
    // Add All (Index, List)
    numbers.addAll(weekDays)
    println("adding week : ${numbers}")
    //
    numbers.addAll(0, weekDays)
    println("change week position : ${numbers}")
    
    // Clear 
    val name = mutableListOf("ahmed", "mosab", "abdalrahman")
    println("Before clear : ${name}")
    name.clear()
    println("clearing a names : ${name}")
   	
    // Remove
    weekDays.remove("Fri")
    println("removeing a weekDays : ${weekDays}")
    
    // Remove At
    println("Before removeing : ${numbers}")
    numbers.removeAt(4)
    println("After : ${numbers}") 
    
    // Remove All
    println("Before Remove All : ${numbers}")
    numbers.removeAll(weekDays)
    println("After Removeing weekDays : ${numbers}")
   	
    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
    println("${names.size}")
    
    // Contains
    println("${names.contains("Sumayah")}")
   	
    // Contains All
    println("${names.containsAll(namesAll)}")
   	
    // get
    println("${namesAll.get(0)}")
   	
    // indexOf
    println("${namesAll.indexOf("Turki")}")
    
    // isEmpty
    println("${color.isEmpty()}")
    
    // Sublist
    println("${names.subList(0, 6)}")
    
    
}
