package cinema.web.controller;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;


public class HomeController implements Controller {
    public HomeController() {
        super();
    }
    
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        WebContext ctx = new WebContext(request, response,
        						servletContext, request.getLocale());
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("home", ctx, response.getWriter());
        
    }

}
