package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.types.Bebida;

public class TurbulentJuice extends Bebida {
    private final String NOMBRE = "Turbulent Juice";
    private final Float PVP = 30f;

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
