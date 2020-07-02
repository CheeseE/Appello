package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Select.
 */
public class Select extends MultiPartElement {
    public Select() {
        super("select");
    }

    public Select setName(String value) {
        setAttribute("name", value);
        return this;
    }

    public String getName() {
        return getAttribute("name");
    }

    public boolean removeName() {
        return removeAttribute("name");
    }

    public Select setSize(String value) {
        setAttribute("size", value);
        return this;
    }

    public String getSize() {
        return getAttribute("size");
    }

    public boolean removeSize() {
        return removeAttribute("size");
    }
}
