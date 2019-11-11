package cards;

public class Bank {

    private double score;

    public Bank(double score){
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {

            this.score += score;
            System.out.println("Счет пополнен на сумму " + score);
        }

    public void takeScore(double score){
        if (this.getScore() >= score) {
            this.score -= score;
            System.out.println("Снятие наличных " + score);
        }
        else {
            System.out.println("На счету нехватает средств!");
        }

    }
}
