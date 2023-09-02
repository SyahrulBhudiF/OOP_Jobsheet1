# PRAKTIKUM OOP JOBSHEET 1

Nama : Syahrul Bhudi Ferdiansyah <br>
NIM : 2241720167 <br>
Kelas : 2F <br>
Absen : 26 <br>

**Percobaan 1**

- Class Sepeda <br>
  ![alt](./Jobsheet1/img/Sepeda.png)

- Class sepedaDemo <br>
  ![alt](./Jobsheet1/img/sepedaMain.png)

- Hasil Running <br>
  ![alt](./Jobsheet1/img/run1.png)

**Percobaan 2**

- Class SepedaGunung <br>
  ![alt](./Jobsheet1/img/SepedaGunung.png)

- Tambahan pada Class sepedaDemo <br>
  ![alt](./Jobsheet1//img/main2.png)

- Hasil Running <br>
  ![alt](./Jobsheet1/img/run2.png)

**Pertanyaan**

1. Jelaskan perbedaan antara objek dengan class!
   _Jawaban : Class merupakan blueprint atau rangka dari sebuah objek dan juga class bisa berdiri sendiri walau tanpa ada objek, sedangkan objek adalah suatu instansi tunggal dari sebuah class yang memiliki attribut/state dan behaviour/function juga objek tidak dapat berdiri sendiri tanpa adanya blueprint atau class_

2. Jelaskan alasan warna dan tipe mesin dapat menjadi atribut dari objek mobil!
   _Jawaban : Dikarenakan warna dan tipe mesin bisa dijadikan pembeda antara objek yang satu dengan yang lainnya. Dengan memasukkan warna dan tipe mesin sebagai atribut dari objek mobil, objek dapat menyimpan informasi tentang karakteristik visual dan teknis dari mobil tersebut. Informasi ini dapat digunakan untuk mengidentifikasi, membandingkan, atau melakukan operasi terkait dengan mobil._

3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
   dengan pemrograman struktural!
   _Jawaban : Kelebihan PBO adalah program dapat lebih fleksibel, apabila ada perubahan fitur, maka keseluruhan program tidak akan terganggu. Salah satu kelebihan utama pemrograman berorientasi objek dibandingkan dengan pemrograman struktural adalah konsep pewarisan (inheritance). Pewarisan memungkinkan objek atau kelas untuk mewarisi properti dan metode dari objek atau kelas lain yang lebih umum atau "induk"._

4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti
   “public String nama,alamat;”?
   _Jawaban : Diperbolehkan asalkan memiliki tipe data yang sama_

5. Pada class SepedaGunung, jelaskan alasan atribut merk, kecepatan, dan gear tidak lagi ditulis di
   dalam class tersebut!
   _Jawaban : Karena pada class SepedaGunung sudah mewarisi seluruh attribut dan function dari class induknya maka dari itu tidak perlu lagi menuliskan attribut lagi_

**Praktikum**

1.  - Class Mahasiswa <br>
      ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/f2486ecc-591b-4925-8a35-537eb7263175) <br>
      attribut : Nama, Nim, Kelas, IPK <br>
      Method : Constructor, print, setIPK, getIPK
      - Class Nilai Extends Mahasiswa <br>
        ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/daa6d6b2-f003-4781-97b6-1d8471e6ade0) <br>
        attribut : UTS, UAS, kuis, tugas <br>
        method : Constructor, calcIPK, getPredikat
      - Class matkul Extends Mahasiswa <br>
        ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/bfe2681f-3798-4428-b41a-b55649f1328c) <br>
        attribut : Array namaMatkul, Array id, Array sks <br>
        method : Constructor, print
      - Class Hewan <br>
        ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/f55347c9-fd33-44df-b16c-286087ba655d) <br>
        attribut : nama, jenis , habitat <br>
        Method : Constructor, bersuara, eat, print
      - Class Kucing Extend Hewan <br>
        ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/725eb199-479a-48b6-a109-7b7d7df401fb) <br>
        attribut : bulu , ras, warna, Energy <br>
        method : Constructor, setEnergy, bermain, tidur, makan, printKcng
      - Class Laptop <br>
        ![image](https://github.com/SyahrulBhudiF/OOP_Jobsheet1/assets/113455742/9960ab4f-28ec-4224-bb32-509d3e688e37) <br>
        attribut : merk, proci, vga, ram, rom, price, baterai, stok <br>
        method : Constructor, print, getStok, buyLaptop
