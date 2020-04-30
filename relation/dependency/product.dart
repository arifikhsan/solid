class ShopService {
  void changeProductPrice(String price, Product product) {
    product.changePrice(price);
  }
}

class Product {
  String _id;
  String _name;
  String _price;

  void changePrice(String value) {
    _price = value;
  }
}
