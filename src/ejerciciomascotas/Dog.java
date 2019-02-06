/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomascotas;

/**
 *
 * @author hquiroga
 */
public class Dog extends Pet implements Licensable{
    
    protected License license;

    public Dog(String name, License license) {
        super(name);
        this.license = license;
    }

    @Override
    public void speak() {
        
    }

    @Override
    public License getLicence() {
       return license;
    }
    
}
