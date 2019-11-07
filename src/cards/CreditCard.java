package cards;

public class CreditCard extends Bank {

    public CreditCard(double score) {
        super(score);
    }

    @Override
    public void takeScore(double score) {
        super.takeScore(score + (score * 0.01));
        System.out.println("Коммиссия составила " + (score * 0.01));
    }
}
