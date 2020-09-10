/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.interfaces;

import abstractFactory.factories.ComputerFactory;
import abstractFactory.factories.TabletFactory;

/**
 *
 * @author Alfonso Sempoalt
 */
public class FactoryProvider {

    public static IAbstractFactory getFactory(String choice) {

        if ("computer".equalsIgnoreCase(choice)) {
            return new ComputerFactory();
        } else if ("tablet".equalsIgnoreCase(choice)) {
            return new TabletFactory();
        }
        return null;
    }
}
