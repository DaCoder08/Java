package code;

import java.util.HashMap;
import java.util.Map;

public class Bank{
    protected Map<String, Integer> bank = new HashMap<>();

    private String name;

    public Bank(String bank_name) {
        this.name = bank_name;
    }

    public void addNewPerson(String name,int value){
        bank.put(name,value);
    }
    public int getValue(String name){
        return bank.get(name);
    }
    public void addMoney(String name, int cost){
        bank.replace(name, cost+bank.get(name));
    }
    public String getBank(){
        return bank.toString();
    }
    public String getName(){
        return this.name;
    }
}
