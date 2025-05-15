package MVC;

import MVC.controller.IMCControllerMVC;
import MVC.model.IMCMVC;
import MVC.view.IMCViewMVC;

public class MainMVC {
    public static void main(String[] args) {
        IMCMVC imcModel = new IMCMVC();
        IMCViewMVC imcView = new IMCViewMVC();
        IMCControllerMVC imcController = new IMCControllerMVC(imcModel, imcView);

        imcController.iniciar();
    }
}
