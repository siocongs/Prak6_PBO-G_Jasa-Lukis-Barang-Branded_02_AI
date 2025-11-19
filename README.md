# **Jasa Lukis Barang Branded – Praktikum PBO (Tugas 6)**

Topik: *Inner Class*</br>
Anggota Kelompok: **3 Orang**</br>
Tugas ini dibuat untuk memenuhi Praktikum Pemrograman Berorientasi Objek dengan topik **inner class**.

---

## 👥 **Pembagian Tugas Anggota**

### **Anggota 1 – Class Utama (`JasaLukis`)**

* Membuat class utama: nama jasa, alamat, daftar barang yang bisa dilukis
* Membuat constructor
* Membuat method: `tampilkanInfoJasa()`
* Menyediakan method `buatPemesanan()` untuk membuat objek Pemesanan

### **Anggota 2 – Class Pemesanan (`Pemesanan`)**

* Membuat class Pemesanan
* Mengelola data pesanan pelanggan: nama, barang, harga, ongkos lukis
* Menghitung biaya pemesanan
* Membuat method: `tampilkanDetailPemesanan()`

### **Anggota 3 – Main Program (`MainApp`)**

* Membuat program utama
* Membuat minimal 2 pesanan
* Menampilkan detail semua pesanan
* Menghitung dan menampilkan total biaya

---

## 📂 **Struktur Folder**

```
src/
 └── jasalukis/
      ├── JasaLukis.java
      ├── Pemesanan.java
      └── MainApp.java
```

---

## 🧩 **Penjelasan Struktur Program**

* **JasaLukis.java**
  Menyimpan informasi jasa lukis dan menyediakan method untuk membuat objek Pemesanan.

* **Pemesanan.java**
  Menjadi class “inner” yang terhubung erat dengan JasaLukis dan menangani perhitungan biaya pemesanan.

* **MainApp.java**
  Program utama yang menjalankan aplikasi, membuat pesanan, dan menampilkan output.

---

## ▶️ **Cara Menjalankan Program**

1. Clone repository:

   ```
   git clone <repo_url_ini>
   ```
2. Masuk ke folder project
3. Compile semua file:

   ```
   javac src/jasalukis/*.java
   ```
4. Jalankan program utama:

   ```
   java jasalukis.MainApp
   ```

---


## 🖼 **UML Diagram**
3 class:

* `JasaLukis` → class utama
* `Pemesanan` → class “inner”
* `MainApp` → class eksekusi
