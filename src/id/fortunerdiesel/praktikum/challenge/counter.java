package id.fortunerdiesel.praktikum.challenge;

public class counter {
    public static void main(String[]args) {
        int[] angka = {5,20,9,30,12,24,36};
        int total = 0;

        for(int num : angka) {
            total += num;
        }
        System.out.println("jumlah angka = " + total);
    }
}
