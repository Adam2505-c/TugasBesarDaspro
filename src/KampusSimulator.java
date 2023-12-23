import java.io.IOException;
import controller.GameController1;
import ui.MainUI;


public class KampusSimulator {
    public static void main(String[] args) throws IOException {
    try {
        MainUI.MainMenu();
        GameController1.PilihanMainMenu();
    } catch (Exception e) {
    }
    }   
}  
