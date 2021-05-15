package edu.pingpong.fastBreakTruck;

import edu.pingpong.fastBreakTruck.domain.Desayuno;
import edu.pingpong.fastBreakTruck.domain.Eyeholes;
import edu.pingpong.fastBreakTruck.domain.Plumbus;
import edu.pingpong.fastBreakTruck.domain.TurbulentJuice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DesayunoTest {
    Desayuno desayuno;

    @Before
    public void setupDesayuno() {
        desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
    }

    @Test
    public void desayunoSinJuguete() {
        Assert.assertEquals(55f, desayuno.getCoste(), 0.00);
    }

    @Test
    public void desayunoConJuguete() {
        desayuno.addItem(new Plumbus());
        Assert.assertEquals(155f, desayuno.getCoste(), 0.00);
    }
}
