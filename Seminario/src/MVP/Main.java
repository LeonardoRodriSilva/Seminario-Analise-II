package MVP;

import MVP.view.ConsoleIMCViewMVP;

public class Main {
    public static void main(String[] args) {
        MVP.view.ConsoleIMCViewMVP imcView = new ConsoleIMCViewMVP();
        MVP.Presenter.IMCPresenterMVP imcPresenter = new MVP.Presenter.IMCPresenterMVP(imcView);
        imcPresenter.iniciar();
    }
}
