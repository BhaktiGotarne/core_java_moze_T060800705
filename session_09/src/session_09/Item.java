package session_09;

import java.util.Scanner;

public class Item {
    private String name;
    private double price;
    private int stock;
    private double amount;
    private static double totalAmt = 0; // Making totalAmt static

    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void calAmount() {
        amount = price * stock;
        totalAmt += amount;
        System.out.println("Amount of stock is " + amount);
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }

    public static void billAmount() {
        System.out.println("Total Amount is: " + totalAmt);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of items = ");
        int no = s.nextInt();
        Item item[] = new Item[no];
        String iname;
        double pr;
        int st;
        for (int i = 0; i < item.length; i++) {
            System.out.println("Enter Item name = ");
            iname = s.next();
            System.out.println("Enter price = ");
            pr = s.nextDouble(); // corrected method name
            System.out.println("Enter stock = ");
            st = s.nextInt();
            item[i] = new Item(iname, pr, st);
            System.out.println(item[i]);
            item[i].calAmount();
        }
        Item.billAmount();
    }
}

