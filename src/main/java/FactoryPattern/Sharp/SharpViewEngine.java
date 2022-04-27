package FactoryPattern.Sharp;

import FactoryPattern.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Using Sharp View Engine";
    }
}
