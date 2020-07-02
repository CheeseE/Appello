package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Table Cell.
 */
public class Td extends MultiPartElement {

    public Td() {
        super("td");
    }

    public Td setAbbr(String value) {
        setAttribute("abbr", value);
        return this;
    }

    public String getAbbr() {
        return getAttribute("abbr");
    }

    public boolean removeAbbr() {
        return removeAttribute("abbr");
    }

    public Td setAlign(String value) {
        setAttribute("align", value);
        return this;
    }

    public String getAlign() {
        return getAttribute("align");
    }

    public boolean removeAlign() {
        return removeAttribute("align");
    }
}
