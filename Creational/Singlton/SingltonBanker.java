class Account{
    private double Acc_Number;
    private String name;
    private int balance;

    Account(double no,String n,int bal){
        Acc_Number = no;
        name = n;
        balance = bal;
    }

    public void setAcc_Number(double acc_Number) {
        Acc_Number = acc_Number;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }


    public double getAcc_Number() {
        return Acc_Number;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    public void AccountInfo(){
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Account number : " + Acc_Number);
        System.out.println();
    }

}

final class Banker{
    private String Value;
    Account A1;

    private static Banker B;
    private Banker(String x){
        System.out.println("Creating Singlton Banker");
       // Value=x;
    }

    public static Banker getBanker(String V){
        
            if(B==null){
                B = new Banker(V);
            
            }
        return B;
    }

    public String getValue() {
        return Value;
    }

    public Account openAccount(Double d,String name,int x){
        A1 = new Account(d, name, x);
        A1.AccountInfo();
        return A1;
    }

    public void printmsg(String m){
        System.out.println(m);
    }

    
}


public class SingltonBanker {
    public static synchronized void printdata(String Data){
        Banker b1 = Banker.getBanker(Data);
        System.out.println(b1);
    }
    public static void main(String[] args) {
        // Account A1,A2;

        // Banker b1 =Banker.getBanker("FirstBanker");
        // Banker b2 =Banker.getBanker("SecondBanker");

        // System.out.println(b1.getValue());
        // System.out.println(b2.getValue());

        // A1=b1.openAccount(102d, "XYZ", 10000);
        // A2=b1.openAccount(103d, "ABC", 5000);
       
        Runnable r1 = new Runnable() {
            public void run(){
                printdata("XYZ");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

    
    }
}
