package org.launchcode;

public class FortyTwo {
    public int intValue = 42;

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        FortyTwo fortyTwo = (FortyTwo) object;
        return intValue == fortyTwo.intValue;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), intValue);
    }
}
