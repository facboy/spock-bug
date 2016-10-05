package org.facboy;

import java.util.Objects;

import com.google.common.base.MoreObjects;

public class MyBean2 implements Bean {
    private long long1;
    private String string;

    public long getLong() {
        return long1;
    }

    public void setLong(long long1) {
        this.long1 = long1;
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
        MyBean2 myBean = (MyBean2) o;
        return long1 == myBean.long1 &&
                Objects.equals(string, myBean.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(long1, string);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("long", long1)
                .add("string", string)
                .toString();
    }
}
