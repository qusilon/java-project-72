package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import hexlet.code.dto.BasePage;
@SuppressWarnings("unchecked")
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,38,38,38,39,39,39,39,40,40,40,43,43,44,44,44,56,56,56,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BasePage page, Content content) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n    <head>\n        <meta charset=\"utf-8\" />\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n        <title>Анализатор страниц</title>\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n              rel=\"stylesheet\"\n              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n              crossorigin=\"anonymous\">\n        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n                integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\n                crossorigin=\"anonymous\"></script>\n    </head>\n\n    <body class=\"d-flex flex-column min-vh-100\">\n        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n            <div class=\"container-fluid\">\n                <a class=\"navbar-brand\" href=\"/\">Анализатор страниц</a>\n                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n                        aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n                    <span class=\"navbar-toggler-icon\"></span>\n                </button>\n                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n                    <div class=\"navbar-nav\">\n                        <a class=\"nav-link\" href=\"/\">Главная</a>\n                        <a class=\"nav-link\" href=\"/urls\">Сайты</a>\n                    </div>\n                </div>\n            </div>\n        </nav>\n\n        <main class=\"flex-grow-1\">\n            ");
		if (page != null && page.getFlash() != null) {
			jteOutput.writeContent("\n                <div class=\"rounded-0 m-0 alert alert-dismissible fade show alert-");
			jteOutput.setContext("div", "class");
			jteOutput.writeUserContent(page.getFlashType());
			jteOutput.setContext("div", null);
			jteOutput.writeContent("\" role=\"alert\">\n                    <p class=\"m-0\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(page.getFlash());
			jteOutput.writeContent("</p>\n                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n                </div>\n            ");
		}
		jteOutput.writeContent("\n            ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n        </main>\n\n        <footer class=\"footer border-top py-3 mt-5 bg-light\">\n            <div class=\"container-xl\">\n                <div class=\"text-center\">\n                    created by\n                    <a href=\"https://github.com/qusilon\" target=\"_blank\">Qusilon</a>\n                </div>\n            </div>\n        </footer>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BasePage page = (BasePage)params.getOrDefault("page", null);
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, page, content);
	}
}
