package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.behaviour.Packing;

public class Caja implements Packing {

    @Override
    public String envoltorio() {
        return "Caja";
    }
}
