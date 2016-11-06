package capuli.controller;

import java.util.List;

import capuli.dominino.Comensal;
import capuli.servicio.serviceImpl.ComensalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
//	
//	@Autowired
//	private ComensalService comensalServ;
////	
//	@RequestMapping(value="/prueba")
//	public void home() {
//		List<Comensal> listUsers = comensalServ.list();
////		ModelAndView model = new ModelAndView("home");
////		model.addObject("userList", listUsers);
////		return model;
//System.out.println("holaaaaaaaaa  "+listUsers.toString());
//	}
////        
//        @RequestMapping(value="/prueba/{mensaje}" )
//	public String
//         
//        prueba(@PathVariable String mensaje) {
//            
//            System.out.println("entroooooooooooooooooo al controlador");
//		
////		ModelAndView model = new ModelAndView("home");
////		model.addObject("userList", listUsers);
////		return model;
//            return  "hola mundo" +mensaje;
//	}
	
}
