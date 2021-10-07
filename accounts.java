public class accounts {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public  accounts(){
        System.out.println("Empty constructor called");
        System.out.println("just did it for git commit");
        System.out.println("this is oops project for bankaccount")
            System.out.printLn("this is one of the code in bankaccount project")
            System.out.println("just add commit and verify")
            
            
    }
    public accounts(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Account constructor with paramters called");
        this.number = number;
        this.balance = balance;
        this.customerName =customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;
    }

    public accounts(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("999999",10.55,customerName,customerEmailAddress,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("deposit of "+depositAmount+" made. new balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance -withdrawalAmount < 0){
            System.out.println("Only "+this.balance+"available.wihtdrawal not processed");
        }else {
           this.balance-=withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount+" processed. remaining balance = "+this.balance);
        }
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
