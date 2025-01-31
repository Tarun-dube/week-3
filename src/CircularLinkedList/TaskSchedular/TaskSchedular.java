package CircularLinkedList.TaskSchedular;

class TaskScheduler {
    static class Task {
        int id, priority;
        String name, dueDate;
        Task next;

        Task(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    private Task head = null;
    private Task current = null;

    // Add task at the end
    public void addTask(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Remove task by ID
    public void removeTask(int id) {
        if (head == null) return;
        Task temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // View current task and move to next
    public void nextTask() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task: " + current.name);
            current = current.next;
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.name);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Task A", 2, "2025-02-01");
        scheduler.addTask(2, "Task B", 1, "2025-02-05");
        scheduler.addTask(3, "Task C", 3, "2025-02-10");

        scheduler.displayTasks();
        scheduler.nextTask();
        scheduler.nextTask();
        scheduler.searchByPriority(1);
        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}
