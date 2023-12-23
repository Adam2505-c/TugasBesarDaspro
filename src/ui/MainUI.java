package ui;

import java.io.IOException;

import controller.GameController1;

public class MainUI {
    public static void Tampilan(String a) throws IOException{
        double jam = 05;
        double menit = 00;
        System.out.println("==================================================");
        System.out.println("  " + a + "      " + jam + ":" + menit);
        System.out.println("==================================================");
        BackgroundKosan();
        System.out.println("==================================================");
        System.out.println("Interaksi");
        System.out.println("----");
        System.out.println("1. Interaksi Sekitar");
        System.out.println("2. Berbicara");
        System.out.println("3. Keluar");
        GameController1.PilihanTampilan();
    
    }

    public void Credit() {
        System.out.println("Game ini didekasikan untuk Tugas Besar Mata Kuliah Dasar Pemrograman");
        System.out.println("====================================================================");
        System.out.println("Nama Dosen = Ichsan Budiman, M.T.");
        System.out.println("Kelompok 7 =");
        System.out.println("Muhammad Adam Sirojuddin Munawar (1237050133)");
        System.out.println("Muhammad Satrio Pratama (1237050047)");
        System.out.println("Muhammad Tibia Nugraha (1237050089)");
        System.out.println();
        System.out.println("Additional Credit");
        System.out.println("https://art.pixlab.io/#algo");
        System.out.println("Hilman Maulana buat bantuin nampilin HashMap");
    }

    public static void BackgroundKosan(){
        System.out.println("      ______________________________ ______________________________     \r\n" + //
                "     / / / / / / / / / / / / / / /_ /_ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\    \r\n" + //
                "    / / / / / / / / / / / / / / / | || |\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\   \r\n" + //
                "   / / / / / / / / / / / / / / /  | || | \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\  \r\n" + //
                "  / / / / / / / / / / / / / / /   | || |  \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \r\n" + //
                " /_/_/_/_/_/_/_/_/_/_/_/_/_/_/____|_||_|___\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\\r\n" + //
                " |______|______|______|______|______|______|______|______|______|______|\r\n" + //
                "  ______ ______ ______ ______ ______ ______ ______ ______ ______ ______ \r\n" + //
                " |______|______|______|______|______|______|______|______|______|______|\r\n" + //
                " /_ /_ /_ /_ /_ /_ /_ /_ /_ |_   _|_   _/_ /_ /_ /_ /_ /_ /_ /_ /_ /_ | \r\n" + //
                "  | || || || || || || || || | | |   | |  | || || || || || || || || || | \r\n" + //
                "  | || || || || || || || || | | |   | |  | || || || || || || || || || | \r\n" + //
                "  | || || || || || || || || |_| |_ _| |_ | || || || || || || || || || | \r\n" + //
                "  |_||_||_||_||_||_||_||_||_|_____|_____||_||_||_||_||_||_||_||_||_||_| \r\n" + //
                "                                                                        \r\n" + //
                "                                                                        ");
    }

    public static void MainMenu() throws IOException { 
        System.out.println();
        System.out.println("  _  __                                          \r\n" + //
                        " | |/ /                                          \r\n" + //
                        " | ' / __ _ _ __ ___  _ __  _   _ ___            \r\n" + //
                        " |  < / _  | '_   _ \\| '_ \\| | | / __|           \r\n" + //
                        " | . \\ (_| | | | | | | |_) | |_| \\__ \\           \r\n" + //
                        " |_|\\_\\__,_|_| |_| |_| .__/ \\__,_|___/           \r\n" + //
                        "   _____ _           | |   _       _             \r\n" + //
                        "  / ____(_)          |_|  | |     | |            \r\n" + //
                        " | (___  _ _ __ ___  _   _| | __ _| |_ ___  _ __ \r\n" + //
                        "  \\___ \\| | '_   _ \\| | | | |/ _  | __/ _ \\| '__|\r\n" + //
                        "  ____) | | | | | | | |_| | | (_| | || (_) | |   \r\n" + //
                        " |_____/|_|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|   \r\n" + //
                        "                                                 \r\n" + //
                        "                                                 ");
        System.out.println("================================================");
        System.out.println("============== 1. MULAI PERMAINAN ==============");
        System.out.println("=================== 2. EKSTRA ==================");
        System.out.println("================ 3. GANTI BAHASA ===============");
        System.out.println("=================== 4. CREDIT =================="); 
        System.out.println("=================== 5. KELUAR ==================");
        System.out.println("================================================"); 
        System.out.print("Masukkan Input : ");
        
    }
        
        public static void MainMenuEN() {
            System.out.println();
            System.out.println("   _____                                         \r\n" + //
                            "  / ____|                                        \r\n" + //
                            " | |     __ _ _ __ ___  _ __  _   _ ___          \r\n" + //
                            " | |    / _` | '_ ` _ \\| '_ \\| | | / __|         \r\n" + //
                            " | |___| (_| | | | | | | |_) | |_| \\__ \\         \r\n" + //
                            "  \\_____\\__,_|_| |_| |_| .__/ \\__,_|___/         \r\n" + //
                            "  / ____(_)            | || |     | |            \r\n" + //
                            " | (___  _ _ __ ___  _ |_|| | __ _| |_ ___  _ __ \r\n" + //
                            "  \\___ \\| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|\r\n" + //
                            "  ____) | | | | | | | |_| | | (_| | || (_) | |   \r\n" + //
                            " |_____/|_|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|   \r\n" + //
                            "                                                 \r\n" + //
                            "                                                 ");
            System.out.println("================================================");
            System.out.println("================= 1. START GAME ================");
            System.out.println("=================== 2. EXTRAS ==================");
            System.out.println("============== 3. CHANGE LANGUAGE ==============");
            System.out.println("=================== 4. CREDIT =================="); 
            System.out.println("==================== 5. QUIT ===================");
            System.out.println("================================================");
            System.out.println("*this feature is still in development");                    
        } 
    }
    
    
    
    
        
    
    
    

