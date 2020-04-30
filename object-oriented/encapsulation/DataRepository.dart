class DataRepository {
  var _data = <dynamic>[];

  set data(value) {
    var response = []; // retrieving data ...
    _data.clear();
    _data.addAll(response);
  }

  get data => _data;
}
