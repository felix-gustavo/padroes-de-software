package questao05;

public interface Subject {
    void subscribe(Observer observer);
    void notifyObservers();
}
