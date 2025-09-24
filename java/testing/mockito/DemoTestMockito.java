package com.atlas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class DemoTestMockito {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void testRegisterUser() {
        User02 newUser = new User02();
        newUser.setName("Prasunamba Meher");

        when(userRepository.save(any(User02.class))).thenReturn(newUser);

        User02 registeredUser = userService.registerUser(newUser);

        assertNotNull(registeredUser);
        assertNotNull(registeredUser.getRegistrationDate());
    }
}










