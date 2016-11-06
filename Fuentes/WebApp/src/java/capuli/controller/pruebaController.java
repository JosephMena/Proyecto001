/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.controller;

/**
 *
 * @author daisy
 */
import capuli.dominino.Menu;
import capuli.servicio.ComensalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class pruebaController {

    @Autowired
    private ComensalService comensalService;

    @RequestMapping(value = "/prueba")
    public ModelAndView home() {

        List<Menu> listUsers = comensalService.listMenu();

//		List<Comensal> lista = ComensalService.listComensal();
        ModelAndView model = new ModelAndView("prueba");
//		model.addObject("userList", listUsers);
        System.out.println("entro en el controladore prueba");
        System.out.println(listUsers.get(0).toString());

        System.out.println(listUsers.get(3).toString());
//        System.out.println(listUsers.get(3).getApellidos());
//        System.out.println(listUsers.get(0).getNombres());
//        System.out.println(listUsers.get(0).getApellidos());
//        System.out.println(listUsers.get(0).getListNocturnos());
//        System.out.println("dni:"+listUsers.get(3).getEmpresa());
//        System.out.println(listUsers.get(0).enCadena());
//        System.out.println("");
//        System.out.println(ComensalService.listMenu());
        return model;
    }

    @RequestMapping(value = "/prueba/{mensaje}")
    public void prueba(@PathVariable String mensaje) {

        System.out.println("entroooooooooooooooooo al controlador");

//		ModelAndView model = new ModelAndView("home");
//		model.addObject("userList", listUsers);
//		return model;
//            return  "hola mundo" +mensaje;
    }
//
//    public ComensalService getComensalService() {
//        return ComensalService;
//    }
//
//    public void setComensalService(ComensalService ComensalService) {
//        this.ComensalService = ComensalService;
//    }
//    
//    
}
