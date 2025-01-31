package CircularLinkedList.RoundRobin;

class RoundRobinScheduler {
    static class Process {
        int id, burstTime, priority;
        Process next;

        Process(int id, int burstTime, int priority) {
            this.id = id;
            this.burstTime = burstTime;
            this.priority = priority;
            this.next = null;
        }
    }

    private Process head = null;
    private Process current = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at the end
    public void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove process by ID
    public void removeProcess(int id) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Process last = head;
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

    // Simulate round-robin scheduling
    public void executeProcesses() {
        if (head == null) return;
        current = head;
        int totalTime = 0, completedProcesses = 0;
        double totalWaitingTime = 0, totalTurnaroundTime = 0;

        while (completedProcesses < countProcesses()) {
            if (current.burstTime > 0) {
                int executeTime = Math.min(timeQuantum, current.burstTime);
                current.burstTime -= executeTime;
                totalTime += executeTime;
                System.out.println("Executing Process ID: " + current.id + " for " + executeTime + " units.");

                if (current.burstTime == 0) {
                    completedProcesses++;
                    totalTurnaroundTime += totalTime;
                    totalWaitingTime += (totalTime - executeTime);
                    removeProcess(current.id);
                }
            }
            current = current.next;
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / completedProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / completedProcesses));
    }

    // Count processes in the circular queue
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        scheduler.executeProcesses();
    }
}