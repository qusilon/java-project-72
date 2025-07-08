package hexlet.code;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }

    public static Javalin getApp() {
        Logger logger = LoggerFactory.getLogger(App.class);

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        logger.info("Hello World");
        app.get("/", ctx -> {
            ctx.result("Hello World");
        });
        return app;
    }
}
