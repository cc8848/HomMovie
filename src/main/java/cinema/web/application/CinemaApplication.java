package cinema.web.application;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import cinema.web.controllers.CinemaController;
import cinema.web.controllers.HomeController;
import cinema.web.controllers.ErrorController;
import cinema.web.controllers.OrderController;
import cinema.web.controllers.LoginController;
import cinema.web.controllers.SigninController;
import cinema.web.controllers.SignupController;


public class CinemaApplication {

    private TemplateEngine templateEngine;
    private Map<String, CinemaController> controllersByURL;

    public CinemaApplication(final ServletContext servletContext) {
        super();
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
        
        // HTML is the default mode, but we will set it anyway for better understanding of code
        templateResolver.setTemplateMode(TemplateMode.HTML);
        // This will convert "home" to "/WEB-INF/templates/home.html"
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        // Set template cache TTL to 1 hour. If not set, entries would live in cache until expelled by LRU
        templateResolver.setCacheTTLMs(Long.valueOf(3600000L));
        
        // Cache is set to true by default. Set to false if you want templates to
        // be automatically updated when modified.
        templateResolver.setCacheable(true);

        this.templateEngine = new TemplateEngine();
        this.templateEngine.setTemplateResolver(templateResolver);

        this.controllersByURL = new HashMap<String, CinemaController>();
        this.controllersByURL.put("/", new HomeController());
        this.controllersByURL.put("/login", new LoginController());
        this.controllersByURL.put("/signin", new SigninController());
        this.controllersByURL.put("/signup", new SignupController());
        this.controllersByURL.put("/order", new OrderController());
        this.controllersByURL.put("/error", new ErrorController());
    }
    
    public CinemaController resolveControllerForRequest(final HttpServletRequest request) {
        final String path = getRequestPath(request);
        return this.controllersByURL.get(path);
    }
    
    public ITemplateEngine getTemplateEngine() {
        return this.templateEngine;
    }

    private static String getRequestPath(final HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        final String contextPath = request.getContextPath();
        
        final int fragmentIndex = requestURI.indexOf(';'); 
        if (fragmentIndex != -1) {
            requestURI = requestURI.substring(0, fragmentIndex);
        }
        
        if (requestURI.startsWith(contextPath)) {
            return requestURI.substring(contextPath.length());
        }
        return requestURI;
    }
}
