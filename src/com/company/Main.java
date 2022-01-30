package com.company;

public class Main {

    public static void main(String[] args) {

        //  implement one of the GoF creational patterns by yourself.
        //  choose singleton
        UsersBaseList.getUsersBaseList().addUsersInfo("New User1: Adam, email: Adam@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User2: Mary, email: Mary@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User3: Alex, email: Alex@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User4: Bob, email: Bob@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User5: Jane, email: Jane@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User6: Santa Klaus, email: Santa_Klaus@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User7: Ded Moroz, email: Ded.Moroz@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User8: Kelvin Klein, email: Kelvin_Klein@gmail.com");
        UsersBaseList.getUsersBaseList().addUsersInfo("New User9: Supermen, email: Supermen@gmail.com");

        UsersBaseList.getUsersBaseList().showUsersList();
    }
}
