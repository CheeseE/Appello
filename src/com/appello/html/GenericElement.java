package com.appello.html;

import com.appello.html.attributes.Attribute;

import java.util.ArrayList;

/**
 * Generic html element with attributes.
 */
public abstract class GenericElement implements Element {

    private final String elementType;
    private final ArrayList<Attribute> attributes;

    public GenericElement(String elementType) {
        this.elementType = elementType;
        this.attributes = new ArrayList<>();
    }

    /**
     * Gets the html element type.
     * @return the value.
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets an element attribute
     *
     * @param name  the attribute
     * @param value the attribute value
     */
    public void setAttribute(String name, String value) {
        if (value != null) {
            for (Attribute attribute : attributes) {
                if (attribute.getName().equals(name)) {
                    attribute.setValue(value);
                    return;
                }
            }
            attributes.add(new Attribute(name, value));
        }
    }

    /**
     * Gets the value of the given attribute
     *
     * @param name the requested attribute name
     * @return the value
     */
    public String getAttribute(String name) {
        for (Attribute attribute : attributes) {
            if (attribute.getName().equals(name)) {
                return attribute.getValue();
            }
        }
        return null;
    }

    /**
     * Removes the given attribute
     *
     * @param name the attribute name
     * @return whether the attribute was successfully removed
     */
    public boolean removeAttribute(String name) {
        for (Attribute attribute : attributes) {
            if (attribute.getName().equals(name)) {
                return attributes.remove(attribute);
            }
        }
        return false;
    }

    /**
     * Write the HTML tag as a String
     *
     * @return HTML tag as String
     */
    public String toHtml() {
        return writeOpenTag() + writeCloseTag();
    }

    /**
     * A convenient way of calling toHtml().
     * This method calls this.toHtml().
     */
    @Override
    public String toString() {
        return this.toHtml();
    }

    protected String writeOpenTag() {
        StringBuilder b = new StringBuilder("<");
        b.append(elementType);
        for (Attribute attr : attributes) {
            b.append(attr.toHtml());
        }
        b.append(">");
        return b.toString();
    }

    protected String writeCloseTag() {
        StringBuilder b = new StringBuilder("</");
        b.append(elementType);
        b.append(">");
        return b.toString();
    }

}
