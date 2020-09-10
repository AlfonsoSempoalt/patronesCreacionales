/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.factories;

import abstractFactory.computers.MacBookPro;
import abstractFactory.computers.QX410;
import abstractFactory.interfaces.IComputer;
/**
 *
 * @author Alfonso Sempoalt
 */
public class ComputerFactory implements abstractFactory.interfaces.IAbstractFactory {

    @Override
    public IComputer create(String Type) {
        if ("MacBookPro".equalsIgnoreCase(Type)) {
            return new MacBookPro();
        } else if ("qx410".equalsIgnoreCase(Type)) {
            return new QX410();
        }
        return null;
    }

}
