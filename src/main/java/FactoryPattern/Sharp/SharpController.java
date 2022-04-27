package FactoryPattern.Sharp;

import FactoryPattern.matcha.Controller;
import FactoryPattern.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createNewEngine() {
        return new SharpViewEngine();
    }
}
