package brodect;

import java.util.Scanner;

public class Brodect {

    public static void main(String[] args) {
        String[][] products = new String[100][4];
        String[][] customers = new String[100][3];
        int productCount = 0;
        int customerCount = 0;

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pharmacy Management System");
            System.out.println("1. Add product");
            System.out.println("2. Add customer");
            System.out.println("3. Display products");
            System.out.println("4. Display customers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: \n");
            choice = scanner.nextInt();
            clean();
            switch (choice) {
                case 1:
                    productCount = addProduct(products, productCount);
                    break;
                case 2:
                    customerCount = addCustomer(customers, customerCount);
                    break;
                case 3:
                    displayProducts(products, productCount);

                    break;
                case 4:
                    displayCustomers(customers, customerCount);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again ");
                    break;
            }
        } while (choice != 0);
    }

    static int addProduct(String products[][], int productCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        clean();
        System.out.print("Enter product code: ");
        String code = scanner.nextLine();
        clean();
        System.out.print("Enter product price: ");
        String price = scanner.nextLine();
        clean();
        System.out.print("Enter product quantity: ");
        String quantity = scanner.nextLine();
        clean();

        products[productCount][0] = name;
        products[productCount][1] = code;
        products[productCount][2] = price;
        products[productCount][3] = quantity;

        productCount++;

        System.out.println("Product added successfully!\n"
                + "-----------------------------------------------------------\n\n");
        return productCount;
    }

    static int addCustomer(String customers[][], int customerCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        clean();
        System.out.print("Enter customer ID: ");
        String id = scanner.nextLine();
        clean();
        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();
        clean();
        customers[customerCount][0] = name;
        customers[customerCount][1] = id;
        customers[customerCount][2] = address;

        customerCount++;

        System.out.println("Customer added successfully!\n"
                + "-------------------------------------------------\n\n");
        return customerCount;
    }

    static void displayProducts(String products[][], int productCount) {
        if (productCount == 0) {
            System.out.println(" Ther is not any  broduct \n"
                    + "-------------------------------------------\n\n");
            return;
        }

        System.out.println("Products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println("Name: " + products[i][0]);
            System.out.println("Code: " + products[i][1]);
            System.out.println("Price: " + products[i][2]);
            System.out.println("Quantity: " + products[i][3]);
            System.out.println("-------------------------\n\n");
        }
    }

    static void displayCustomers(String customers[][], int customerCount) {
        if (customerCount == 0) {
            System.out.println("There is not any customer !\n"
                    + "----------------------------------------------\n\n");
            return;
        }

        System.out.println("Customers:");
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Name: " + customers[i][0]);
            System.out.println("ID: " + customers[i][1]);
            System.out.println("Address: " + customers[i][2]);
            System.out.println("-----------------------\n\n");
        }
    }

    static void clean() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n");

    }
}
