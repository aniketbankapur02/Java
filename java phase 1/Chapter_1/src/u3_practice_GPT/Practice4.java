
/*
 2. Shopping Cart Total with Tax
Problem Statement:
Calculate the total cost of items in a shopping cart, including an 8% tax applied to the subtotal. The tax rate is fixed (hardcoded as a constant). Round the final total to two decimal places.

Examples:

python
Copy
Input: prices = [10.0, 20.0, 30.0]
Output: 64.8  # Subtotal = 60.0, tax = 4.8, total = 64.8

Input: prices = [5.99, 3.50, 12.79]
Output: 24.22  # Subtotal = 22.28, tax = 1.78 (22.28 * 0.08 ≈ 1.7824 → 1.78)

Input: prices = []
Output: 0.0  # No items, total = 0.0
Constraints:

0 <= len(prices) <= 1000

Each price is a non-negative float (e.g., 0.0 <= price <= 1000.0).
 */
package u3_practice_GPT;

import java.util.Scanner;

class ShopItems { // all items
    int id;
    String itemName;
    int itemPrize;

    ShopItems(int id, String itemName, int itemPrize) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrize = itemPrize;
    }

}

class ShopItemsDB { // all items

    static int counter = 0;
    static int MAX = 100;
    static ShopItems store[] = new ShopItems[MAX];

    static void addItems(String itemName, int itemPrize) {
        // for (; counter < MAX ; counter++) {
        store[counter] = new ShopItems(counter + 1, itemName, itemPrize);
        counter++;
        // }
    }

    static void ShowItems() {
        for (int i = 0; i < counter; i++) {
            System.out.println("item id : " + store[i].id + " item Name " + store[i].itemName + " Item prize "
                    + store[i].itemPrize);
        }
    }

}

class ShoppingCart { // selected items
    // int id;
    String itemNameCart[] = new String[100];
    int itemPrizeCart[] = new int[100];

    static int counter3 = 0;

    // ShoppingCart(String itemName, int itemPrize){
    // this.itemNameCart[counter3] = itemName;
    // this.itemPrizeCart[counter3] = itemPrize;
    // // System.out.println(counter3);
    // counter3++;
    // // System.out.println(counter3);
    // }

    void addShoppingCart(String itemName, int itemPrize) {

        // this.id = id;

        // for (int i = 0; i < 100; i++) {

        this.itemNameCart[counter3] = itemName;
        this.itemPrizeCart[counter3] = itemPrize;
        // System.out.println(counter3);
        counter3++;
        // System.out.println(counter3);

        // }
    }

}

class ShoppingCartDB { // selected items
    static int counter2 = 0;
    static int MAX2 = 100;
    static ShoppingCart cart[] = new ShoppingCart[MAX2];
    static {
        for (int i = 0; i < ShoppingCartDB.MAX2; i++) {
            ShoppingCartDB.cart[i] = new ShoppingCart();
        }
    }

    // index = id - 1;
    static void addToCart(int cartId, int itemId) { // card id
        // for (; counter2 < MAX2 ; counter2++) {

        cart[cartId - 1].addShoppingCart(ShopItemsDB.store[itemId - 1].itemName,
                ShopItemsDB.store[itemId - 1].itemPrize);
        // cart[cartId - 1] = new ShoppingCart(ShopItemsDB.store[itemId -
        // 1].itemName,ShopItemsDB.store[itemId - 1].itemPrize);
        // }
        // counter2++;
    }

    static void viewCart(int cartId) {
        for (int i = 0; i < ShoppingCart.counter3; i++) {
            System.out.println("Cart id/userCart id : " + (counter2 + 1) + " item Name "
                    + cart[cartId - 1].itemNameCart[i] + " Item prize " + cart[cartId - 1].itemPrizeCart[i]);
        }
        int billSum = 0;
        for (int i = 0; i < ShoppingCart.counter3; i++) {
            billSum = billSum + cart[cartId - 1].itemPrizeCart[i];
        }
        System.out.println("Prize without TAX : " + billSum);
        System.out.println("Prize with TAX : " + (billSum + (billSum * 0.08)));

    }

    // delete cart
    // update cart
}

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < ShopItemsDB.MAX; i++) {
        // ShopItemsDB.store[i] = new ShopItems(0,"null",0);
        // }

        // for (int i = 0; i < ShoppingCartDB.MAX2; i++) {
        // ShoppingCartDB.cart[i] = new ShoppingCart("null",0);
        // }

        int breakDoWhile = 0;
        do {

            System.out.println(
                    "Choose option to perform \n 1.Add item to Store(admin) \n 2.show Item list to buy \n 3.Add to cart \n 4.View cart and bill \n 5.Exit ");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter item name");
                    String itemName = sc.next();

                    System.out.println(
                            "Enter item prize ");
                    int itemPrize = sc.nextInt();

                    ShopItemsDB.addItems(itemName, itemPrize);
                    break;
                case 2:
                    ShopItemsDB.ShowItems();

                    break;

                case 3:
                    System.out.println("Enter cart id : ");
                    int cartId = sc.nextInt();
                    System.out.println("Enter item id : ");
                    int itemId = sc.nextInt();
                    ShoppingCartDB.addToCart(cartId, itemId);

                    break;

                case 4:
                    System.out.println("Enter cart id : ");
                    int id2 = sc.nextInt();
                    ShoppingCartDB.viewCart(id2);
                    break;
                case 5:
                    breakDoWhile = 1;// breaks do while
                    break;

                default:
                    System.out.println("invalid options choose again");
                    break;
            }

        } while (breakDoWhile == 0);

        sc.close();
    }
}
