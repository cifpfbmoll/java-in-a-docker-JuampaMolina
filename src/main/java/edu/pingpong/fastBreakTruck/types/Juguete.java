package edu.pingpong.fastBreakTruck.types;

import edu.pingpong.fastBreakTruck.behaviour.Item;
import edu.pingpong.fastBreakTruck.behaviour.Packing;
import edu.pingpong.fastBreakTruck.domain.Caja;

public abstract class Juguete implements Item {

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return "Item: " + this.nombre() + ", Empaquetado: " + this.empaquetado().envoltorio() + ", Precio: " + this.pvp();
    }
}
