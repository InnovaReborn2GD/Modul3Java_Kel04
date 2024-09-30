package id.fortunerdiesel.praktikum.responsi;

public class myClass {
    public static void main(String[]args) {
        int[] array = {1, 4, 9, 14, 16, 19, 99, 101, 102};

        System.out.print("Bilangan ganjil adalah: ");
        int jmlBilanganGanjil = 0;

        for (int angka : array) {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
                jmlBilanganGanjil += angka;
            }
        }
        System.out.println("\nJumlah bilangan ganjil = " + jmlBilanganGanjil);
    }
}
