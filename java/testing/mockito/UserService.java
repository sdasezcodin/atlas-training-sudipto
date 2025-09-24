package com.atlas;

import java.util.Date;

public class UserService {

    private final UserRepository userRepository;

    // Constructor injection (preferred for @InjectMocks)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User02 registerUser(User02 user) {
        user.setRegistrationDate(new Date());  // <-- set registration date
        return userRepository.save(user);
    }
}
