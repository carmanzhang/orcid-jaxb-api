package org.orcid.jaxb.model.utils;

import java.io.Serializable;

/**
 * This class comes from https://github.com/ORCID/ORCID-Source/blob/master/orcid-model/src/main/java/org/orcid/jaxb/model/common/Relationship.java
 */
public enum Relationship implements Serializable {
    PART_OF("part-of"), 
    SELF("self"), 
    VERSION_OF("version-of");
    private final String value;

    Relationship(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Relationship fromValue(String v) {
        for (Relationship c : Relationship.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}