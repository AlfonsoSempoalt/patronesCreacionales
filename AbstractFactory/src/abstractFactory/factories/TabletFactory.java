/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.factories;

import abstractFactory.computers.QX410;
import abstractFactory.interfaces.IComputer;
import abstractFactory.interfaces.ITablet;
import abstractFactory.tablets.Ipad;
import abstractFactory.tablets.S3;

/**
 *
 * @author Alfonso Sempoalt
 */
public class TabletFactory implements abstractFactory.interfaces.IAbstractFactory {

    @Override
    public ITablet create(String Type) {
        if ("Ipad".equalsIgnoreCase(Type)) {
            return new Ipad();
        } else if ("S3".equalsIgnoreCase(Type)) {
            return new S3();
        }
        return null;
    }

}
