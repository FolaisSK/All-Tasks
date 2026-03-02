package bankApp;

import java.util.ArrayList;

public class CBN {
    private ArrayList<Bank> banks;

    public CBN(){
        this.banks = new ArrayList<>();
    }

    public Bank createBank(String name){
        Bank bank = new Bank(name);
        banks.add(bank);
        return bank;
    }

    public ArrayList<Bank> getAllBanks(){
        return banks;
    }

    private Bank getBankByBankName(String name){
        for(Bank bank : banks){
            if(bank.getName().equals(name)) return bank;
        }
        return null;
    }

    private void validateBank(Bank bank){
        if(bank == null) throw  new IllegalArgumentException("Bank does not exist");
    }
}
