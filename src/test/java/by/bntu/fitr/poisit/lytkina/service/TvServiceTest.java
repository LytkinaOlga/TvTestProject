package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.TV;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvServiceTest {

    @Test
    public void ifOneReturnTrue() {
        TV tv = new TV();
        tv.setOn(true);
        TvService tvService = new TvService(tv);
        boolean expected = true;
        boolean actual = tvService.ifOne();
        assertEquals(expected, actual);
    }
    @Test
    public void ifOneReturnFalse() {
        TV tv = new TV();
        tv.setOn(false);
        TvService tvService = new TvService(tv);
        boolean expected = false;
        boolean actual = tvService.ifOne();
        assertEquals(expected, actual);
    }
}