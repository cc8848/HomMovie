package cinema.web.controllers;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

@Controller
public class ErrorController implements CinemaController {

    @RequestMapping(value = "/error")
    String error() {
        return  "error";
    }

    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        WebContext ctx = new WebContext(request, response,
        						servletContext, request.getLocale());
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("error", ctx, response.getWriter());
        
    }
}
