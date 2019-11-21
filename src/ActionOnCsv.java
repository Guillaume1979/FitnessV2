import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ActionOnCsv {

    private static String pathFileOfSet = "./data/data.csv";
    private static File file = new File(pathFileOfSet);
    private static final String TEXTCSV = "%s;%d;%.2d";

    // /home/bnp-renault-008/Bureau/java/Fitness-Project-V2/src
    public static void createCsv() {
        try {
            //Création du fichier CSV pour stocker les données de l'utilisateur s'il n'existe pas
            if (!file.exists()) {
                file.createNewFile();
                BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
                //ajout d'une ligne d'entete à la création
                bw.write("EXERCISE;REPETITION;WEIGHT");
                bw.newLine();
                bw.close();
            }
        } catch (Exception e) {
            System.err.println("Erreur dans la création du fichier de données recensant les sets");
        }
    }

    public static void writeSetInCsv(TrainingSet set) {
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            //Utilisation d'une méthode de String pour formater la chaine de caractère à écrire dans le csv sur le format "Exo ; Nbrep ; Poids" avec les attribts de l'objet de type TrainingSet instancié par ailleurs
            bw.write(String.format(TEXTCSV, set.getExercice(), set.getRepetitions(), set.getWeight()));
            System.out.println(String.format(TEXTCSV, set.getExercice(), set.getRepetitions(), set.getWeight()));
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.err.println("Erreur d'écriture dans le fichier de données");
        }
    }
}
