

public class Main {


    public static void main(String[] args) {
        TrainingSet set = new TrainingSet("Squat", 10, 15);
        ActionOnCsv.createCsv();
        ActionOnCsv.writeSetInCsv(set);
        ActionOnCsv.readCsv("./data/data.csv");
    }
}
