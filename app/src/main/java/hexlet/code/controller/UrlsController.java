package hexlet.code.controller;

import hexlet.code.dto.UrlPage;
import hexlet.code.dto.UrlsPage;
import hexlet.code.model.Url;
import hexlet.code.repository.UrlRepository;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

import java.net.URI;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;


public class UrlsController {
    public static void create(Context ctx) throws SQLException {
        try {
            String inputUrl = ctx.formParam("url").trim().toLowerCase();
            URI uri = new URI(inputUrl);
            URL url = uri.toURL();
            String parsedUrl = String.format("%s://%s%s",
                    url.getProtocol(),
                    url.getHost(),
                    url.getPort() == -1 ? "" : ":" + url.getPort()
            );
            if (UrlRepository.find(parsedUrl).isEmpty()) {
                Url newUrl = new Url(parsedUrl);
                UrlRepository.save(newUrl);
            }
            ctx.redirect("/urls");
        } catch (Exception e) {

        }
    }

    public static void index(Context ctx) throws SQLException {
        List<Url> urls = UrlRepository.getEntities();
        UrlsPage page = new UrlsPage(urls);
        ctx.render("urls/index.jte", model("page", page));
    }

    public static void show(Context ctx) throws SQLException {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var url = UrlRepository.find(id).orElseThrow(() -> new NotFoundResponse("Page not found"));
        var page = new UrlPage(url);
        ctx.render("urls/show.jte", model("page", page));
    }
}
