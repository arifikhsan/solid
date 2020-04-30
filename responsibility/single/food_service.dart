class FoodService {
  int id;
  String name;
  String date;

  FoodService(this.id, this.name, this.date);

  void addToStore() {
    if(!_isExpired()) {
      // Add to store
    }
  }

  bool _isExpired() {
    var foodDate = DateTime.parse(date);
    var now = DateTime.now();
    return foodDate.isAfter(now);
  }
}
