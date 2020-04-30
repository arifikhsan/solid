class PaymentService (val database: Database) {

  fun paymentIsValid() {
     // Implementation code
  }

  fun openDatabase() {
     // Implementation code
  }

  fun addNewPayment() {
     // Implementation code
  }

  fun removePaymentByID() {
     // Implementation code
  }

  fun updatePaymentByID() {
     // Implementation code
  }
}

abstract class Database {
  abstract fun insert()
  abstract fun update()
  abstract fun delete()
}

class MySQLDatabase : Database() {

  override fun insert() {
      // Implementation code
  }

  override fun update() {
      // Implementation code
  }

  override fun delete() {
      // Implementation code
  }
}

class MongoDatabase : Database() {
  override fun insert() {
      // Implementation code
  }

  override fun update() {
      // Implementation code
  }

  override fun delete() {
      // Implementation code
  }
}
