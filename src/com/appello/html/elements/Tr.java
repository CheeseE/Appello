package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Table Row.
 */
public class Tr extends MultiPartElement {
    public Tr() {
        super("tr");
    }

    public Tr setAlign(String value) {
        setAttribute("align", value);
        return this;
    }

    public String getAlign() {
        return getAttribute("align");
    }

    public boolean removeAlign() {
        return removeAttribute("align");
    }

    public Tr setBgColor(String value) {
        setAttribute("bgcolor", value);
        return this;
    }

    public String getBgColor() {
        return getAttribute("bgcolor");
    }

    public boolean removeBgColor() {
        return removeAttribute("bgcolor");
    }
}
