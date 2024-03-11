package Yrok_13_11_23;

public class Account {
    String ower;
    double balance;
    String history = " ";
    double spentMoney;

    void add (double money) {
        balance = balance + money;
        System.out.println(" На счёт " + ower + "  добавлено " + money + " тг");
    }

    void pay (Product product) {
        if (product.price <= balance) {
            balance = balance - product.price;
            history += product.name + " ";
           spentMoney += product.price;
            System.out.println(" Со счёта " + ower + "  потрачено  " + product.price + " тг");

        } else {
            System.out.println("Недостаточно средств");
        }

    }

    void display () {
        System.out.println("Владелец счета: " + ower);
        System.out.println("История покупок: " + history );
        System.out.println("Текущий баланс:  " + balance);
        System.out.println("Потрачено: " + spentMoney);
        System.out.println();
    }


    void transfer (Account otherAccount, double money) {
        if (money <= balance) {
            otherAccount.balance += money;
            balance -= money;
            System.out.println("Со счета " + ower + " перевели на счет " + otherAccount + " сумму в размере " + money + " тг");
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
