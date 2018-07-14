package code;

public class MakeBank {
    public static void main(String args[]){
        Bank MyBank = new Bank("The Bank of Computers");
        MyBank.addNewPerson("Bob",5000);
        MyBank.addNewPerson("Joe",6000);
        MyBank.addNewPerson("Bill",7000);
        MyBank.addNewPerson("Leo",8000);
        System.out.println("The Bank Is "+MyBank.getBank());
        MyBank.addMoney("Bill",3000);
        System.out.println("The New Bank Is "+MyBank.getBank());
    }
}
