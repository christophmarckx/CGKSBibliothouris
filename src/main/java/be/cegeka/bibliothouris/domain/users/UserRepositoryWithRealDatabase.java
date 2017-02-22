package be.cegeka.bibliothouris.domain.users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryWithRealDatabase extends CrudRepository<User, Long>{
}
