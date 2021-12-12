package Heroes;

public class Karno extends Exception {
    private double err;

    public Karno(double k) {
        err = k;
    }

    public String toString() {
        return "Сэр, у нас проблемы с коэффициентами: данное значение очевидно не корректно: " + err;
    }
}
