package SinglyLinkedList.SocialMediaFriendConnection;

public class UserNode {
    String name;
    int id;
    int age;
    FriendNode friend;
    UserNode next;

    UserNode(String name, int id, int age) {
        this.name = name;
        this.id = id;
       this.age = age;
        next = null;
    }
}

