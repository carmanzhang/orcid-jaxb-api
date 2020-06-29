package org.orcid.jaxb.model.utils;

/**
 * <p>Java class for citation-type.
 * 
 * This class comes from https://github.com/ORCID/ORCID-Source/blob/master/orcid-model/src/main/java/org/orcid/jaxb/model/common/CitationType.java
 */
public enum CitationType {

    FORMATTED_UNSPECIFIED("formatted-unspecified"), 
    BIBTEX("bibtex"), 
    FORMATTED_APA("formatted-apa"), 
    FORMATTED_HARVARD("formatted-harvard"), 
    FORMATTED_IEEE("formatted-ieee"), 
    FORMATTED_MLA("formatted-mla"), 
    FORMATTED_VANCOUVER("formatted-vancouver"), 
    FORMATTED_CHICAGO("formatted-chicago"),
    RIS("ris");
    
    private final String value;

    CitationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
    
    public static CitationType fromValue(String v) {
        for (CitationType c : CitationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}