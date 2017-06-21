package cinema.web.controllers;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import cinema.business.entities.User;
import cinema.business.services.UserService;

@Controller
public class LoginController implements CinemaController {

    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        WebContext ctx = new WebContext(request, response,
        						servletContext, request.getLocale());
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("login", ctx, response.getWriter());
        
    }
	@Autowired
	private UserService userService;

	@GetMapping("/login")
    public String startLogin(@ModelAttribute("customer")User user) {
		return "login";
    }
	
	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute("customer")User user) {
		try {
			//userService.create(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "index";
	}
}
