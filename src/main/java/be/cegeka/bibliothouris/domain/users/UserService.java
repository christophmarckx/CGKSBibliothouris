package be.cegeka.bibliothouris.domain.users;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

@Named
public class UserService {

//    @Inject
//    private UserRepository userRepository;

    @Inject
    private UserRepositoryWithRealDatabase userRepositoryWithRealDatabase;

    private final AtomicLong counter = new AtomicLong();

    public void addUser(String name){
        User user = new User(counter.incrementAndGet(), name);
        userRepositoryWithRealDatabase.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepositoryWithRealDatabase.findAll();
    }
}
