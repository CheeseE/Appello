package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Option.
 */
public class Option extends MultiPartElement {
    public Option() {
        super("option");
    }

    public Option appendText(String text) {
        return appendChild(new Text(text));
    }

    public Option setValue(String value) {
        setAttribute("value", value);
        return this;
    }

    public String getValue() {
        return getAttribute("value");
    }

    public boolean removeValue() {
        return removeAttribute("value");
    }

    public Option setSelected(String value) {
        setAttribute("selected", value);
        return this;
    }

    public String getSelected() {
        return getAttribute("selected");
    }

    public boolean removeSelected() {
        return removeAttribute("selected");
    }
}
