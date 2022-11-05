package Animal;
public class Cobra extends Reptil{
    private boolean peconha;
    private boolean sensorDeCalor;

    public boolean isPeconha() {
        return peconha;
    }

    public boolean isSensorDeCalor() {
        return sensorDeCalor;
    }

    public void setPeconha(boolean peconha) {
        this.peconha = peconha;
    }

    public void setSensorDeCalor(boolean sensorDeCalor) {
        this.sensorDeCalor = sensorDeCalor;
    }
}