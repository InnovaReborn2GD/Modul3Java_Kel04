package id.fortunerdiesel.praktikum.challenge;
import java.util.Scanner;

public class ketawaJava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ketawamu mau kek mana? ");
        String ketawa = input.nextLine();

        System.out.println("Mau berapa banyak (diulangnya)? ");
        int jmlKetawa = input.nextInt();

        System.out.println("ini dia ketawa java horizontal");
        for (int i = 0; i <= jmlKetawa; i++){
            System.out.print(ketawa);
        }

        System.out.println("\n\nini dia ketawa java vertikal");
        for (int i = 1 ; i <= 4; i++){
            System.out.println(ketawa);
        }
    }
}
