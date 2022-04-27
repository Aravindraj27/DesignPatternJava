package FactoryPattern.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by matcha";
    }

}
