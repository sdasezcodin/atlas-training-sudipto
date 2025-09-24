package com.atlas;

public interface UserRepository {
    User02 findById(Long id);
    User02 save(User02 user);
}
