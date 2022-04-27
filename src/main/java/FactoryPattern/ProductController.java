package FactoryPattern;

import FactoryPattern.Sharp.SharpController;
import FactoryPattern.matcha.Controller;
import FactoryPattern.matcha.ViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProduct() {
        Map<String, Object> context = new HashMap<>();
        render("product HTML", context);

    }
}
