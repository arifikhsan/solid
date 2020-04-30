abstract class Product {
  abstract fun changeExpiredDate()
}

class Food: Product() {
  override fun changeExpiredDate() {
    // impl
  }
}

open class ElectronicProduct: Product() {
  override fun changeExpiredDate() {
    // impl
  }
}

class Smartphone: ElectronicProduct() {

}
