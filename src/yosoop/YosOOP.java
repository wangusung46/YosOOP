package yosoop;

import yosoop.controller.ControllerLogin;
import yosoop.view.menu.FormLogin;

public class YosOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormLogin formLogin = new FormLogin();
        formLogin.setVisible(true);
        ControllerLogin controllerLogin = new ControllerLogin();
        controllerLogin.initController(formLogin);
    }
    
}
