package com.company;

public class UsersBaseList {
    private static UsersBaseList usersBaseList;
    private static String usersList = "This is the list of users of our site:  \n\n";

    public static UsersBaseList getUsersBaseList() {
        if (usersBaseList == null) {
            usersBaseList = new UsersBaseList();
        }
        return usersBaseList;
    }

    private UsersBaseList() {
    }

    public void addUsersInfo(String usersInfo) {
        usersList += usersInfo + "\n";
    }

    public void showUsersList() {
        System.out.println(usersList);
    }
}
