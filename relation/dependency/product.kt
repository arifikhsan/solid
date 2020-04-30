class ShopService {
  fun changeProductPrice(price: String, product: Product) {
      product.changePrice(price)
  }
}

class Product(
  private var id: String,
  private var name: String,
  private var price: String
) {
  fun changePrice(value: String) {
      this.price = value
  }
}

// kelas ShopService memiliki hubungan dengan kelas Product, tetapi kelas ShopService tidak memiliki atribut berupa kelas Product
