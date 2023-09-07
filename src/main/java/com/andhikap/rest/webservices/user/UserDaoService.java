package com.andhikap.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int count = 1;

    static {
        users.add(new User(count++, "Andhika", LocalDate.now().minusYears(1)));
        users.add(new User(count++, "Firman", LocalDate.now().minusYears(2)));
        users.add(new User(count++, "Freya", LocalDate.now().minusYears(3)));
        users.add(new User(count++, "Zee", LocalDate.now().minusYears(4)));
    }

    // Reterieve all Users
    public List<User> findAll() {
        return users;
    }

    // Reterieve spesific User Detail
    public User findOne(Integer id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(count++);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }

}
