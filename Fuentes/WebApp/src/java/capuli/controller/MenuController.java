/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.controller;

import capuli.dominino.Menu;
import capuli.dto.MenuDTO;
import capuli.servicio.ComensalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author daisy
 */
@RestController
public class MenuController {

    @Autowired
    private ComensalService service;

    @RequestMapping(value = "/menu/", method = RequestMethod.GET)
    public ResponseEntity<List<Menu>> listMenus() {
        List<Menu> menus = service.listMenu();
        if (menus.isEmpty()) {
            return new ResponseEntity<List<Menu>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Menu>>(menus, HttpStatus.OK);
    }

    //retrive a single menu
    @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MenuDTO> getMenu(@PathVariable("id") Integer id) {

        System.out.println("buscnado meni con id " + id);

        Menu menu = service.getMenu(id);
        MenuDTO aux=new MenuDTO(id, "bebida", "sopa", "mazamorra", "lomito", "almuerzo");

        if (menu == null) {
            System.out.println(" no hay menyni con id " + id);

            return new ResponseEntity<MenuDTO>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<MenuDTO>(aux, HttpStatus.OK);
    }
    
    
    
//     @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<MenuDTO> getMenu(@PathVariable("id") Integer id) {
//
//        System.out.println("buscnado meni con id " + id);
//
//        MenuDTO menu = service.getMenu(id);
//
//        if (menu == null) {
//            System.out.println(" no hay menyni con id " + id);
//
//            return new ResponseEntity<MenuDTO>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<MenuDTO>(menu, HttpStatus.OK);
//    }
    

    //crear un nuevo menu
    @RequestMapping(value = "/menu/", method = RequestMethod.POST)
    public ResponseEntity<Void> createMenu(@RequestBody Menu menu, UriComponentsBuilder ucBuilder) {
        System.out.println("creando menu" + menu.getSegundo());

        if (service.isMenuExist(menu)) {

            System.out.println("ya existe menu");

            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        service.saveMenu(menu);

        HttpHeaders headers = new HttpHeaders();

        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(menu.getIdMenu()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //update a user
    @RequestMapping(value = "/menu/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Menu> updateUser(@PathVariable("id") Integer id, @RequestBody Menu menu) {
        System.out.println("Updating User " + id);
        service.updateMenu(menu);
        return new ResponseEntity<Menu>(menu, HttpStatus.OK);
    }

    // Delete a User
    @RequestMapping(value = "/menu/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Menu> deleteMenu(@PathVariable("id") Integer id) {
        service.deleteMenu(id);
        return new ResponseEntity<Menu>(HttpStatus.NO_CONTENT);
    }

}
