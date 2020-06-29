package org.orcid.jaxb.model.utils;

import java.io.Serializable;

/**
 * <p>
 * Java class for orcid-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * This class comes from https://github.com/ORCID/ORCID-Source/blob/master/orcid-model/src/main/java/org/orcid/jaxb/model/common/FundingType.java
 */
public enum FundingType implements Serializable {
    GRANT("grant"), 
    CONTRACT("contract"), 
    AWARD("award"),
    SALARY_AWARD("salary-award");
    private final String value;

    FundingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
    
    public static FundingType fromValue(String v) {
        for (FundingType c : FundingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}