
// import javax.swing.plaf.ToolBarUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello, Broo!");
        // System.out.println("baris ke-2: hai juga bro");

        // System.out.print("baris ke-3: ini baris ketiga");
        // System.out.print("baris ke-4: saya meneruskan baris ketiga");

        // System.out.print("baris ke-5: test baris ke 5");
        // System.out.println("baris ke-6: baris ke 6");

        // System.out.print("baris ke-7: baris ke 7 \n");
        // System.out.print("baris ke-8: ini baris kedelapan \n");
        // System.out.print("baris ke-9: saya meneruskan baris kesembilan \n");

        // System.out.printf("baris ke-10: halo ketua %d", 212);

        // System.out.println("hallo cuy" + args[0] + "posisi?");
        // System.out.println(args[1]);

        // // System.out.println("halllooo");

        // tipe data
        // int x = 10;
        // int y = 20;

        // System.out.println("Nilai x: " + x);
        // System.out.println("Nilai y: " + y);
        // System.out.println("Jumlah: " + (x + y));

        // integer, byte, short, int, long, float, char, boolean
        // integer {satuan}
        // int i = 10;
        // System.out.println("========== INTEGER ==========");
        // System.out.println("Nilai i: " + i);
        // System.out.println("Nilai max: " + Integer.MAX_VALUE);

        // System.out.println("========== BYTE ==========");
        // byte b = 10;
        // System.out.println("Nilai b: " + b);
        // System.out.println("Nilai max: " + Byte.MAX_VALUE);

        // System.out.println("========== SHORT ==========");
        // short s = 10;
        // System.out.println("Nilai s: " + s);
        // System.out.println("Nilai max: " + Short.MAX_VALUE);

        // System.out.println("========== LONG ==========");
        // long l = 10L;
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

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10) {
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }

}
