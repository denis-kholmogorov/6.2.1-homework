import cards.Bank;
import cards.CreditCard;
import cards.Deposite;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(3000.00);
        bank.setScore(1555.00);
        System.out.println("Остаток на банковском счете " + bank.getScore());
        bank.takeScore(4256);
        System.out.println("Остаток на банковском счете " + bank.getScore() + "\n");
        bank.takeScore(4256);
        System.out.println("Остаток на банковском счете " + bank.getScore() + "\n");

        Deposite deposite = new Deposite(10000);
        deposite.setScore(5000);
        System.out.println("Остаток на депозитном счете " + deposite.getScore());
        deposite.takeScore(2000);
        System.out.println("Остаток на депозитном счете " + deposite.getScore() + "\n");

        CreditCard creditCard = new CreditCard(20000);
        creditCard.setScore(5000);
        System.out.println("Остаток на карте " + creditCard.getScore());
        creditCard.takeScore(2000);
        System.out.println("Остаток на карте " + creditCard.getScore() + "\n");
        creditCard.takeScore(250000);
        System.out.println("Остаток на карте " + creditCard.getScore() + "\n");


    }
}

