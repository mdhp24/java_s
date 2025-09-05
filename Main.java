import java.util.*;

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

        for (int i = 0; i < 5; i++) {
            // System.out.println("loop ke-" + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            // System.out.println("loop ke-" + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            // System.out.println("loop ke-" + i);
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 9; i++) {
            // System.out.println("loop ke-" + i);
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j == 8)){
                    break;
                }
            }
            System.out.print("\n");
        }

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
