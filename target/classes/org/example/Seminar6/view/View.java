package Seminar6.view;

import Seminar6.service.PresrnterService;

public interface View {
    void setPresenter(PresrnterService presenter);
    void start();
    void print(String text);
}
