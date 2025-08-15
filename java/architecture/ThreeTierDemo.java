package com;

// ===== Data Layer (DAL) =====
class UserRepository {
    public String findById(int id) {
        // Simulate DB fetch
        return "User{id=%d, name='Alice'}".formatted(id);
    }
}

// ===== Business Layer (BLL) =====
class UserService {
    private final UserRepository repo = new UserRepository();

    public String getUserProfile(int id) {
        String raw = repo.findById(id);
        // Business logic: enrich/validate/transform
        return "Profile{%s, status='ACTIVE'}".formatted(raw);
    }
}

// ===== Presentation Layer (PL) =====
class UserController {
    private final UserService service = new UserService();

    // Simulates an HTTP endpoint like GET /users/{id}
    public String getUser(int id) {
        return service.getUserProfile(id);
    }
}


public class ThreeTierDemo {
    public static void main(String[] args) {
        UserController controller = new UserController();
        System.out.println(controller.getUser(42));
    }
}
