package Seminar6.service;

import Seminar6.model.Service;
import Seminar6.view.View;

public class PresrnterService {
    private View view;
    private Service service;

    public PresrnterService(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void onClick(String city){
        String answer = service.get(city);
        view.print(answer);
    }
}
