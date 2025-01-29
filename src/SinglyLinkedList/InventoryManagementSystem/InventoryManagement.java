package SinglyLinkedList.InventoryManagementSystem;

import SinglyLinkedList.StudentRecordManagement.StudentNode;

public class InventoryManagement {
    public ItemNode head;

    public void addend(ItemNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            ItemNode temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void addStart(ItemNode newNode) {

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addPosition(ItemNode newNode, int position) {

        ItemNode temp = this.head;
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void search(int id) {

        ItemNode temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(temp.name);
                System.out.println(temp.price);
                System.out.println(temp.quantity);
                System.out.println("total value"+temp.quantity*temp.price);

                return;

            }
            temp = temp.next;
        }
    }

    public void update(int id, int newQuantity) {

        ItemNode temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        ItemNode temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.id + "," + temp.name + "," + temp.quantity + "," + temp.price +","+temp.price*temp.quantity+ "->");
            temp = temp.next;
        }
        System.out.println(temp.id + "," + temp.name + "," + temp.quantity+","+ temp.price +","+temp.price*temp.quantity+ "->Null");
    }


    public void remove(int id) {
        if (head == null) {
            return;
        }
        if (head.id == id) {
            head = head.next;
            return;
        }
        ItemNode temp = this.head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }

}
