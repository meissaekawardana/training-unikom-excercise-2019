# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Pelanggan online)
2. Ketentuan minimal system yang harus di handle
    - Master data pelanggan
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
    Hibernate adalah Framework untuk Object Relation Mapping (ORM). Fungsi hibernate ini adalah sebagai jembatan penghubung antara objek-objek kedalam database, jadi tidak perlu lagi menggunakan SQL query dalam memanipulasi data seperti pada JDBC, tapi menggunakan bahasa HQL.
    
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
    untuk mendeklarasikan suatu entitas pada suatu class
    
    - ```@Table```
    untuk mendeklarasikan suatu tabel pada suatu class
    
    - ```@Column```
    untuk mendeklarasikan suatu atribut di tabel dalam database
    
    - ```@OneToOne```
    untuk relasi antar tabel dari satu ke satu
    
    - ```@ManyToOne```
    untuk relasi antar tabel dari banyak ke satu
    
    - ```@OneToMany```
    untuk relasi antar tabel dari satu ke banyak
    
    - ```@JoinColumn```
    untuk menentukan arah relasi tabel, jadi setelah kita mendeklarasikan relasi tabelnya (OneToOne,ManyToMany,dll) berdasarkan             atributnya, lalu kita membuat annotation JoinColumn ini, jadi tujuannya sebagai penghubung antar relasi tabel ke atribut lain           sebagai foreign key dari tabel lain
    
    - ```@JoinTable```
    fungsinya sama seperti JoinColumn, hanya saja yang dihubungkan adalah tabel. Untuk menentukan arah relasi tabel, jadi setelah kita       mendeklarasikan relasi tabelnya (OneToOne,ManyToMany,dll) lalu kita membuat annotation JoinTable untuk menghubungkan antara             tabel/class, tujuannya untuk membangun relasi antar tabel/class
    
    - ```@GeneratedValue```
    untuk diterapkan ke properti primarykey/superclass yang biasanya dipetakan bersama dengan annootation Id
    
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
Dependency injection adalah pola yang digunakan untuk menghubungkan objek dengan objek lain, atau "menyuntikkan" objek ke objek lain

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
container/context digunakan sebagai wadah untuk membuat objek, menyatukannya, mengonfigurasinya, dan mengelola dari pembuatan hingga kehancuran. Biasanya menggunakan annotaion @Bean, atau 

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    component scan adalah salah satu metode Spring untuk memindai, mendeteksi, dan membuat komponen secara otomatis dari package yang sudah dibuat sebelumnya
    
    - ```@Autowired```
    berfungsi untuk menyambungkan (inject) otomatis/auto-injection, Spring akan cari object yang tipenya sama, kalo ketemu itu yang diinject. Kalo gak ada, atau > 1, keluar exception
    
    - ```@Bean```
    untuk mmebuat suatu objek
    
    - ```@Component```
    Annotation bersifat general yang dapat digunakan pada semua layer
    
    - ```@Repository```
    Annotation class pada dao layer
   
    - ```@Service```
    Annotation class pada service layer
    
    - ```@Controller```
    Annotation class pada presentation layer ( digunakan biasanya di Spring MVC )
    
    - ```@RestController```
    @RestController adalah annotation untuk menandakan bahwa suat class adalah Controller
    
    - ```@RequestMapping```
    @requestmapping adalah annotation untuk menandakan url yang digunakan untuk mengakses dan method (http verb) yang digunakan untuk mengakses url tersebut
    
    - ```@GetMapping```
sebagai routing untuk mengakses url tersebut menggunakan method (http) fungsi request get
    
    - ```@PostMapping```
sebagai routing untuk mengakses url tersebut menggunakan method (http) fungsi request post
    
    - ```@PutMapping```
sebagai routing untuk mengakses url tersebut menggunakan method (http) fungsi request put. biasanya diikuti suatu atribut pada pemanggilannya
    
    - ```@DeleteMapping```
sebagai routing untuk mengakses url tersebut menggunakan method (http) dengan tujuan untuk menghapus data
    
    - ```@Autowired```
menandai metode konstruktor, bidang, atau penyetel yang akan disebarkan secara otomatis oleh injeksi ketergantungan Spring.
    -```@PathVariable ```
dapat digunakan untuk menangani variabel template dalam permintaan pemetaan URI , dan menggunakannya sebagai parameter metode. (Jadi get param dari url, terus dimasukin ke paratemeter)    
    
## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
