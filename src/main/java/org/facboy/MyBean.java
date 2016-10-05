package org.facboy;

import java.util.Objects;

import com.google.common.base.MoreObjects;

public class MyBean {
    private int integer;
    private String string;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyBean myBean = (MyBean) o;
        return integer == myBean.integer &&
                Objects.equals(string, myBean.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, string);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("integer", integer)
                .add("string", string)
                .toString();
    }
}
