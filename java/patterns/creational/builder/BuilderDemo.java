package com.builder;


public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder("eZcoDiN", "ez@mail.com")
                .setAge(21)
                .setPhone("9876543210")
                .build();

        user.display();
    }
}
