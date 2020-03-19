package com.back.example.springboot.jpa.dongexample.Inheritance;

import java.io.Serializable;
import java.util.Objects;

public class GrandChildId implements Serializable {

    private String grandId;
    private ChildId child;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrandChildId that = (GrandChildId) o;
        return grandId.equals(that.grandId) &&
                child.equals(that.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grandId, child);
    }
}
