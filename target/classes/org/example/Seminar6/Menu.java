package Seminar6;

import Seminar6.model.Service;
import Seminar6.model.WeatherService;
import Seminar6.service.PresrnterService;
import Seminar6.view.DesktopUI;
import Seminar6.view.View;

public class Menu {
    public static void startApp() {
        View view = new DesktopUI();
        Service service = new WeatherService();
        PresrnterService presenter = new PresrnterService(view, service);

        view.start();
    }
}


