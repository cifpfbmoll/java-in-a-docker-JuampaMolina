package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.types.Bebida;

public class FleebJuice extends Bebida {

    private final String NOMBRE = "Fleeb Juice";
    private final Float PVP = 35f;

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
