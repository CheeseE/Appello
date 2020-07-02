package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Table.
 */
public class Table extends MultiPartElement {
    public Table() {
        super("table");
    }

    public Table setAlign(String value) {
        setAttribute("align", value);
        return this;
    }

    public String getAlign() {
        return getAttribute("align");
    }

    public boolean removeAlign() {
        return removeAttribute("align");
    }

    public Table setBorder(String value) {
        setAttribute("border", value);
        return this;
    }

    public String getBorder() {
        return getAttribute("border");
    }

    public boolean removeBorder() {
        return removeAttribute("border");
    }

    public Table setWidth(String value) {
        setAttribute("width", value);
        return this;
    }

    public String getWidth() {
        return getAttribute("width");
    }

    public boolean removeWidth() {
        return removeAttribute("width");
    }
}
