package StudentRecordManagement.SinglyLinkedList;

public class StudentRecord {
    public StudentNode head;

    public void add(StudentNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            StudentNode temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void addStart(int rollNo, String name, int age, String grade) {
        StudentNode temp = new StudentNode(rollNo, name, age, grade);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void addPosition(StudentNode newNode, int position) {

        StudentNode temp = this.head;
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

    public void search(int rollno) {

        StudentNode temp = this.head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                System.out.println(temp.name);
                System.out.println(temp.age);
                System.out.println(temp.grade);

                return;

            }
            temp = temp.next;
        }
    }

    public void update(int rollno, String newgrade) {

        StudentNode temp = this.head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                temp.grade = newgrade;
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        StudentNode temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.rollno + "," + temp.name + "," + temp.age + "," + temp.grade + "->");
            temp = temp.next;
        }
        System.out.println(temp.rollno + "," + temp.name + "," + temp.age + "->Null");
    }


    public void delete(int rollno) {
        if (head == null) {
            return;
        }
        if (head.rollno == rollno) {
            head = head.next;
            return;
        }
        StudentNode temp = this.head;
        while (temp.next != null) {
            if (temp.next.rollno == rollno) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }
}
