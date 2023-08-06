package atmmachineproject;

import java.util.Scanner;

class atm {
    float money = 900000;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);

        int user_id = 713;
        int pin = 713;
        System.out.println("enter your user_id:");
        int a = sc.nextInt();
        System.out.println("enter your pin: ");
        int b = sc.nextInt();
        if (user_id == a && pin == b) {
            System.out.println("atm logged successful...");
            menu();
        } else {
            System.out.println("plz enter a valid pin....");
        }

    }

    public void menu() {
        System.out.println("plz choose option given below.......");
        System.out.println("press 1 = transaction history");
        System.out.println("prees 2 = withdraw");
        System.out.println("press 3 = deposit");
        System.out.println("press 4 = transfer");
        System.out.println("press 5 = quit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            transaction();
        } else if (option == 2) {

            withdraw();
        } else if (option == 3) {
            deposit();
        } else if (option == 4) {
            transfer();
        } else if (option == 5) {
            quit();
        } else {
            System.out.println("enter a valid option....");
        }
    }

    public void transaction() {
        System.out.println("balance is:" + money);
        menu();

    }

    public void withdraw() {
        System.out.println("enter your amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        money = money - amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is:" + money);
        if (amount > money) {
            System.out.println("insufficient balance");
        }
        menu();
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.println("plz enter amount:");
        int amount = sc.nextInt();
        money = money + amount;
        System.out.println("money deposit succesful..");
        System.out.println("current balance is:" + money);
        menu();

    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number:");
        int account = sc.nextInt();

        System.out.println("enter the amount");
        int amount = sc.nextInt();
        money = money - amount;
        System.out.println("money transfer succesful");
        System.out.println("current balance is:" + money);
        menu();
    }

    public void quit() {
        System.out.println("thnx u for using our atm service");
    }
}

public class atminterface {
    public static void main(String[] args) {

        atm obj = new atm();
        obj.checkpin();
    }
}
