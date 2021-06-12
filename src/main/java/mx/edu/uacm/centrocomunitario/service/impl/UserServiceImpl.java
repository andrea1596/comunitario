package mx.edu.uacm.centrocomunitario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.centrocomunitario.entity.User;
import mx.edu.uacm.centrocomunitario.repository.UserRepository;
import mx.edu.uacm.centrocomunitario.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository ;
	
	public User guardarUsuario(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

}
