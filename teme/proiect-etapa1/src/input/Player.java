package input;

import simulate.Contract;

public abstract class Player{
    protected int id;
    protected int initialBudget;
    protected boolean isBankrupt;
    protected Contract contract;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInitialBudget() {
        return initialBudget;
    }

    public void setInitialBudget(int initialBudget) {
        this.initialBudget = initialBudget;
    }

    public boolean checkBankruptcy() {
        isBankrupt = initialBudget < 0;
        return isBankrupt;
    }

    public void addToBudget(int sum) {
        initialBudget += sum;
    }

    public abstract void pay();

    public void setContract(Contract theContract) {
        contract = theContract;
    }

    public Contract getContract() {
        return contract;
    }

    public abstract void getIncome();

    public boolean isBankrupt() {
        return isBankrupt;
    }
}
