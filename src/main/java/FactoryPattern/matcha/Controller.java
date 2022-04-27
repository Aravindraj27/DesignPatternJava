package FactoryPattern.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        ViewEngine engine = createNewEngine();
        String renderHTML = engine.render(viewName, context);
        System.out.println(renderHTML);
    }

    protected ViewEngine createNewEngine() {
        return new MatchaViewEngine();
    }
}
