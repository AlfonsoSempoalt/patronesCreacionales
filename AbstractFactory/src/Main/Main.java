/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import abstractFactory.computers.MacBookPro;
import abstractFactory.interfaces.*;
import abstractFactory.tablets.Ipad;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Main {

    public static void main(String[] args) {
        IAbstractFactory tablet = FactoryProvider.getFactory("tablet");
        IAbstractFactory computadora = FactoryProvider.getFactory("computer");

        MacBookPro macBookPro = (MacBookPro) computadora.create("MacBookPro");
        Ipad ipad = (Ipad) tablet.create("ipad");
    }
}
