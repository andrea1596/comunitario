package mx.edu.uacm.centrocomunitario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.centrocomunitario.entity.Permiso;
import mx.edu.uacm.centrocomunitario.entity.Rol;
import mx.edu.uacm.centrocomunitario.repository.PermisoRepository;

public interface PermisoService {
	Permiso guardarPermiso(Permiso p);
	boolean existePermiso(Long id);
}
