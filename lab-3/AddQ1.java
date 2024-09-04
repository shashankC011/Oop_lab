class Money{
    int balance;
    int creditScore;

    Money(int balance,int creditScore){
        this.balance = balance;
        this.creditScore = creditScore;
    }
    int getBalance(){
        return this.balance;
    }
    public int getCreditScore() {
        return creditScore;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

}

class PersonalDetails{
    private int age;
    String name;
    PersonalDetails(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

class Bank{
    PersonalDetails person;
    Money money;
    Bank(PersonalDetails person, Money money){
        this.person = person;
        this.money = money; 
    }
    void printDetails(){
        System.out.println("age: "+ person.getAge());
        System.out.println("name: "+ person.getName());
        System.out.println("balance: "+ money.getBalance());
        System.out.println("credit: "+ money.getCreditScore());
    }
}

class Test {
    public static void main(String[] args) {

        PersonalDetails personDetails = new PersonalDetails(30, "Alice");
        Money moneyDetails = new Money(5000, 700);
        Bank bank = new Bank(personDetails, moneyDetails);

        // Print details
        bank.printDetails();
    }
}

