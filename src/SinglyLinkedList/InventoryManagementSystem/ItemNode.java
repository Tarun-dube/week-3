package SinglyLinkedList.InventoryManagementSystem;

public class ItemNode{

    
    String name;
    int id;
    int quantity;
    int price;
    ItemNode next;

    ItemNode(String name, int id, int quantity, int price) {
       this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        next = null;
    }
}
