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

    public void setExercice(String exercice) {
        this.exercice = exercice;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
