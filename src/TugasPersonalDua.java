import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasPersonalDua {
    private static BufferedReader br = null;

    public static void main(String[] args) {
        boolean cek = true;
        Scanner keyboard = new Scanner(System.in);
        String aritmatika = "";
        String geometri = "";
        String faktorial = "";
        Integer jumlahAngkaDiCetak, angkabeda;
        String coba = "";
        System.out.print("Belajar Aritmatika, Geometri, dan menghitung Faktorial\n");

        while (cek) {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                aritmatika = "";
                geometri = "";
                faktorial = "";
                System.out.println("Masukkan Banyak Angka Yang Mau Di Cetak [2 .. 10]:");
                jumlahAngkaDiCetak = keyboard.nextInt();
                System.out.println("Masukkan Beda Masing Masing Angka [2 .. 9]:");
                angkabeda = keyboard.nextInt();

                if (jumlahAngkaDiCetak < 2 || jumlahAngkaDiCetak > 10){
                    System.out.println("Angka Yang Harus Di Input Minimal 2 Dan Maksimal 10");
                    System.exit(0);
                }

                if (angkabeda < 2 || angkabeda > 9){
                    System.out.println("Angka Yang Harus Di Input Minimal 2 Dan Maksimal 9");
                    System.exit(0);
                }

                int awalDeretAritmatika = 0;
                for (int i = 0; i <= jumlahAngkaDiCetak - 1; i ++){
                    if (i == 0) {
                        awalDeretAritmatika = 1;
                        aritmatika = aritmatika.concat(awalDeretAritmatika + " ");
                    }else {
                        awalDeretAritmatika += angkabeda;
                        aritmatika = aritmatika.concat(awalDeretAritmatika + " ");
                    }
                }
                System.out.println("Deret Aritmatika");
                System.out.println(aritmatika);

                int awalDeretGeometri = 0;
                for (int i = 0; i <= jumlahAngkaDiCetak - 1; i ++){
                    if (i == 0) {
                        awalDeretGeometri = 1;
                        geometri = geometri.concat(awalDeretGeometri + " ");
                    }else {
                        awalDeretGeometri *= angkabeda;
                        geometri = geometri.concat(awalDeretGeometri + " ");
                    }
                }
                System.out.println("Deret Geometri");
                System.out.println(geometri);

                int sumFaktorial = 0;
                int maxNum = jumlahAngkaDiCetak;
                for (int i = maxNum; i >= 1; i --){
                    if (i == jumlahAngkaDiCetak){
                        sumFaktorial = jumlahAngkaDiCetak * 1;
                        faktorial = faktorial.concat(i + " * ");
                    }else if (i == 1){
                        sumFaktorial *= i;
                        faktorial = faktorial.concat(i + " = ");
                    }else{
                        sumFaktorial *= i;
                        faktorial = faktorial.concat(i + " * ");
                    }
                }
                // System.out.println(sumFaktorial);
                System.out.println("Deret Faktorial");
                System.out.println(faktorial.concat("" + sumFaktorial));

                System.out.println("Anda mau ulang? [y/t]:");

                coba = br.readLine();
                if (coba.equalsIgnoreCase("t"))
                    cek = false;
                else if (coba.equalsIgnoreCase("y"))
                    cek = true;
                else
                    System.exit(0);
            }catch (IOException ioe) {
                System.out.println("Error IOException");
            }
        }
    }
}
