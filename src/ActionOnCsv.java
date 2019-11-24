import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionOnCsv {

    private static String pathFileOfSet = "./data/data.csv";
    private static File file = new File(pathFileOfSet);
    private static final String TEXTCSV = "%s;%d;%d"; //mise en forme des données de l'objet Training set plus bas pour écriture danss le csv (ajout des ";")

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
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.err.println("Erreur d'écriture dans le fichier de données");
        }
    }

    public static List<TrainingSet> readCsv(String path) {
        List<TrainingSet> sets = new ArrayList<>();
        try {
            if (path.equals(pathFileOfSet)) {
                BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                String currentLine;
                for (int i = 0; (currentLine = br.readLine()) != null; i++) {
                    if (i == 0) {
                        i++;
                    } else {
                        String[] s = currentLine.split(";");
                        TrainingSet set = new TrainingSet(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                        System.out.println("exo = " + set.getExercice() + " nb rep = " + set.getRepetitions() + " poids = " + set.getWeight());
                        sets.add(set);
                    }
                }

            }

        } catch (Exception e) {
            System.err.println("Erreur de lecture du fichier de données sportives");
        }
        return sets;
    }
}
