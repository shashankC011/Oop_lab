class Account{
    String name;
    int accNo;
    String accType;
    int balance;
    Account(){
        name = null;
        accType = null;
        accNo =  -1;
        balance = 0;
    }
    Account(String name, int accNo, String accType){
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        balance = 0;
    }
    void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:  "+amount+ " Balance is: "+balance);
        }   
        else{
            System.out.println("Deposit amount must be postiive");
        }
    }
    void display_Balance(){
        System.out.println("Balance is: "+balance);
    }

}


class CurrentAccount extends Account{
    final int minAmt = 3000;
    final int serviceCharge = 500;
    public CurrentAccount(String name, int accNo) {
        super(name, accNo, "Current");
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:   " + amount+ "  New balance: "+ balance);
            applyPenalty();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void applyPenalty() {
        if (balance < minAmt) {
            balance -= serviceCharge;
            System.out.println("Service charge applied. New balance: "+ balance);
        }
    }
}


class SavingsAccount extends Account{
    final double InterestRate = 0.04;
    final double CompoundingPeriods = 12;

    public SavingsAccount(String name, int accNo) {
        super(name, accNo, "Savings");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: "+amount+ "   New balance: "+ balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void computeInterest() {
        double interest = balance * Math.pow(1 + InterestRate / CompoundingPeriods, CompoundingPeriods) - balance;
        balance += interest;
        System.out.println("Interest computed and added. New balance: "+ balance);
    }
}


class Q1{
    public static void main(String[] args) {
        CurrentAccount currentAcc = new CurrentAccount("Shashank", 12789);
        currentAcc.deposit(1200);
        currentAcc.withdraw(300);   
        currentAcc.display_Balance();

        // Create and test SavingsAccount
        SavingsAccount savingsAcc = new SavingsAccount("Parth", 98321);
        savingsAcc.deposit(1500);
        savingsAcc.computeInterest();
        savingsAcc.withdraw(200);
        savingsAcc.display_Balance();
    }
}
