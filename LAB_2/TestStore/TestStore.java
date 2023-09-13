package TestStore;

import java.util.Scanner;

class Item {
    private String itemName, itemidNo;
    private int itemQuantity = 1;
    private double itemPrice = 500;

    Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    Item(String itemName, String itemidNo, int itemQuantity) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
    }

    Item(String itemName, String itemidNo) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
    }

    public void set_itemName(String itemName) {
        this.itemName = itemName;
    }

    public void set_itemidNo(String itemidNo) {
        this.itemidNo = itemidNo;
    }

    public void set_itemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void set_itemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String get_itemName() {
        return itemName;
    }

    public String get_itemidNo() {
        return itemidNo;
    }

    public int get_itemQuantity() {
        return itemQuantity;
    }

    public double get_itemPrice() {
        return itemPrice;
    }
}

class Customer {
    private String name;
    private String idNo;
    private double balance = 5000;
    private Item item;

    Customer(String name, String id, double balance) {
        this.name = name;
        idNo = id;
        this.balance = balance;
    }

    Customer(String name, String id) {
        this.name = name;
        idNo = id;
    }

    public void print_item_details() {
        System.out.println("Details:");
        System.out.println("Item Name- " + item.get_itemName());
        System.out.println("Item ID- " + item.get_itemidNo());
        System.out.println("Item Quantity- " + item.get_itemQuantity());
        System.out.println("Item Price- " + item.get_itemPrice());
    }

    public void buyItem(Item brought_item) {
        if (balance < (brought_item.get_itemPrice() * brought_item.get_itemQuantity())) {
            System.out.println("Insufficient balance");
            return;
        } else if (brought_item.get_itemQuantity() < 2) {
            System.out.println("Order not valid");
        } else {
            item = brought_item;
            this.balance -= ((brought_item.get_itemQuantity()) * (brought_item.get_itemPrice()));
            print_item_details();
            System.out.println("");
            System.out.println("Current Balance- " + this.balance);
        }
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_idNo(String id) {
        this.idNo = id;
    }

    public String get_name() {
        return name;
    }

    public String get_idNo() {
        return idNo;
    }

    public double get_balance() {
        return balance;
    }

    public Item get_item_details() {
        return item;
    }
}

public class TestStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Customer name:  ");
        String name = scanner.nextLine();
        System.out.print("Enter the Customer id:  ");
        String id = scanner.nextLine();
        System.out.print("Enter the Customer Balance:  ");
        double balance = scanner.nextDouble();
        Customer c1 = new Customer(name, id, balance);

        System.out.println("Item1:");
        System.out.print("Enter the Item name:  ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter the Item id:  ");
        id = scanner.nextLine();
        System.out.print("Enter the Item Quantity:  ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the Item Price:  ");
        double price = scanner.nextDouble();
        Item item1 = new Item(name, id, quantity, price);

        System.out.println("Item2:");
        System.out.print("Enter the Item name:  ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter the Item id:  ");
        id = scanner.nextLine();
        System.out.print("Enter the Item Quantity:  ");
        quantity = scanner.nextInt();
        System.out.print("Enter the Item Price:  ");
        price = scanner.nextDouble();
        Item item2 = new Item(name, id, quantity, price);

        System.out.println("");

        c1.buyItem(item1);
        System.out.println("");
        c1.buyItem(item2);

        scanner.close();
    }
}
