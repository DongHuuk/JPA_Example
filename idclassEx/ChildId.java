package com.back.example.springboot.jpa.dongexample.Inheritance;

import java.io.Serializable;
import java.util.Objects;

public class ChildId implements Serializable {

    private String chileId;
    private String parent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildId childId = (ChildId) o;
        return Objects.equals(chileId, childId.chileId) &&
                Objects.equals(parent, childId.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chileId, parent);
    }
}
