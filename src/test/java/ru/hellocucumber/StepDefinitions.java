package ru.hellocucumber;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color){  // type, name (from method)
        return new Color(color);       // transformer function
    }

    @When("I have a {color} ball")
    public void checkEmail(Color color) {
        System.out.println(color.text);
    }

}
