class Kucing (
  var color: String,
  var height: Double,
  var length: Double,
  var weight: Double
) {
  fun purring() {
    println("Meow ..")
  }
  fun eat() {
    weight = weight + 1
  }
}
