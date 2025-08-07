package com.builder;

class User {
    // required
    private String name;
    private String email;

    // optional
    private int age;
    private String phone;

    // Private constructor — only Builder can access
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    // Static nested Builder class
    public static class UserBuilder {
        // required
        private String name;
        private String email;

        // optional
        private int age;
        private String phone;

        // Constructor with required fields
        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Optional setters
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        // Final step - build the actual object
        public User build() {
            return new User(this);
        }
    }

    // For displaying the object
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}
