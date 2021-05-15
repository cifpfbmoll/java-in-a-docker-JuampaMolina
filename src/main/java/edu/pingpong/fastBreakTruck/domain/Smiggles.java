package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.types.Cereales;

public class Smiggles extends Cereales {
    private final String NOMBRE = "Smiggles";
    private final Float PVP = 50f;

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
