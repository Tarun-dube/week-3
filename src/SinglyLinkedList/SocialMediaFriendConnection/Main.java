package SinglyLinkedList.SocialMediaFriendConnection;

public class Main {
    public static void main(String[] args) {
        SocialMedia s=new SocialMedia();
        UserNode user1=new UserNode("tarun",1,21);
        UserNode user2=new UserNode("tanuj",2,19);
        UserNode user3=new UserNode("prince",3,20);

        //add user to social media
        s.addUser(user1);
        s.addUser(user2);
        s.addUser(user3);

        //add friends
        s.addFriend(1,2);
        s.addFriend(2,3);
        s.addFriend(3,1);

        //display friend
        s.displayFriends(user1);
        s.displayFriends(user2);
        s.displayFriends(user3);

        //count firends
        s.countFriends(user1);

        //mutual friend
        s.mutualFriends(user1,user2);

       //search user
        s.searchUser(2);

        //remove friends
        s.removeFriend(1,2);
        s.displayFriends(user1);
       s.displayFriends(user2);



    }
}
