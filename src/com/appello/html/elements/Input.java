package com.appello.html.elements;

import com.appello.html.GenericElement;

/**
 * Class that represents a html Input.
 */
public class Input extends GenericElement {
    public Input() {
        super("input");
    }

    @Override
    public String toHtml() {
        return writeOpenTag();
    }

    @Override
    public String toString() {
        return this.toHtml();
    }

    public Input setAccept(String value) {
        setAttribute("accept", value);
        return this;
    }

    public String getAccept() {
        return getAttribute("accept");
    }

    public boolean removeAccept() {
        return removeAttribute("accept");
    }

    public Input setType(String value) {
        setAttribute("type", value);
        return this;
    }

    public String getType() {
        return getAttribute("type");
    }

    public boolean removeType() {
        return removeAttribute("type");
    }

    public Input setTitle(String value) {
        setAttribute("title", value);
        return this;
    }

    public String getTitle() {
        return getAttribute("title");
    }

    public boolean removeTitle() {
        return removeAttribute("title");
    }

    public Input setMaxlength(String value) {
        setAttribute("maxlength", value);
        return this;
    }

    public String getMaxlength() {
        return getAttribute("maxlength");
    }

    public boolean removeMaxlength() {
        return removeAttribute("maxlength");
    }


}
