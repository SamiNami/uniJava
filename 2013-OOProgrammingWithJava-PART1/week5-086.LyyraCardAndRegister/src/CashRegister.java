
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven < PRICE_OF_ECONOMICAL) {
            return cashGiven;
        }
        this.cashInRegister += PRICE_OF_ECONOMICAL;
        this.economicalSold++;
        return cashGiven - PRICE_OF_ECONOMICAL;
    }

    public double payGourmet(double cashGiven) {

        if (cashGiven < PRICE_OF_GOURMET) {
            return cashGiven;
        }
        this.cashInRegister += PRICE_OF_GOURMET;
        this.gourmetSold++;
        return cashGiven - PRICE_OF_GOURMET;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() < PRICE_OF_ECONOMICAL) {
            return false;
        }
        this.economicalSold++;
        card.pay(PRICE_OF_ECONOMICAL);
        return true;
    }

    public boolean payGourmet(LyyraCard card) {

        if (card.balance() < PRICE_OF_GOURMET) {
            return false;
        }
        this.gourmetSold++;
        card.pay(PRICE_OF_GOURMET);
        return true;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum < 0) {
            return;
        }
        this.cashInRegister += sum;
        card.loadMoney(sum);
    }

}
