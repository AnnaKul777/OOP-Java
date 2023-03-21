package Seminar5.hw5.view;

import Seminar5.hw5.model.Animals;
import Seminar5.hw5.service.AnimalServiceImpl;
import Seminar5.hw5.service.AnimalsService;

public class AnimalView {

    private final AnimalsService animalsService = new AnimalServiceImpl();

    public void saveAnimal (Animals animal){
        animalsService.save(animal);
    }
}
