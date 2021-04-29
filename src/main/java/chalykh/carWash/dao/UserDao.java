package chalykh.carWash.dao;

import chalykh.carWash.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDao extends CrudRepository<User, Integer> {

    User findById(int id);

}
