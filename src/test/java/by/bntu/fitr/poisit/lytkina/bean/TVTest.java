package by.bntu.fitr.poisit.lytkina.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    @Test
    public void getName() {
        TV tv = new TV();

        tv.setName("LG");
        tv.setOn(true);

        String expected = "LG";
        String actual = tv.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void isOn() {
        TV tv = new TV();

        tv.setName("LG");
        tv.setOn(true);

        boolean expected = true;
        boolean actual = tv.isOn();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        TV tvLeft = new TV();
        TV tvRight = new TV();

        tvLeft.setName("LG");
        tvLeft.setOn(true);

        tvRight.setName("LG");
        tvRight.setOn(true);

        boolean expected = true;
        boolean actual = tvLeft.equals(tvRight);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        TV tv = new TV();

        tv.setName("LG");
        tv.setOn(true);

        int expected = 77429;
        int actual = tv.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        TV tv = new TV();

        tv.setName("LG");
        tv.setOn(true);

        String expected = "TV{name='LG', isOn=true}";
        String actual = tv.toString();
        assertEquals(expected, actual);
    }
}