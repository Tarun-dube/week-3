package StudentRecordManagement.SinglyLinkedList;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRecord st = new StudentRecord();


        //add at end
     st.add(new StudentNode(1,"Tarun",21,"A"));
     st.add(new StudentNode(2,"Sankalp",22,"B"));
        st.add(new StudentNode(3,"Samantha",23,"C"));
        st.add(new StudentNode(4,"Samay",24,"D"));

        st.display();

        //delete
        st.delete(4);
        st.display();

        //add at position
        st.addPosition(new StudentNode(5,"tanuj",20,"u"),4);
        st.display();

        //update
        st.update(2,"D");
        st.display();

        //search
        st.search(3);



    }
}
