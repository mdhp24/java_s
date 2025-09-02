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

        Scanner inputUser;
        float a,b;
        char operator;

        inputUser = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = inputUser.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        b = inputUser.nextFloat();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                break;
        }

    }
}
