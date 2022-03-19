package BankAccount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map <Integer, BankAccount> bankAccounts = new LinkedHashMap<>();
        while (!command.equals("End")){
            String output = null;
            String [] tokens = command.split("\\s+");
            if (tokens[0].equals("Create")){
                BankAccount account = new BankAccount();
                bankAccounts.put(account.getId(), account);
                output = "Account ID" + account.getId() +  " created";
            } else if (tokens [0].equals("Deposit")){
                int ID = Integer.parseInt(tokens [1]);
                int amount = Integer.parseInt(tokens [2]);
                if (!bankAccounts.containsKey(ID)){
                    output = "Account does not exist";
                }else {
                    bankAccounts.get(ID).deposited(amount);
                    output = "Deposited " + amount +  " to ID" + ID;
                }
            }else if (tokens[0].equals("SetInterest")){
                BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
            } else {
                int ID = Integer.parseInt(tokens [1]);
                int years = Integer.parseInt(tokens [2]);
                if (!bankAccounts.containsKey(ID)){
                    output = "Account does not exist";
                }else {
                    double interest = bankAccounts.get(ID).getInterest(years);
                    output = String.format("%.2f", interest);
            }

        }
            if (output != null){
                System.out.println(output);
            }

            command = scanner.nextLine();
    }
}}
