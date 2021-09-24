package questao05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoSystem implements Subject {
    private static BingoSystem uniqueInstance;
    private List<Observer> bingoCards;
    private int numberDrawn;
    private boolean gameEnded;

    private BingoSystem() {
        this.bingoCards = new ArrayList<Observer>();
    }

    public static BingoSystem getInstance() {
        if(uniqueInstance == null) return new BingoSystem();
        return uniqueInstance;
    }

    @Override
    public void subscribe(Observer observer) {
        this.bingoCards.add(observer);
    }

    @Override
    public void notifyObservers() {
        this.bingoCards.forEach(bingo -> bingo.update(this.numberDrawn));
    }

    public void startBingo(int maxNumber) {
        while(!gameEnded) {
            this.numberDrawn = new Random().nextInt(maxNumber);
            this.notifyObservers();
        }
    }

    public void bingo(String message) {
        this.gameEnded = true;
        System.out.println(message);
    }
}
