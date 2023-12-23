package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import event.Perkenalan;
import ui.Button;
import ui.MainUI;

public class GameController1 {
    static String namaPemain;

    public static void PilihanMainMenu() throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
        BufferedReader mulai = new BufferedReader(new InputStreamReader(System.in));
        Boolean ya = true;
        MainUI mainmenu = new MainUI();
        while (ya) {
                String pilihan;
                        pilihan = mulai.readLine() ;
                switch (pilihan) {
                    case "1":
                        Perkenalan.Awal();
                        namaPemain = mulai.readLine();
                        Perkenalan.Awal1(namaPemain);
                        Button.lanjut();
                        MainUI.Tampilan(namaPemain);
                        PilihanTampilan();
                        break;
                    case "2":
                        System.out.println("Mohon maaf, fitur ini masih dalam development ya :)");
                        MainUI.MainMenu();
                        PilihanMainMenu();
                        break;
                    case "3":
                        MainUI.MainMenuEN();
                        PilihanMainMenuEN();
                        break;
                    case "4":
                        mainmenu.Credit();
                        Button.lanjut();
                        MainUI.MainMenu();
                        PilihanMainMenu();
                        break;
                    case "5":
                        ya = false;
                        break;
                    default :
                        System.out.println("=================================");
                        System.out.println("input error, kembali ke main menu");
                        System.out.println("=================================");
                        MainUI.MainMenu();
                        PilihanMainMenu();
                        ya = false;
                        break;
                }
            System.out.println("Terimakasih telah bermain"); 
        }   
        } catch (Exception e) {
        }
        }

        public static void PilihanMainMenuEN() throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
        BufferedReader start = new BufferedReader(new InputStreamReader(System.in));
        Boolean ya = true;
        MainUI mainmenu = new MainUI();
        while (ya) {
                String pilihan;
                        pilihan = start.readLine() ;
                switch (pilihan) {
                    case "1":
                        Perkenalan.Awal();
                        namaPemain = start.readLine();
                        Perkenalan.Awal1(namaPemain);
                        Button.lanjut();
                        MainUI.Tampilan(namaPemain);
                        break;
                    case "2":
                        System.out.println("=================================");
                        System.out.println("This feature is still in development");
                        MainUI.MainMenuEN();
                        PilihanMainMenuEN();
                        break;
                    case "3":
                        MainUI.MainMenuEN();
                        PilihanMainMenuEN();
                        break;
                    case "4":
                        mainmenu.Credit();
                        Button.lanjut();
                        MainUI.MainMenuEN();
                        PilihanMainMenuEN();
                        break;
                    case "5":
                        ya = false;
                        break;
                    default :
                        System.out.println("=================================");
                        System.out.println("input error, back to main menu");
                        System.out.println("=================================");
                        MainUI.MainMenuEN();
                        PilihanMainMenuEN();
                        ya = false;
                        break;
                }
            System.out.println("Thanks for Playing"); 
        }   
        } catch (Exception e) {
        }
        }

        public static void PilihanTampilan() throws IOException {
        try {
        BufferedReader mulai = new BufferedReader(new InputStreamReader(System.in));
        Boolean ya = true;
        GameController fitur = new GameController();
        Button keluar = new Button();
        while (ya) {
                        System.out.println("Apa yang akan kamu lakukan?");
                        String pilih = mulai.readLine();
                        switch (pilih) {
                            case "1":
                                fitur.belanja();
                                break;
                            case "2":
                                System.out.println("maaf ya masih development");
                                PilihanTampilan();
                                break;
                            case "3":
                                keluar.keluar(namaPemain);
                                ya = false;
                                break;
                            default:
                                ya = false;
                                break;
                        }
                }
        } catch (Exception e) {
        }
        }
}
