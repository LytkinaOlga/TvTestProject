package by.bntu.fitr.poisit.lytkina.bean;

import java.io.Serializable;
import java.util.Objects;

public class TV implements Serializable {
    private String name;
    private boolean isOn;

    public TV() {
        //default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return isOn == tv.isOn &&
                Objects.equals(name, tv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isOn);
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
