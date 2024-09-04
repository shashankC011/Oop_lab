class Employees{
    private String name;
    private String city;
    private int baseSalary;
    private int dearnessAllowance;
    private int houseRent;
    Employees(){
        name = " ";
        city = " ";
        baseSalary = -1;
        dearnessAllowance = -1;
        houseRent  = -1;
    }
    Employees(String name, String city, int baseSalary,int dearnessAllowance, int houseRent){
        this.name = name;
        this.city = city;
        this.baseSalary=baseSalary;
        this.dearnessAllowance = dearnessAllowance;
        this.houseRent= houseRent;
    }
    String getName(){
        return name;
    }
    String getCity(){
        return city;
    }
    int getBaseSalary(){
        return baseSalary;
    }
    int getDearnessAllowance(){
        return dearnessAllowance;
    }
    int getHouseRent(){
        return houseRent;
    }
    int calculateSalary(){
        return (baseSalary+(baseSalary*dearnessAllowance/100)+(baseSalary*houseRent/100));
    }
    void display_Salary(){
            System.out.println("Employee salary is: "+ calculateSalary());
    }
}

class Employees_Q2{
    public static void main(String[] args) {
        Employees e1 = new Employees("Shashank","Delhi",100000,1000,20000);
        e1.display_Salary();
    }
}
