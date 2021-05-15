package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.types.Cereales;

public class Eyeholes extends Cereales {

    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 25f;

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
