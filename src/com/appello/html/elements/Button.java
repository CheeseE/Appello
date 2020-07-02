package com.appello.html.elements;

import com.appello.html.MultiPartElement;

/**
 * Class that represents a html Button.
 */
public class Button extends MultiPartElement {
    public Button() {
        super("button");
    }

    public Button appendText(String text) {
        return appendChild(new Text(text));
    }

    public Button setDisabled(String value) {
        setAttribute("disabled", value);
        return this;
    }

    public String getDisabled() {
        return getAttribute("disabled");
    }

    public boolean removeDisabled() {
        return removeAttribute("disabled");
    }

    public Button setName(String value) {
        setAttribute("name", value);
        return this;
    }

    public String getName() {
        return getAttribute("name");
    }

    public boolean removeName() {
        return removeAttribute("name");
    }

    public Button setType(String value) {
        setAttribute("type", value);
        return this;
    }

    public String getType() {
        return getAttribute("type");
    }

    public boolean removeType() {
        return removeAttribute("type");
    }
}
