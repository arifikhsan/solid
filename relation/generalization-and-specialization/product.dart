abstract class Product {
  String _id;
  String _name;
  String _price;

  Product(this._id, this._name, this._price);
}

class ElectronicProduct extends Product {
  String _id;
  String _name;
  String _price;
  String _productionDate;

  ElectronicProduct(
    String this._id,
    String this._name,
    String this._price,
  ) : super(_id, _name, _price);
}

class ConsumableProduct  extends Product {
  String _id;
  String _name;
  String _price;
  String _expirationDate;

  ConsumableProduct(
    String this._id,
    String this._name,
    String this._price,
  ) : super(_id, _name, _price);
}
