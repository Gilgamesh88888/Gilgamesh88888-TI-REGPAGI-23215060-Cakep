
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Cakep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? ");
        System.out.print("Jawab (Yoi/Enggak): ");
        String jawaban = input.nextLine().toLowerCase();

        switch (jawaban) {
            case "yoi" -> System.out.println("Cakep Bener. Good Job");
            case "enggak" -> {
                System.out.println("Tetep cakep sih.");
                System.out.println("Sing penting paham konsep nye yee.");
                System.out.println("Keep the code works dude");
            }
            default -> System.out.println("Jawaban tidak valid. Harap jawab 'Yoi' atau 'Enggak'.");
        }
    }
}
