package com.appello.render;

import com.appello.html.Element;

public class ConsoleRenderer implements Renderer{

    @Override
    public void display(Element element) {
        System.out.println(element);
    }
}
