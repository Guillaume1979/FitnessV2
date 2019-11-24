import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        TrainingSet set = new TrainingSet("Squat", 10, 15);
        Scanner sc = new Scanner(System.in);
        //ActionOnCsv.createCsv();
        //ActionOnCsv.writeSetInCsv(set);
        //ActionOnCsv.readCsv("./data/data.csv");
        Menu.displaying("./data/menu-principal.txt","Menu principal");
    }
}
