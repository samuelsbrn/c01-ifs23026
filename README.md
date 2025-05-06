# alstrudat-c01-ifs23038

## Description

Program Sistem Pendaftaran Mahasiswa

Program ini adalah simulasi sederhana dari sistem pendaftaran mahasiswa di universitas. Program ini memungkinkan pengguna untuk mendaftarkan mahasiswa baru, melihat daftar mahasiswa yang sudah terdaftar, mengurutkan dan membagi mahasiswa ke dalam kelas, serta mereset data mahasiswa yang ditambahkan. Sistem juga memastikan bahwa setiap mahasiswa memiliki NIM yang unik berdasarkan jurusan dan tahun masuk.

## Source Codes

| No  | File                | Deskripsi                                                                            |
| --- | ------------------- | ------------------------------------------------------------------------------------ |
| 1   | App.java            | Berisi logika utama program, termasuk menu dan interaksi dengan pengguna.            |
| 2   | University.java     | Berisi logika untuk mengelola data mahasiswa, termasuk pendaftaran dan penyimpanan.  |
| 3   | Data.java           | Berisi data awal mahasiswa yang sudah terdaftar.                                     |
| 4   | DataUniversity.java | Berisi inisialisasi data universitas dan mahasiswa awal.                             |
| 5   | DataMahasiswa.java  | Berisi pengelolaan daftar mahasiswa awal.                                            |
| 6   | Student.java        | Berisi representasi data mahasiswa, termasuk atribut seperti NIM, nama, dan jurusan. |
| 7   | View.java           | Berisi logika untuk menampilkan menu dan menerima input dari pengguna.               |
| 8   | Util.java           | Berisi utilitas seperti scanner untuk menerima input dari pengguna.                  |

## Compile

Untuk mengkompilasi program:
`mvn clean package`

## Run

`java -cp target/app.jar del.alstrudat.App`
