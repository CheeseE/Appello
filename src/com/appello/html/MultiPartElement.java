package com.appello.html;

import java.util.ArrayList;

/**
 * Element that can hold child elements.
 */
public class MultiPartElement extends GenericElement {

    private ArrayList<Element> children;

    protected MultiPartElement(String elementType) {
        super(elementType);
        this.children = new ArrayList<>();
    }

    /**
     * Appends a child node to the end of this element's DOM tree
     *
     * @param child node to be appended
     * @return the node
     */
    public <T extends MultiPartElement> T appendChild(Element child) {
        if (this == child) {
            throw new Error("Cannot append a node to itself.");
        }
        children.add(child);
        return (T) this;
    }

    /**
     * Gets the list of child nodes
     *
     * @return a list of children
     */
    public ArrayList<Element> getChildren() {
        return children;
    }

    /**
     * Writes the node's tag and all of its children's tags
     *
     * @return HTML tags as String
     */
    @Override
    public String toHtml() {
        StringBuilder b = new StringBuilder(writeOpenTag());

        if (children != null && children.size() > 0) {
            for (Element child : children) {
                b.append(child.toHtml());
            }
        }
        b.append(writeCloseTag());
        return b.toString();
    }

    /**
     * A convenient way of calling toHtml().
     */
    @Override
    public String toString() {
        return this.toHtml();
    }
}
