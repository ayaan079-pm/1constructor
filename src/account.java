public class account {
    String accountholder;
    double balance;
    account(String A,double B){
        accountholder=A;
        balance=B;



    }
    void showBalance(){
        System.out.println("the accountholder is: "+ accountholder);
        System.out.println("the balance is: "+ balance);

    }
    public static void main(String[] args) {

        account account1 = new account("ayaan", 500.0);
        account account2 = new account("mohamed", 1000.0);

        account1.showBalance();
        account2.showBalance();
    }
}

