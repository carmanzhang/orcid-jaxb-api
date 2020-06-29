package org.orcid.jaxb.model.utils;

import java.io.Serializable;

/**
 * @author Angel Montenegro 
 *         Date: 20/02/2014
 * 
 * This class comes from https://github.com/ORCID/ORCID-Source/blob/master/orcid-model/src/main/java/org/orcid/jaxb/model/common/FundingContributorRole.java
 */
public enum FundingContributorRole implements Serializable {

    LEAD("lead"), 
    CO_LEAD("co-lead"), 
    SUPPORTED_BY("supported-by"), 
    OTHER_CONTRIBUTION("other-contribution");

    private final String value;

    FundingContributorRole(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static FundingContributorRole fromValue(String v) {
        for (FundingContributorRole c : FundingContributorRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}