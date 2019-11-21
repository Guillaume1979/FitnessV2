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


}
