/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.interfaces;

/**
 *
 * @author Alfonso Sempoalt
 * @param <T>
 */
public interface IAbstractFactory <T>{
    
    T create(String Type);
     
    
}
