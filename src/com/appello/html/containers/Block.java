package com.appello.html.containers;

import com.appello.html.Element;
import com.appello.html.MultiPartElement;
import com.appello.html.Position;
import com.appello.html.elements.Td;
import com.appello.html.elements.Tr;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Container element that can hold child elements and position them.
 */
public class Block extends MultiPartElement {

    private final Map<Element, Position> elements;

    public Block() {
        super("table");
        this.elements = new LinkedHashMap<>();
    }

    public Block setBorder(String value) {
        setAttribute("border", value);
        return this;
    }

    public String getBorder() {
        return getAttribute("border");
    }

    public boolean removeBorder() {
        return removeAttribute("border");
    }

    /**
     * Add a child element to the container.
     *
     * @param element  the element to add
     * @param position the position of the element
     * @return the container
     */
    public Block addElement(Element element, Position position) {
        elements.put(element, position);
        return this;
    }

    @Override
    public String toHtml() {
        Tr row = new Tr();
        for (Map.Entry<Element, Position> entry : elements.entrySet()) {
            switch (entry.getValue()) {
                case RIGHT:
                    row.appendChild(new Td().appendChild(entry.getKey()));
                    break;
                case BELOW:
                    this.appendChild(row);
                    row = new Tr().appendChild(new Td().appendChild(entry.getKey()));
                    break;
            }
        }
        this.appendChild(row);
        return super.toHtml();
    }
}
