
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// class Task {
//     String title;
//     String category;
//     String deadline;
//     boolean done;

//     Task(String title, String category, String deadline) {
//         this.title = title;
//         this.category = category;
//         this.deadline = deadline;
//         this.done = false;
//     }
// }

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Task> tasks = new ArrayList<>();
        // while (true) {
        // System.out.println("\n=== Aplikasi Daftar Tugas ===");
        // System.out.println("1. Tambah Tugas");
        // System.out.println("2. Tampilkan Daftar Tugas");
        // System.out.println("3. Tandai Tugas Selesai");
        // System.out.println("4. Keluar");
        // System.out.print("Pilih menu: ");
        // int menu = 0;
        // try {
        // menu = Integer.parseInt(scanner.nextLine());
        // } catch (Exception e) {
        // System.out.println("Input tidak valid!");
        // continue;
        // }
        // if (menu == 1) {
        // System.out.print("Judul tugas: ");
        // String title = scanner.nextLine();
        // System.out.print("Kategori (pekerjaan/pribadi/sekolah): ");
        // String category = scanner.nextLine();
        // System.out.print("Tenggat waktu (YYYY-MM-DD): ");
        // String deadline = scanner.nextLine();
        // tasks.add(new Task(title, category, deadline));
        // System.out.println("Tugas berhasil ditambahkan!");
        // } else if (menu == 2) {
        // if (tasks.isEmpty()) {
        // System.out.println("Belum ada tugas.");
        // } else {
        // System.out.println("\nDaftar Tugas:");
        // for (int i = 0; i < tasks.size(); i++) {
        // Task t = tasks.get(i);
        // System.out.printf("%d. [%s] %s | Kategori: %s | Deadline: %s\n", i+1, t.done
        // ? "X" : " ", t.title, t.category, t.deadline);
        // }
        // }
        // } else if (menu == 3) {
        // System.out.print("Masukkan nomor tugas yang selesai: ");
        // int idx = -1;
        // try {
        // idx = Integer.parseInt(scanner.nextLine()) - 1;
        // } catch (Exception e) {
        // System.out.println("Input tidak valid!");
        // continue;
        // }
        // if (idx >= 0 && idx < tasks.size()) {
        // tasks.get(idx).done = true;
        // System.out.println("Tugas ditandai selesai!");
        // } else {
        // System.out.println("Nomor tugas tidak ditemukan!");
        // }
        // } else if (menu == 4) {
        // System.out.println("Keluar aplikasi. Sampai jumpa!");
        // break;
        // } else {
        // System.out.println("Menu tidak valid!");
        // }
        // }
        // System.out.println("Nilai l: " + l);
        // System.out.println("Nilai max: " + Long.MAX_VALUE);

        // System.out.println("========== FLOAT ==========");
        // float f = 10.5f;
        // System.out.println("Nilai f: " + f);
        // System.out.println("Nilai max: " + Float.MAX_VALUE);

        // System.out.println("========== CHAR ==========");
        // char c = 'A';
        // System.out.println("Nilai c: " + c);
        // System.out.println("Nilai max: " + Character.MAX_VALUE);

        // System.out.println("========== BOOLEAN ==========");
        // boolean bool = true;
        // System.out.println("Nilai bool: " + bool);
        // System.out.println("Nilai max: " + Boolean.TRUE);

        // operator aritmatika

        // 1. penjumlahan
        // 2. pengurangan
        // 3. perkalian
        // 4. pembagian
        // 5. modulus

        // int var1 = 11;
        // int var2 = 5;

        // int hasil;

        // hasil = var1 + var2;
        // System.out.println("Hasil penjumlahan: " + hasil);

        // hasil = var1 - var2;
        // System.out.println("Hasil pengurangan: " + hasil);

        // hasil = var1 * var2;
        // System.out.println("Hasil perkalian: " + hasil);

        // hasil = var1 / var2;
        // System.out.println("Hasil pembagian: " + hasil);

        // hasil = var1 % var2;
        // System.out.println("Hasil modulus: " + hasil);

        // kalkulator sederhana
        // Scanner inputUser;
        // float a,b;
        // char operator;

        // inputUser = new Scanner(System.in);
        // System.out.print("Masukkan angka pertama: ");
        // a = inputUser.nextFloat();
        // System.out.print("Masukkan operator (+, -, *, /): ");
        // operator = inputUser.next().charAt(0);
        // System.out.print("Masukkan angka kedua: ");
        // b = inputUser.nextFloat();

        // switch (operator) {
        // case '+':
        // System.out.println("Hasil: " + (a + b));
        // break;
        // case '-':
        // System.out.println("Hasil: " + (a - b));
        // break;
        // case '*':
        // System.out.println("Hasil: " + (a * b));
        // break;
        // case '/':
        // if (b != 0) {
        // System.out.println("Hasil: " + (a / b));
        // } else {
        // System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        // }
        // break;
        // default:
        // System.out.println("Error: Operator tidak valid.");
        // break;
        // }

        // === Konverter Mata Uang ===
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.println("=== Konverter Mata Uang ===");
        // System.out.print("Masukkan kode mata uang asal (misal: USD): ");
        // String fromCurrency = scanner.nextLine().toUpperCase();
        // System.out.print("Masukkan kode mata uang tujuan (misal: IDR): ");
        // String toCurrency = scanner.nextLine().toUpperCase();
        // System.out.print("Masukkan jumlah yang akan dikonversi: ");
        // double amount = scanner.nextDouble();

        // try {
        // double result = convertCurrency(fromCurrency, toCurrency, amount);
        // System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, result,
        // toCurrency);
        // } catch (Exception e) {
        // System.out.println("Gagal mengonversi mata uang: " + e.getMessage());
        // }

        // }
        // public static double convertCurrency(String from, String to, double amount)
        // throws Exception {
        // String urlStr = "https://api.exchangerate-api.com/v4/latest/" + from;
        // java.net.URL url = new java.net.URL(urlStr);
        // java.net.HttpURLConnection conn = (java.net.HttpURLConnection)
        // url.openConnection();
        // conn.setRequestMethod("GET");
        // conn.connect();

        // int responseCode = conn.getResponseCode();
        // if (responseCode != 200) {
        // throw new RuntimeException("HTTP Response Code: " + responseCode);
        // }

        // java.io.InputStreamReader isr = new
        // java.io.InputStreamReader(conn.getInputStream());
        // java.io.BufferedReader br = new java.io.BufferedReader(isr);
        // StringBuilder sb = new StringBuilder();
        // String line;
        // while ((line = br.readLine()) != null) {
        // sb.append(line);
        // }
        // br.close();

        // String json = sb.toString();
        // String search = '"' + to + '"' + ":";
        // int idx = json.indexOf(search);
        // if (idx == -1) throw new Exception("Mata uang tidak ditemukan");
        // int start = idx + search.length();
        // int end = json.indexOf(',', start);
        // if (end == -1) end = json.indexOf('}', start);
        // String rateStr = json.substring(start, end).trim();
        // double rate = Double.parseDouble(rateStr);
        // return amount * rate;

        // int hasil = 10 * 2 * 5;
        // System.out.println(hasil);
        // int hasil1 = 5 + 5 / 2;
        // System.out.println(hasil1);

        // Latihan Logika Operator
        // System.out.println("test");

        // Scanner inputUser = new Scanner(System.in);

        // //program untuk menebak sebuah angka

        // int nilaiBenar = 6;
        // int nilaiTebakan;
        // boolean statusTebakan;

        // System.out.print("Masukkan nilai tebakan anda: ");
        // nilaiTebakan = inputUser.nextInt();
        // System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);

        // statusTebakan = (nilaiTebakan == nilaiBenar);
        // System.out.println("Tebakan anda: " + statusTebakan);

        // // operator aljabar boolean (and / or)
        // System.out.println("Masukkan nilai antara 5 dan 10");
        // nilaiTebakan = inputUser.nextInt();
        // boolean statusRange = (nilaiTebakan > 5 && nilaiTebakan < 10);
        // System.out.println("Nilai tebakan anda berada dalam rentang 5-10: " +
        // statusRange);

        /*
         * a | b | c
         * 0 0 0
         * 0 1 0
         * 1 0 0
         * 1 1 1
         */

        // nested if atau if bersarang

        // int a = 5;
        // int b = 10;

        // System.out.println("Ini adalah awal dari program");

        // if (a == 5){
        // if (b == 10){
        // System.out.println("Ini adalah aksi, a = 5 dan b = 10");
        // } else {
        // System.out.println("Ini adalah aksi default 1, dimana a = 5 dan b bukan 10");
        // }
        // } else {
        // System.out.println("Ini adalah aksi default 2, dimana a dan b salah");
        // } System.out.println("Ini adalah akhir dari program");
        // }

        // String input;
        // Scanner inputUser = new Scanner(System.in);

        // System.out.print("panggil nama: ");
        // input = inputUser.next();

        // // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        // switch (input) {
        // case "otong":
        // System.out.println("saya otong dan hadir Bos!!!");
        // break;
        // case "ucup":
        // System.out.println("saya ucup dan hadir Bos!!!!");
        // break;
        // case "mario":
        // System.out.println("saya mario dan hadir Bos!!!!");
        // break;
        // default:
        // System.out.println(input + " tidak hadir Bos!!!");
        // }

        // System.out.println("selesai program");

        // ternary operator

        // int input, x;

        // Scanner inputUser = new Scanner(System.in);

        // System.out.print("masukan nilai: ");
        // input = inputUser.nextInt();

        // // variable x = ekspresi ? statement_true : statement_false

        // x = (input == 10) ? (input * input) : (input / 2);

        // // jika memakai if
        // // if (input==10){
        // // x = input*input;
        // // }else{
        // // x = input/2;
        // // }

        // System.out.println("hasilnya " + x);

        // int a = 0;
        // boolean kondisi = true;

        // System.out.println("awal program");

        // while (kondisi) {
        // System.out.println("while loop ke-" + a);

        // if (a == 20) {
        // kondisi = false;
        // }

        // a++;

        // }

        // System.out.println("akhir program");

        // do {
        // aksi
        // } while (kondisi);

        // System.out.println("ini adalah awal program");

        // int a = 0;
        // boolean kondisi = true;

        // do {
        // a++;
        // System.out.println("do while ke-" + a);

        // if (a == 1) {
        // kondisi = false;
        // }

        // }while(kondisi);

        // System.out.println("ini adalah akhir program");

        // for (inisialisasi; kondisi; step nilai){
        //
        // aksi;
        //
        // }

        // System.out.println("ini adalah awal program");

        // System.out.println("loop pertama");

        // for (int nilai = 0; nilai <= 10; nilai++) {

        // System.out.println("for loop ke-" + nilai);

        // }

        // System.out.println("loop kedua");

        // for (int nilai = 0; nilai < 10; nilai++) {

        // System.out.println("for loop ke-" + nilai);

        // }

        // System.out.println("loop ketiga");

        // for (int nilai = 10; nilai >= 5; nilai--) {

        // System.out.println("for loop ke-" + nilai);

        // }

        // System.out.println("loop keempat");

        // int nilai = 0;

        // for (; nilai < 10;) {

        // System.out.println("for loop ke-" + nilai);
        // nilai++;
        // }

        // System.out.println("ini adalah akhir program");

        // program untuk menjumlahkan angka dengan rentang

        // int nilaiAwal, nilaiAkhir, total;

        // Scanner inputUser = new Scanner(System.in);
        // System.out.print("masukan nilai awal = ");
        // nilaiAwal = inputUser.nextInt();
        // System.out.print("masukan nilai akhir = ");
        // nilaiAkhir = inputUser.nextInt();

        // total = 0;

        // while (nilaiAwal <= nilaiAkhir) {
        // total = total + nilaiAwal;
        // System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        // nilaiAwal++;
        // }

        // int nilaiAwal, nilaiAkhir, total;

        // Scanner inputUser = new Scanner(System.in);
        // System.out.print("masukan nilai awal = ");
        // nilaiAwal = inputUser.nextInt();
        // System.out.print("masukan nilai akhir = ");
        // nilaiAkhir = inputUser.nextInt();

        // total = 0;

        // for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
        // total = total + i;
        // System.out.println("ditambah " + i + " menjadi " + total);
        // }

        // int nilaiAwal, nilaiAkhir, total;

        // Scanner inputUser = new Scanner(System.in);
        // System.out.print("masukan nilai awal = ");
        // nilaiAwal = inputUser.nextInt();
        // System.out.print("masukan nilai akhir = ");
        // nilaiAkhir = inputUser.nextInt();

        // total = 0;

        // int i = nilaiAwal;
        // do {
        // total = total + i;
        // System.out.println("ditambah " + i + " menjadi " + total);
        // i++;
        // } while (i <= nilaiAkhir);

        // menghitung nilai deret fibonacci ke-n
        // int f_n, f_n_1, f_n_2, n;

        // Scanner inputUser = new Scanner(System.in);
        // System.out.print("mengambil nilai fibonacci ke - :");
        // n = inputUser.nextInt();

        // f_n_2 = 0;
        // f_n_1 = 1;
        // f_n = 1;

        // for (int i = 1; i <= n; i++) {
        // System.out.println("nilai ke - " + i + " adalah " + f_n);
        // f_n = f_n_1 + f_n_2;
        // f_n_2 = f_n_1;
        // f_n_1 = f_n;
        // }

        // int a = 0;

        // while (true) {
        // a++;

        // if (a == 10) {
        // break;
        // // ini adalah keyword untuk memaksa keluar dari loop
        // } else if (a == 5) {
        // continue;
        // // ini adalah keyword untuk memaksa memulai aksi dari awal
        // } else if (a == 7) {
        // return;
        // }

        // System.out.println("looping ke - " + a);

        // }

        // System.out.println("akhir dari looping");

        // OOP
        // System.out.println("=== OOP ===");

        // Scanner inputUser = new Scanner(System.in);

        // System.out.println("=== Program Registrasi User ===");
        // System.out.print("masukan username: ");
        // String username = inputUser.nextLine();

        // System.out.print("Masukkan password: ");
        // String password = inputUser.nextLine();

        // User user1 = new User();
        // user1.register(username, password);
        // user1.notification();

        // // User user2 = new Admin();
        // // user2.register(username, password);
        // // user2.notification();

        // PSEUDOCODE
        // Program menghitung persegi panjang

        // int panjang, lebar, luas;

        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan panjang: ");
        // panjang = input.nextInt();

        // System.out.print("Masukkan lebar: ");
        // lebar = input.nextInt();

        // luas = panjang * lebar;
        // System.out.println("Luas persegi panjang: " + luas);

        // // Program menghitung luas persegi
        // int sisi, luasPersegi;

        // System.out.print("Masukkan sisi: ");
        // sisi = input.nextInt();
        // luasPersegi = sisi * sisi;
        // System.out.println("Luas persegi: " + luasPersegi);

        // for (int i = 0; i < 5; i++) {
        // // System.out.println("loop ke-" + i);
        // for (int j = 0; j < 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        // System.out.print("\n");

        // for (int i = 0; i < 5; i++) {
        // // System.out.println("loop ke-" + i);
        // for (int j = 0; j < 5; j++) {
        // System.out.print("* ");
        // if (i == j) {
        // break;
        // }
        // }
        // System.out.print("\n");
        // }

        // System.out.print("\n");

        // for (int i = 0; i < 5; i++) {
        // // System.out.println("loop ke-" + i);
        // // for (int j = 0; j < 5; j++) {
        // // System.out.print("* ");
        // // if ((i + j) == 4) {
        // // break;
        // // }
        // // }
        // // System.out.print("\n");
        // // }

        // // System.out.print("\n");

        // // for (int i = 0; i < 9; i++) {
        // // // System.out.println("loop ke-" + i);
        // // for (int j = 0; j < 9; j++) {
        // // System.out.print("* ");
        // // if (i == j) {
        // // break;
        // // } else if ((i + j == 8)){
        // // break;
        // // }
        // // }
        // // System.out.print("\n");
        // // }

        // // y = (x + 2) * x

        // int y, x;
        // x = 5;
        // y = hitung(x);

        // System.out.println("x = " + x + ", y = " + y);

        // x = 20;
        // y = hitung(x);
        // System.out.println("x = " + x + ", y = " + y);

        // x = 40;
        // y = hitung(x);
        // System.out.println("x = " + x + ", y = " + y);

        // }

        // public static int hitung(int input) {
        // int hasil;

        // // hasil = (input + 2) * input;
        // hasil = input * input;

        // return hasil;

        // void itu artinya hampa

        // System.out.println(simpel());

        // fungsiVoid("apa pun");
        // selamatPagi("emak");
        // selamatPagi("abah");

        // }

        // private static void selamatPagi(String nama) {
        // System.out.println("selamat pagi " + nama);
        // }

        // // fungsi atau method tanpa kembalian
        // private static void fungsiVoid(String input) {
        // System.out.println(input);
        // }

        // // // fungsi atau method dengan kembalian
        // // // sehingga menggunakan return untuk
        // // // mengembalikan nilainya (10.0f)
        // // private static float simpel() {
        // // return 10.0f;
        // // }

        // Scanner userInput = new Scanner(System.in);

        // System.out.print("panjang = ");
        // int inputPanjang = userInput.nextInt();
        // System.out.print("lebar = ");
        // int inputLebar = userInput.nextInt();

        // gambar(inputPanjang, inputLebar);

        // System.out.println("luas = " + luas(inputPanjang, inputLebar));
        // System.out.println("keliling = " + keliling(inputPanjang, inputLebar));

        // tampilkanKelilingDanLuas(inputPanjang, inputLebar);
        // }

        // private static void tampilkanKelilingDanLuas(int panjang, int lebar) {
        // System.out.println("luas = " + luas(panjang, lebar));
        // System.out.println("keliling = " + keliling(panjang, lebar));
        // }

        // private static int keliling(int panjang, int lebar) {
        // int hasil = (panjang + lebar) * 2;
        // return hasil;
        // }

        // private static int luas(int panjang, int lebar) {
        // int hasil = panjang * lebar;
        // return hasil;
        // }

        // private static void gambar(int panjang, int lebar) {
        // for (int i = 0; i < lebar; i++) {
        // for (int j = 0; j < panjang; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }
        // }

        // Program dari PSEUDOCODE mencari luas lapangan sepak bola
        // int panjang, lebar, luas;

        // panjang = 100;
        // lebar = 64;
        // luas = panjang * lebar;

        // System.out.println("Luas lapangan sepak bola adalah " + luas);

        // Program dari PSEUDOCODE menentukan sebuah bilangan adalah ganjil atau genap
        // int bilangan;

        // bilangan = 99;
        // if (bilangan % 2 == 0) {
        // System.out.print(bilangan + " Bilangan genap");
        // } else {
        // System.out.print(bilangan + " Bilangan ganjil");
        // }

        // Program dari PSEUDOCODE menghitung mundur
        // int bilangan;

        // for (bilangan = 9; bilangan > 0; bilangan--) {
        // System.out.println("Bilangan adalah " + bilangan);
        // }
        // Scanner userInput = new Scanner(System.in);
        // System.out.print("masukan nilai:");
        // int nilai = userInput.nextInt();
        // System.out.println("anda memasukan nilai = " + nilai);

        // printNilai(nilai);
        // int jumlah = jumlahNilai(nilai);
        // System.out.println("jumlah = " + jumlah);

        // int faktorial = hitungFaktorial(nilai);
        // System.out.println("hasil faktorial = " + faktorial);
        // }
        // fungsi rekursif sederhana

        // private static int hitungFaktorial(int parameter) {
        // System.out.println("parameter = " + parameter);

        // if (parameter == 1) {
        // return parameter;
        // }

        // return parameter * hitungFaktorial(parameter - 1);

        // }

        // private static int jumlahNilai(int parameter) {
        // System.out.println("parameter = " + parameter);

        // if (parameter == 0) {
        // return parameter;
        // }

        // return parameter + jumlahNilai(parameter - 1);

        // }

        // private static void printNilai(int parameter) {
        // System.out.println("nilai = " + parameter);

        // if (parameter == 0) {
        // return;
        // }

        // parameter--;

        // printNilai(parameter);
        // }

        // Scanner userInput = new Scanner(System.in);
        // System.out.print("masukan nilai n = ");
        // int nilai = userInput.nextInt();
        // int nilai_fibonacci = fibonacci(nilai, "atas");
        // System.out.println("nilai fibonacci ke-" + nilai + " adalah " +
        // nilai_fibonacci);
        // }

        // private static int fibonacci(int n, String daun) {
        // System.out.println("daun " + daun);
        // System.out.println("Fibonacci ke - " + n);
        // if (n == 1 || n == 0) {
        // return n;
        // } else {
        // return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        // }
        // }

        // int hasilInteger;
        // hasilInteger = tambah(4, 5);
        // printAngka(hasilInteger);

        // float hasilFloat;

        // hasilFloat = tambah(4.5f, 4);
        // printAngka(hasilFloat);

        // hasilFloat = tambah(4, 4.5f);
        // printAngka(hasilFloat);

        // hasilInteger = tambah(11, 12, 13);
        // printAngka(hasilInteger);

        // printAngka(10);
        // printAngka(10.5f);
        // printAngka(16.7d);
        // printAngka(16);

        // }

        // private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3) {
        // return angkaInt1 + angkaInt2 + angkaInt3;
        // }

        // private static float tambah(int angkaInt2, float angkaFloat1) {
        // return angkaFloat1 + angkaInt2;
        // }

        // private static float tambah(float angkaFloat1, int angkaInt2) {
        // return angkaFloat1 + angkaInt2;
        // }

        // private static int tambah(int angkaInt1, int angkaInt2) {
        // return angkaInt1 + angkaInt2;
        // }

        // private static void printAngka(double angkaDouble) {
        // System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
        // }

        // private static void printAngka(float angkaFloat) {
        // System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
        // }

        // private static void printAngka(int angkaInteger) {
        // System.out.println("angka ini adalah integer dengan nilai = " +
        // angkaInteger);
        // }

        // System.out.println("assignment Array");

        // // index = 0 1 2 3
        // int[] arrayInteger = { 1, 2, 3, 4 };

        // arrayInteger[0] = 11;

        // System.out.println(arrayInteger[0]);
        // System.out.println(arrayInteger[1]);
        // System.out.println(arrayInteger[2]);
        // System.out.println(arrayInteger[3]);

        // System.out.println("Deklarasi Array");
        // float[] arrayFloat = new float[5];

        // arrayFloat[3] = 11.5f;

        // System.out.println(arrayFloat[0]);
        // System.out.println(arrayFloat[1]);
        // System.out.println(arrayFloat[2]);
        // System.out.println(arrayFloat[3]);
        // System.out.println(arrayFloat[4]);

        // System.out.println(Arrays.toString(arrayInteger));
        // System.out.println(Arrays.toString(arrayFloat));

        // int[] arrayAngka = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        // // looping standard
        // System.out.println("looping standard");
        // for (int i = 0; i < 10; i++) {
        // System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        // }

        // // looping dengan properti array
        // System.out.println("looping dengan properti length");
        // for (int i = 0; i < arrayAngka.length; i++) {
        // System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        // }

        // // looping untuk collection <- array
        // System.out.println("looping for each");
        // for (int angka : arrayAngka) {
        // System.out.println("angka pada looping ini = " + angka);
        // }

        // int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        // int[] arrayAngka2 = new int[5];

        // System.out.println(arrayAngka1);
        // System.out.println(arrayAngka2);

        // arrayAngka2 = arrayAngka1;

        // System.out.println(arrayAngka1);
        // System.out.println(arrayAngka2);

        // System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        // System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        // arrayAngka1[0] = 100;
        // arrayAngka2[4] = 400;
        // System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        // System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        // ubahArray(arrayAngka1);
        // System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        // System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
        // }

        // private static void ubahArray(int[] arrayAngka) {
        // arrayAngka[0] = 999;
        // System.out.println("array di dalam fungsi -> " +
        // Arrays.toString(arrayAngka));

        // }

        // int[] arrayAngka8 = { 1, 6, 4, 5, 3, 5, 2, 6 };

        // // konversi int[] ke Integer[]
        // Integer[] arrayWrapper =
        // Arrays.stream(arrayAngka8).boxed().toArray(Integer[]::new);

        // System.out.println("Sebelum sort descending:");
        // printArray(arrayAngka8);

        // // sort descending
        // Arrays.sort(arrayWrapper, Collections.reverseOrder());

        // System.out.println("Setelah sort descending:");
        // System.out.println("array = " + Arrays.toString(arrayWrapper));
        // }

        // private static void printArray(int[] dataArray) {
        // System.out.println("array = " + Arrays.toString(dataArray));
        // }
        // int[] arrayAngka = { 1, 6, 4, 5, 3, 5, 2, 6 };
        // printArray(arrayAngka, "array angka sebelum diurutkan");

        // // penjumlahan antara dua array
        // int[] arrayAngka2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // printArray(arrayAngka2, "array angka 2 sebelum diurutkan");
        // int[] arrayHasil = new int[arrayAngka.length];
        // for (int i = 0; i < arrayAngka.length; i++) {
        // arrayHasil[i] = arrayAngka[i] + arrayAngka2[i];
        // }
        // printArray(arrayHasil, "array hasil penjumlahan");
        // }

        // private static void printArray(int[] dataArray, String message) {
        // System.out.println("Array " + message + " = " + Arrays.toString(dataArray));
        // }

        // private static int[] tambahArray(int[] arrayAwal, String message){
        // int[] arrayHasil = new int[arrayAwal.length];
        // for (int i = 0; i < arrayAwal.length; i++) {
        // arrayHasil[i] = arrayAwal[i] + 2;
        // }
        // printArray(arrayHasil, message);
        // return arrayHasil;
        // }

        // System.out.println("UUID Example:");
        // java.util.UUID uuid = java.util.UUID.randomUUID();
        // System.out.println("Generated UUID: " + uuid.toString());

        // array dua dimensi
        // int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for (int i = 0; i < array2D.length; i++) {
        // for (int j = 0; j < array2D[i].length; j++) {
        // System.out.print(array2D[i][j] + " ");
        // }
        // System.out.print("\n");
        // }

        // // array tiga dimensi
        // int[][][] array3D = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 9,
        // 10 }, { 11, 12 } } };
        // for (int i = 0; i < array3D.length; i++) {
        // for (int j = 0; j < array3D[i].length; j++) {
        // for (int k = 0; k < array3D[i][j].length; k++) {
        // System.out.print(array3D[i][j][k] + " ");
        // }
        // System.out.print("\n");
        // }
        // System.out.print("\n");
        // }

        // // array menyimpan variabel reference
        // String[] arrayString = new String[3];
        // arrayString[0] = "satu";
        // arrayString[1] = "dua";
        // arrayString[2] = "tiga";
        // for (String s : arrayString) {
        // System.out.println(s);
        // }

        // int[] array1 = { 1, 2, 3 };
        // int[] array2 = { 4, 5, 6 };
        // int[] array3 = { 7, 8, 9 };

        // int[][] array2DI = { array1, array2, array3 };
        // for (int[] arr : array2DI) {
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        // System.out.print("\n");
        // }

        // int[][] array_2D = {
        // { 1, 2, 3 },
        // { 4, 5 },
        // };

        // System.out.println(array_2D);
        // System.out.println(Arrays.toString(array_2D));
        // System.out.println(array_2D[0]);
        // System.out.println(array_2D[1]);

        // System.out.println(Arrays.deepToString(array_2D));
        // System.out.print("\n");

        // char[] array_char1 = { 'a', 'b', 'c' };
        // char[] array_char2 = { 'd', 'e' };

        // char[][] arrayChar_2D = {
        // array_char1,
        // array_char2,
        // };

        // System.out.println(arrayChar_2D);
        // System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        // System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        // System.out.println(Arrays.toString(arrayChar_2D));
        // System.out.println(Arrays.deepToString(arrayChar_2D));

        // pertambahan matrix

        // int[][] matrix_a = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // };

        // int[][] matrix_b = {
        // { 11, 12, 13 },
        // { 14, 15, 16 },
        // { 17, 18, 19 },
        // };

        // printArray(matrix_a);
        // printArray(matrix_b);

        // int[][] hasilTambah = tambah(matrix_a, matrix_b);

        // printArray(hasilTambah);

        // // perkalian matrix

        // int[][] matrix_c = {
        // { 1, 2 },
        // { 3, 4 },
        // { 5, 6 },

        // };

        // int[][] matrix_d = {
        // { 11, 12 },
        // { 13, 14 },
        // };

        // int[][] hasilKali = kali(matrix_c, matrix_d);

        // printArray(hasilKali);

        // }

        // private static int[][] kali(int[][] matrix_1, int[][] matrix_2) {
        // int baris_1 = matrix_1.length;
        // int kolom_1 = matrix_1[0].length;

        // int baris_2 = matrix_2.length;
        // int kolom_2 = matrix_2[0].length;

        // int[][] hasil = new int[baris_1][kolom_2];

        // int buffer;
        // for (int i = 0; i < baris_1; i++) {
        // for (int j = 0; j < kolom_2; j++) {
        // buffer = 0;
        // for (int k = 0; k < kolom_1; k++) {
        // buffer += matrix_1[i][k] * matrix_2[k][j];
        // }
        // hasil[i][j] = buffer;
        // }
        // }

        // return hasil;
        // }

        // private static int[][] tambah(int[][] matrix_1, int[][] matrix_2) {
        // int baris_1 = matrix_1.length;
        // int kolom_1 = matrix_1[0].length;

        // int baris_2 = matrix_2.length;
        // int kolom_2 = matrix_2[0].length;

        // int[][] hasil = new int[baris_1][kolom_1];

        // if (baris_1 == baris_2 && kolom_1 == kolom_2) {

        // for (int i = 0; i < baris_1; i++) {
        // for (int j = 0; j < kolom_1; j++) {
        // hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
        // }
        // }
        // } else {
        // System.out.println("jumlah baris atau kolom tidak sama");
        // }
        // return hasil;
        // }

        // private static void printArray(int[][] dataArray) {
        // int baris = dataArray.length;
        // int kolom = dataArray[0].length;

        // for (int i = 0; i < baris; i++) {
        // System.out.print("[");
        // for (int j = 0; j < kolom; j++) {
        // System.out.print(dataArray[i][j]);

        // if (j < (kolom - 1)) {
        // System.out.print(",");
        // } else {
        // System.out.print("]");
        // }

        // }
        // System.out.print("\n");
        // }
        // System.out.print("\n");

        // String kata = "Hello World";
        // System.out.println(kata);

        // String kataString = "hallo";

        // char[] kataChar = { 'm', 'd', 'h', 'p', 'k' };

        // // menampilkan String

        // System.out.println(kataString);
        // System.out.println(Arrays.toString(kataChar));

        // // mengakses komponen dari String

        // System.out.println("komponen pertama dari char[] = " + kataChar[3]);
        // System.out.println("komponen pertama dari String = " + kataString.charAt(3));

        // // merubah komponen dari String
        // // itu tidak bisa...kenapa?, karena string di java itu immutable
        // kataChar[0] = 'c';
        // System.out.println(Arrays.toString(kataChar));

        // // kataString[0] = "c"; <---- tidak bisa
        // // kataString.charAt(0) = "c"; <---- tidak bisa

        // // kita bisa merubah komponen secara tidak langsung

        // printAddress("kataString", kataString);

        // kataString = "c" + kataString.substring(1, 5);

        // System.out.println(kataString);

        // printAddress("kataString", kataString);

        // // memory dari string (String Pool)

        // String str_1 = "hallo";
        // String str_2 = "test";
        // String str_3 = "testing";

        // printAddress("str_1", str_1);
        // printAddress("str_2", str_2);
        // printAddress("str_3", str_3);

        // str_3 = str_3.substring(0, 4);
        // printAddress("str_3", str_3);

        // String str_4 = "callo";
        // printAddress("str_4", str_4);

        // kataString = "callo";
        // printAddress("kataString", kataString);

        // String a = new String("hallo");
        // printAddress("a", a);
        // }

        // private static void printAddress(String nama, String data) {
        // int address = System.identityHashCode(data);
        // System.out.println(nama + " = " + data + "\t|| address = " +
        // Integer.toHexString(address));
        // }

        // String kalimat = "pisang goreng enak sekali";

        // // Mengambil komponen dari string
        // System.out.println(kalimat.charAt(5));

        // // Substring
        // String kata = kalimat.substring(10, 15);
        // System.out.println(kata);

        // // concatenation (concat)
        // String kalimat2 = kata + " bakwan";
        // System.out.println(kalimat2);

        // kata = kata + " cireng";
        // System.out.println(kata);

        // // concat dengan non string
        // int jumlah = 20;
        // String kalimat3 = kata + " " + jumlah; // casting
        // System.out.println(kalimat3);
        // System.out.println(kata + " " + jumlah);

        // // lowercase dan uppercase
        // System.out.println(kalimat.toUpperCase());
        // System.out.println(kalimat.toLowerCase());

        // // replace
        // String kalimat4 = kalimat.replace("pisang", "combro");
        // System.out.println(kalimat);
        // System.out.println(kalimat4);

        // // Compare
        // String motor1 = "royal enfield himalayan";
        // String motor2 = "kawasaki w175";
        // System.out.println(motor1.compareTo(motor2)); // klmnopqr
        // System.out.println(motor2.compareTo(motor1));

        // String gorengan1 = "bakwan";
        // String gorengan2 = "bala-bala";
        // System.out.println(gorengan1.compareTo(gorengan2));
        // System.out.println(gorengan2.compareTo(gorengan1));

        // // equality ( persamaan )

        // String kataInput = "test"; // ini ada di string pool
        // // String kataInput = new String("test"); // ini bukan string literal, dan
        // tidak
        // // berada di string pool
        // String kataTest = "test"; // ini juga ada di string pool

        // System.out.println("\npersamaan pada lokasi string pool");
        // if (kataInput == kataTest) {
        // System.out.println("sama");
        // } else {
        // System.out.println("tidak sama");
        // }

        // Scanner userInput = new Scanner(System.in);
        // System.out.print("\nmengambil input string dari user: ");
        // kataInput = userInput.next(); // tidak di string pool
        // System.out.println("ini adalah input user: " + kataInput);

        // if (kataInput.equals(kataTest)) {
        // System.out.println("sama");
        // } else {
        // System.out.println("tidak sama");
        // }
        // StringBuilder builder = new StringBuilder("halo");
        // printData(builder);

        // // append
        // builder.append(" semuanya");
        // printData(builder);

        // builder.append(" warga Surabaya");
        // printData(builder);

        // // insert
        // builder.insert(19, " Kota");
        // printData(builder);

        // // delete
        // builder.delete(19, 24);
        // printData(builder);

        // // rubah character pada index tertentu
        // builder.setCharAt(14, 'W');
        // printData(builder);

        // // replace
        // builder.replace(20, 28, "Bandung");
        // printData(builder);

        // // casting menjadi string
        // String kalimat = builder.toString();
        // System.out.println(kalimat);
        // int addressString = System.identityHashCode(kalimat);
        // System.out.println("address = " + Integer.toHexString(addressString));

        // }

        // private static void printData(StringBuilder dataBuilder) {
        // System.out.println("data = " + dataBuilder);
        // System.out.println("panjang = " + dataBuilder.length());
        // System.out.println("kapasitas = " + dataBuilder.capacity());

        // int addressBuilder = System.identityHashCode(dataBuilder);
        // System.out.println("address = " + Integer.toHexString(addressBuilder));
        // }

        // String nama = "MDHP";
        // int umur = 17;
        // System.out.println("Nama saya adalah " + nama + ", umur saya adalah " +
        // umur);

        // // cara lainnya adalah dengan format string
        // System.out.printf("Nama saya adalah %s, umur saya adalah %d\n",nama,umur);

        // // conversion : f=floating point, d=integer, c=character, s=string, b=boolean

        // // struktur format = %[argumen_index$][flags][width][.precision]conversion

        // // [argumen_index$]
        // System.out.println("\n[argumen_index$]");

        // // udin, wahai udin, kemana saja kamu udin
        // System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n",nama);
        // // umur udin berapa?, udin menjawab: 17, wah masih muda ya umurnya 17
        // System.out.printf("\numur %1$s berapa?, \n%1$s menjawab: %2$d \nWah masih
        // muda ya umurnya %2$d\n",nama,umur);

        // // [flags]
        // System.out.println("\n[flags]");
        // int int1 = 5;
        // int int2 = 8;
        // int hasil = int1 - int2;
        // System.out.printf("%d - %d = %+d\n",int1,int2,hasil);

        // // [width]
        // System.out.println("\n[width]");
        // int int3 = 1000;
        // System.out.println("INTEGER");
        // System.out.printf("%d\n",int3);
        // System.out.printf("%5d\n",int3);
        // System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        // System.out.printf("%+5d\n",int3); // flags akan mengambil slot di dalam
        // format
        // System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        // System.out.printf("%10d\n",int3);
        // System.out.printf("% 10d\n",int3);
        // System.out.printf("%010d\n",int3); // flags = "0", kita tambahkan leading "0"
        // didepan
        // System.out.printf("%+010d\n",int3);
        // int int4 = 1000000000;
        // System.out.printf("%-,15d\n",int4); // flags = ",", menandakan delimeter per
        // seribu

        // System.out.println("\nFLOATING POINT");
        // float float1 = 1.543f;
        // System.out.printf("%f\n", float1);
        // System.out.printf("%+9f\n",float1); // floating point akan mengambil width
        // dengan 6 decimal

        // // [.precision]
        // System.out.println("\n[.precision]");
        // float float2 = 15.678f;
        // System.out.printf("%f\n",float2);
        // System.out.printf("%.1f\n",float2);
        // System.out.printf("%.2f\n",float2);
        // System.out.printf("%8.2f\n",float2); // gabungkan dengna width
        // System.out.printf("%+08.2f\n",float2); // gabungkan dengna width dan flag

        // // contoh

        // String nama2 = "PRAS";
        // float IPK = 3.785123567653f;

        // // struktur format = %[argumen_index$][flags][width][.precision]conversion

        // System.out.printf("\nIPK %1$s berapa?,\n%1$s: saya dapet
        // %2$+5.2f\n",nama2,IPK);

        // // Kesimpulan

        // // save format ini kedalam variabel string
        // String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        // System.out.println("biasa -> " + info_biasa);

        // String info_format = String.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        // System.out.println("string format -> " + info_format);

        // // save format ini kedalam string builder

        // StringBuilder builder_info = new StringBuilder();
        // Formatter formatBuilder = new Formatter(builder_info);

        // formatBuilder.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        // System.out.println("string builder format -> " + builder_info);

        // int[] arrayData = { 0, 1, 2, 3 };

        // Scanner userInput = new Scanner(System.in);
        // System.out.print("data ke-:");
        // int indexInput = userInput.nextInt();

        // // Exception biasa
        // System.out.println("Exception biasa");
        // try {
        // System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput,
        // arrayData[indexInput]);
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        // // Exception didalam fungsi
        // System.out.println("\nException dalam fungsi");
        // int data = ambilDataDariArray(arrayData, indexInput);
        // System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        // // Exception throws by method
        // System.out.println("Exception throws by method");
        // int data2 = 0;

        // try {
        // data2 = ambilData(arrayData, indexInput);
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        // System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);
        // System.out.println("\n\nakhir dari program");
        // }

        // private static int ambilData(int[] array, int index) throws Exception {
        // int hasil = array[index];
        // return hasil;
        // }

        // private static int ambilDataDariArray(int[] array, int index) {
        // int hasil = 0;

        // try {
        // hasil = array[index];
        // } catch (Exception e) {
        // System.err.println(e);
        // }

        // return hasil;\

        // try {
        // FileInputStream fileInput = new FileInputStream("input.txt");
        // } catch (Exception e){
        // System.err.println(e);
        // }

        // FileInputStream fileInput = new FileInputStream("input.txt");

        // System.out.println((char) fileInput.read());
        // System.out.println((char) fileInput.read());
        // System.out.println((char) fileInput.read());
        // System.out.println((char) fileInput.read());

        // MASUK KE OOP
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Dicky";
        mhs.umur = 21;
        mhs.belajar();
    }
}

class Mahasiswa {
    String nama;
    int umur;

    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

// }

// abstract class Display {
// abstract void notification();

// void showToken(UUID token) {
// System.out.println("token generated: " + token);
// };

// }

// class User extends Display {
// protected String username;
// protected String password;
// protected UUID token;

// void tokenCreation() {
// token = UUID.randomUUID();
// }

// void register(String username, String password) {
// this.username = username;
// this.password = password;
// tokenCreation();
// System.out.println("User terdaftar dengan username: " + this.username);
// System.out.println("Username: " + this.username);
// System.out.println("Password: " + this.password);
// }

// @Override
// void notification() {
// System.out.println("Notifikasi untuk user");

// }
// }

// class Admin extends User {
// private final String role = "admin";

// void createUser(String username, String password) {
// this.username = username;
// this.password = password;
// // System.out.println("Admin membuat user dengan username: " +
// this.username);
// }

// @Override
// void notification() {
// System.out.println("User created by: " + role);
// showToken(this.token);
// }
// }
