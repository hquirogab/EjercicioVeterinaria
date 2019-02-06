/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomascotas;

import java.util.ArrayList;

/**
 *
 * @author hquiroga
 */
public class VetClinic {
    private ArrayList<Speaking> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }
    
    public boolean addAnimals(Pet pet) {
        return animals.add(pet);
    }

    public ArrayList<Animals> getAnimals() {
        return animals;
    }
}
