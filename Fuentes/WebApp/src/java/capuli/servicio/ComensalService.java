/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capuli.servicio;

import capuli.dominino.Comensal;
import capuli.dominino.Menu;
import capuli.dto.MenuDTO;
import java.util.List;

/**
 *
 * @author daisy
 */
public interface ComensalService {

    List<Menu> listMenu();

    List<Comensal> listComensal();

    MenuDTO getMenu(Integer id);

    boolean isMenuExist(Menu menu);

    void saveMenu(Menu menu);

    void updateMenu(Menu menu);

    void deleteMenu(Integer idMenu);

}
