package edu.pingpong.fastBreakTruck.behaviour;

import edu.pingpong.fastBreakTruck.domain.*;

public class FastBreakTruck {

    public static Desayuno prepararEyeHoles() {
        Desayuno eyeHoles = new Desayuno();
        eyeHoles.addItem(new Eyeholes());
        eyeHoles.addItem(new TurbulentJuice());
        return eyeHoles;
    }

    public static Desayuno prepararSmiggles() {
        Desayuno smiggles = new Desayuno();
        smiggles.addItem(new Smiggles());
        smiggles.addItem(new FleebJuice());
        return smiggles;
    }

    public static Desayuno incluirJuguete(Desayuno desayuno) {
        desayuno.addItem(new Plumbus());
        return desayuno;
    }
}
