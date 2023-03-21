package Seminar5.hw5.service;

import Seminar5.hw5.model.Animals;

import java.io.FileWriter;

public class AnimalServiceImpl implements AnimalsService {
    @Override
    public void save(Animals animal) {

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\QueenAnna\\Desktop\\Java\\OOPJava\\target\\classes\\org\\example\\Seminar5\\Shelter.txt", true)) {
            fileWriter.write(animal.toString() + "\n");
        } catch (Exception e) {
            System.out.println("Невозможно сохранить");
            e.printStackTrace();
        }
    }
}