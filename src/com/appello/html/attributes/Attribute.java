package com.appello.html.attributes;

/**
 * Represents html element attributes as key-value pairs.
 */
public class Attribute {
    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Attribute(String name) {
        this.name = name;
        this.value = null;
    }

    public String toHtml() {
        StringBuilder b = new StringBuilder(" ");
        b.append(name);
        if (value != null) {
            b.append("=\"");
            b.append(value);
            b.append("\"");
        }
        return b.toString();
    }

    @Override
    public String toString() {
        return this.toHtml();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
