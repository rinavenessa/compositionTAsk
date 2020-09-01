package com.rinavenessa.pcComposition;

import com.rinavenessa.pcComposition.*;

public class Main {

    public static void main(String[] args) {

	//composition is a has a relationship methodology and inheritance is a is a relation methodology

    Case theCase = new Case("563k","hp","240",
                   new Dimensions(20,25,5));
    Monitor theMonitor = new Monitor("347gd","hp",23,
                         new Resolution(2540,1440));
    Motherboard theMotherboard = new Motherboard("452OPL","Intel",4,4,"v2.44");

    Pc thePc = new Pc(theCase,theMonitor,theMotherboard);
        thePc.getTheCase().powerON();
    thePc.getMonitor().drawPixel(1500,1200,"pink");
    thePc.getMotherboard().loadProgram("window 95");

    }
}
