package SinglyLinkedList.InventoryManagementSystem;


public class Main {
    public static void main(String[] args) {

        InventoryManagement item = new InventoryManagement();


        //add at end

        item.addend(new ItemNode("milk",101,2,32));
        item.addend(new ItemNode("apple",102,2,50));
        item.addend(new ItemNode("pepsi",103,2,32));

        item.display();

        //add at start
        item.addStart(new ItemNode("coke",104,2,45));
        item.display();

        //delete
        item.remove(102);
        item.display();

        //add at position
        item.addPosition(new ItemNode("chips",107,20,10),2);
        item.display();

        //update
        item.update(107,10);
        item.display();

        //search
        item.search(101);



    }
}
