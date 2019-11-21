public class TrainingSet {

    private String exercice;
    private int repetitions;
    private int weight;

    public TrainingSet(String exercice, int repetitions, int weight){
        this.exercice= exercice;
        this.repetitions= repetitions;
        this.weight=weight;
    }

    public String getExercice() {
        return exercice;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getWeight() {
        return weight;
    }
}
