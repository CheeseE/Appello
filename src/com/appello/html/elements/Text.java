package com.appello.html.elements;

import com.appello.html.GenericElement;

/**
 * Class that represents a html Text field.
 */
public class Text extends GenericElement {
    public Text(String elementType) {
        super(elementType);
    }

    @Override
    public String toHtml(){
        return getElementType();
    }

    @Override
    public String toString(){
        return this.toHtml();
    }
}
