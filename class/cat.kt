data class Cat {
  var color: String = "",
  var height: Double = 0.0,
  var length: Double = 0.0,
  var weight: Double = 0.0
} {
  fun purring() => println("Meow ..")
  fun eat() => weight += 1
}
