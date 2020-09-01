package com.rinavenessa.pcComposition;

public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public  Pc(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        theCase.powerON();
       drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixel(1290,50, "violet");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
