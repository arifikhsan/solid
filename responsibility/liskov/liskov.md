Contravariant dan Covariant
Aturan pertama, SubClass harus memiliki sifat contravariant dan covariant. Contravariant adalah kondisi di mana parameter dari sebuah fungsi yang berada pada SubClass harus memiliki tipe dan jumlah yang sama dengan fungsi yang berada pada SuperClass-nya. Sedangkan Covariant adalah kondisi pengembalian nilai dari fungsi yang berada pada SubClass dan SuperClass.

preconditions dan postconditions
Selanjutnya adalah aturan preconditions dan postconditions. Ini merupakan tindakan yang harus ada sebelum atau sesudah sebuah proses dijalankan. Contohnya, ketika kita ingin memanggil sebuah fungsi yang digunakan untuk membaca data dari database, terlebih dahulu kita harus memastikan database tersebut dalam keadaan terbuka agar proses dapat dijalankan. Ini disebut sebagai precondition. Sedangkan postcondition, contohnya adalah saat proses baca tulis di dalam database telah selesai, kita harus memastikan database tersebut sudah tertutup.

Invariant
Berikutnya adalah invariant, dalam pembuatan sebuah SubClass, SubClass tersebut harus memiliki invarian yang sama dengan SuperClass-nya. Invarian sendiri adalah penjelasan dari kondisi suatu proses yang benar sebelum proses tersebut dimulai dan tetap benar setelahnya.

Constraint
Terakhir, aturan tentang constraint dari sebuah SubClass. Secara default, SubClass dapat memiliki fungsi dan properti dari SuperClass-nya. Selain itu, kita juga dapat menambahkan member baru di dalamnya. Constraint di sini adalah pembatasan yang ditentukan oleh SuperClass terhadap perubahan keadaan sebuah obyek. Sebagai contoh misal SuperClass memiliki obyek yang memiliki nilai tetap, maka SubClass tidak diijinkan untuk mengubah keadaan dari nilai obyek tersebut.
