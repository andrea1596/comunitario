package mx.edu.uacm.centrocomunitario.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.centrocomunitario.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
