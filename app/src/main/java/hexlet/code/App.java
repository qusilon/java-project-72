package hexlet.code;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(getPort());
    }

    private static int getPort() {
        String port = System.getenv().getOrDefault("PORT", "7070");
        return Integer.parseInt(port);
    }

    private static String getDBUrl() {
        return System.getenv().getOrDefault("JDBC_DATABASE_URL", "jdbc:h2:mem:project;DB_CLOSE_DELAY=-1;");
    }

    public static Javalin getApp() {
        Logger logger = LoggerFactory.getLogger(App.class);

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(getDBUrl());
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

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
