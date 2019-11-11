package cards;

import java.util.Calendar;

public class Deposite extends Bank {

    private Calendar calendar = Calendar.getInstance();

    private int mounth;

    public Deposite(double score) {
        super(score);
    }

    @Override
    public void setScore(double score) {
        super.setScore(score);
        this.mounth = calendar.get(Calendar.MONTH);
    }

    @Override
    public void takeScore(double score) {
        if (this.mounth != calendar.get(Calendar.MONTH)) {
            super.takeScore(score);
        } else {
            System.out.println("Вы не можете снять деньги в этом месяце");
        }
    }
}


