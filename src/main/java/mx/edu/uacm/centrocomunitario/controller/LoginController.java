package mx.edu.uacm.centrocomunitario.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
import mx.edu.uacm.centrocomunitario.entity.User;
import mx.edu.uacm.centrocomunitario.service.UserService;


@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession httpSession;

	@RequestMapping(value = "/acceder", method = {RequestMethod.POST,RequestMethod.GET})
    public String basicForm(String correo, String password, Model model) {
		ArrayList<User> usuarios= new ArrayList<User>();
		String salida="redirect:/login";
		usuarios=userService.obtenerUsuarios();
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).getCorreo().equals(correo) && usuarios.get(i).getPassword().equals(password)) {
				log.debug("entre a login");
				httpSession.setAttribute("usuario", salida);
				httpSession.removeAttribute("error");
				salida="redirect:/reportes";
				break;
			}
			else {
				httpSession.setAttribute("error", "error");
			}
		}
		
		log.debug(salida);
		return salida; 
}
}