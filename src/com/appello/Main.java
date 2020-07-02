package com.appello;

import com.appello.html.Position;
import com.appello.html.containers.Block;
import com.appello.html.elements.*;
import com.appello.render.ConsoleRenderer;
import com.appello.render.Renderer;

public class Main {

    public static void main(String[] args) {
        Renderer renderer = new ConsoleRenderer();
        renderer.display(
                new Block()
                        .setBorder("2px")
                        .addElement(new Input().setMaxlength("10").setType("date"), Position.RIGHT)
                        .addElement(new Button().appendText("Press me!"), Position.RIGHT)
                        .addElement(new Text("Press the button please!"), Position.BELOW));
        renderer.display(
                new Select()
                        .setName("Cars")
                        .setSize("5")
                        .appendChild(new Option().appendText("Volvo").setValue("Volvo"))
                        .appendChild(new Option().appendText("SEAT").setValue("SEAT")));

        renderer.display(new Button().appendText("I'm a button").setDisabled("true").setType("submit"));
    }
}
