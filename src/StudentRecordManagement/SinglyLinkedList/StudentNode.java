package StudentRecordManagement.SinglyLinkedList;

public class StudentNode{
    int rollno;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollno, String name, int age, String grade){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
