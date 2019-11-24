import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

/*    private String choicesMenu;
    private int menuSelection;
    private List<String> menu;*/

/*    public Menu(List<String> menu, int menuSelection){
        this.menu = menu;
        this.menuSelection = menuSelection;
    }*/

    /*    public static List<String> selectedMenu(){
            List<String> menu = new ArrayList<>();
            return menu;
        }*/
    public static String menuChoice() {
        String menuLabel = "Menu principal";
        String path = null;
        if (menuLabel == "Menu principal") {
            path = "./data/menu-principal.txt";
        } else {
            path = "./data/menu-stats.txt";
        }
        return path;
    }


    // création du menu ou des menus (à voir si possible) pour afficher les options utilisateurs "menu principal etc..."
    public static void displaying(String path, String menuLabel) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            System.out.println(menuLabel + " :");
            String currentLine;
            for (int i = 0; (currentLine = br.readLine()) != null; i++) {
                System.out.println(i + " - " + currentLine);
            }
        } catch (Exception e) {
            System.err.println("Erreur lecture fichier menu");
        }

    }


}
