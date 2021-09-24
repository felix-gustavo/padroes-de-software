package questao05;

import java.util.ArrayList;
import java.util.Random;

public class BingoCard implements Observer {
    private int cardId;
    private ArrayList<Integer> numbers;
    private BingoSystem subject;

    public BingoCard(int cardId, BingoSystem subject, int numberOfSlots, int maxNumber) {
        this.cardId = cardId;
        this.subject = subject;
        this.numbers = this.initializeNumbers(numberOfSlots, maxNumber);
    }

    private ArrayList<Integer> initializeNumbers (int numberOfSlots, int maxNumber) {
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0; i<numberOfSlots; i++)
            nums.add(new Random().nextInt(maxNumber));

        return nums;
    }

    @Override
    public void update(int drawnNumber) {
        this.numbers.forEach(num -> {
            if(num == drawnNumber) this.numbers.set(this.numbers.indexOf(num), -1);
        });

        if (this.didIWin()) this.subject.bingo("cardId: " + this.cardId);
    }

    private boolean didIWin() {
        for (int num : this.numbers){
            if(num != -1) return false;
        }
        return true;
    }
}
