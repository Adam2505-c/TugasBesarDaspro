package ui;

import java.io.IOException;
import java.util.Scanner;


import controller.GameController;
import controller.GameController1;

public class Button {
    public static  void lanjut() {
        GameController gameController = new GameController();
        gameController.nama();
        try (Scanner scan = new Scanner(System.in)) {
            Boolean ya = true;
            System.out.println("*Tekan tombol apapun untuk melanjutkan*");
            String a = scan.nextLine();
            while(ya) {
                switch (a) {
                    case "1" :
                    default:
                    ya = false;
                    break;
                }
            }
        }
        
    }
     public String keluar(String b) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            Boolean ya = true;
            System.out.println("Apa kamu ingin keluar ke Main Menu? (ya/tidak)");
            String a = scan.nextLine();
            while(ya) {
                switch (a) {
                    case ("ya"):
                    MainUI.MainMenu();
                    GameController1.PilihanMainMenu();
                    ya = false;
                    break;
                    case ("tidak"):
                    MainUI.Tampilan(b);
                    GameController1.PilihanTampilan();
                    break;
                    default:
                    System.out.println("Input eror, kembali ke game");
                    MainUI.Tampilan(b);
                    GameController1.PilihanTampilan();
                    break;
                }
            }
        } catch (Exception e) {

        }
        return b;
    }
}


