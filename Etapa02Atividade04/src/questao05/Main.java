package questao05;

public class Main {
    public static void main(String[] args) {
        int maxNumbers = 50;
        int numberOfSlots = 6;

        BingoSystem bingoSystem = BingoSystem.getInstance();

        bingoSystem.subscribe(new BingoCard(1, bingoSystem, numberOfSlots, maxNumbers));
        bingoSystem.subscribe(new BingoCard(2, bingoSystem, numberOfSlots, maxNumbers));
        bingoSystem.subscribe(new BingoCard(3, bingoSystem, numberOfSlots, maxNumbers));
        bingoSystem.subscribe(new BingoCard(4, bingoSystem, numberOfSlots, maxNumbers));
        bingoSystem.subscribe(new BingoCard(5, bingoSystem, numberOfSlots, maxNumbers));

        bingoSystem.startBingo(maxNumbers);
    }
}
