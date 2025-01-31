package DoublyLinkedList.TextEditor;

 class TextEditor {
    private static class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
        }
    }

    private Node current;
    private int size = 0;
    private final int MAX_SIZE = 10;

    public TextEditor() {
        current = new Node(""); // Initial empty state
    }

    // Add new text state
    public void addState(String newText) {
        Node newNode = new Node(newText);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_SIZE) {
            current.prev.prev = null;
            size--;
        }
    }

    // Undo functionality
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo operations available.");
        }
    }

    // Display current state
    public void display() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}
