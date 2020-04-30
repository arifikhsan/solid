class PaymentService {

  PaymentService();

  void isPaymentValid() {}
  void openDatabase() {}
  void addNewPayment() {}
  void removePaymentByID() {}
  void updatePaymentByID() {}
}

abstract class Database {
  void insert();
  void update();
  void delete();
}

class MySQLDatabase extends Database {
  @override
  void delete() {
    // implementation
  }

  @override
  void insert() {
    // implementation
  }

  @override
  void update() {
    // implementation
  }
}

class MongoDatabase extends Database {
  @override
  void delete() {
    // implementation
  }

  @override
  void insert() {
    // implementation
  }

  @override
  void update() {
    // implementation
  }
}
