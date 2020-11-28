package com.company;

import java.util.Scanner;

public class Account_1 extends User{

    public int available_sum;
    public int charity_sum;
    int mark = 1;


    public Account_1(String name, String surname, int age, int number_of_accounts, int available_sum, int charity_sum) {
        super(name, surname, age, number_of_accounts);
        this.available_sum = available_sum;
        this.charity_sum = charity_sum;

    }
    public void Block(){
        System.out.println("Account has been blocked");
        mark = mark - 1;
        this.number_of_accounts = this.number_of_accounts - 1;
    }
    public void Unlock(){
        if(mark == 0){
            System.out.println("Account has been unlocked");
            mark = mark + 1;
            this.number_of_accounts = this.number_of_accounts + 1;
        }
        else{
            System.out.println("Account is not blocked");
        }
    }
    public void transfer(){
        if(available_sum > 0){
            Scanner n = new Scanner(System.in);
            System.out.println("Please enter a sum");
            int s = n.nextInt();
            available_sum = available_sum - s;
            System.out.println("Your available sum is " + available_sum);
        }
    }
    public void current(){
        System.out.println("Your available sum is " + available_sum);
    }

}
