package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.behaviour.Packing;

public class Tubo implements Packing {

    @Override
    public String envoltorio() {
        return "Tubo";
    }
}
