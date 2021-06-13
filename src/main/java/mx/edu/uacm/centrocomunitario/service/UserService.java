package mx.edu.uacm.centrocomunitario.service;

import java.util.ArrayList;

import mx.edu.uacm.centrocomunitario.entity.User;

public interface UserService {
	User guardarUsuario(User u);
	ArrayList<User> obtenerUsuarios();
}

