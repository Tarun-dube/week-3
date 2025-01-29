package SinglyLinkedList.SocialMediaFriendConnection;

public class SocialMedia {
    UserNode head;

    public void addUser(UserNode newUser) {

        if(head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while(temp.next != null) {
            temp = temp.next;

        }
        temp.next = newUser;

    }

    public  UserNode findUser(int id){
        UserNode temp = head;
        while(temp != null) {
            if(temp.id == id) {
                return temp;

            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int id1,int id2) {
        UserNode temp1 = findUser(id1);
        UserNode temp2 = findUser(id2);
        if(temp1 == null || temp2 == null) {
            System.out.println("User not found");
            return;
        }
        if(temp1.friend==null){
        temp1.friend=new FriendNode(id2);
        }
        else {
            FriendNode temp=temp1.friend;
            while(temp.next != null) {
                if(temp.friendID==id2){
                    System.out.println("already friend");
                    return;
                }
                temp=temp.next;

            }
            temp.next=new FriendNode(id2);

        }
        if(temp2.friend==null){
        temp2.friend=new FriendNode(id1);
        }
        else {
            FriendNode temp=temp2.friend;
            while(temp.next != null) {
                if(temp.friendID==id1){
                    System.out.println("already friend");
                    return;
                }
                temp=temp.next;

            }
            temp.next=new FriendNode(id1);

        }
        

    }

    public void displayFriends(UserNode user1) {
        FriendNode temp =user1.friend ;
        while(temp != null) {
            System.out.println(temp.friendID);
            temp = temp.next;

        }
    }

    public void countFriends(UserNode user1) {
        FriendNode temp =user1.friend ;
        int count=0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Number of friends: " + count);
    }
    public void mutualFriends(UserNode user1, UserNode user2) {
        FriendNode temp1 = user1.friend ;
        FriendNode temp2 = user2.friend ;
        while(temp1 != null && temp2 != null) {
            if(temp1.friendID == temp2.friendID) {
                System.out.println(temp1.friendID);
            }
            temp2 = temp2.next;
            if(temp2 == null) {
                temp2 = user2.friend;
                temp1 = temp1.next;
            }
        }
    }

    public void searchUser(int id) {
        UserNode temp = head;
        while(temp != null) {
            if(temp.id == id) {
                System.out.println(temp.id);
                System.out.println(temp.name);
                System.out.println(temp.age);

            }
            temp = temp.next;
        }
    }

    public void removeFriend(int id1, int id2) {
        UserNode temp1 = findUser(id1);
        UserNode temp2 = findUser(id2);
        if(temp1 == null || temp2 == null) {
            System.out.println("User not found");
            return;
        }

        FriendNode f1=temp1.friend;
        FriendNode f2=temp2.friend;


        //removing 2 from 1
        if(temp1.friend.friendID == id2){
            temp1.friend=f1.next;

        }else {
            while (f1 != null) {

                if(f1.friendID == id2) {
                    f1= f1.next;
                    break;
                }
                f1 = f1.next;
            }

        }

        //removing 1 from 2
        if(temp2.friend.friendID == id1){
            temp2.friend=f2.next;

        }
        else {
            while (f2 != null) {
                if(f2.friendID == id2) {
                    f2= f2.next;
                    break;
                }
                f2 = f2.next;
            }

        }


    }



}
