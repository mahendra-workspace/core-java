package OOP;

public class Account {
    private String name;
    private double balance;
    private String location;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        } else{
            System.out.println("Invalid balance amount! ");
        }
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location=  location;
    }
    
}

 class Main {
    public static void main(String[] args){

        Account myAccount  = new Account();

        myAccount.setName("Mahendra");
        myAccount.setBalance(5000.75);
        myAccount.setLocation("New Delhi");

        System.out.println("Account Holder: "+ myAccount.getName());
        System.out.println("Balance: "+myAccount.getBalance());
        System.out.println("Location: "+ myAccount.getLocation());

        myAccount.setBalance(-1000.00);
    }
}
