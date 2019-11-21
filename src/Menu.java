import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String choicesMenu;
    private int menuSelection;
    private List<String> menu;

    public Menu(List<String> menu, int menuSelection){
        this.menu = menu;
        this.menuSelection = menuSelection;
    }

    public static void readFirstMenuFile(){
        System.out.println("toto");
    }

    public static List<String> selectedMenu(){
        List<String> menu = new ArrayList<>();
        return menu;
    }

 /* // création du menu ou des menus (à voir si possible) pour afficher les options utilisateurs "menu principal etc..."
 public static void displaying{
        BufferedReader br = new BufferedReader(new FileReader())

    }
*/



}
