package MVVM;

import MVVM.view.ConsoleIMCView;
import MVVM.viewModel.IMCModelViewMVVM;

public class MainMVVM {
    public static void main(String[] args) {
        IMCModelViewMVVM modelView = new IMCModelViewMVVM();
        ConsoleIMCView view = new ConsoleIMCView(modelView);
        view.iniciar();
    }
}
