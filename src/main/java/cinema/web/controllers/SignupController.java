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
public class SignupController implements CinemaController {

	@Autowired
	private UserService userService;

    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        WebContext ctx = new WebContext(request, response,
        						servletContext, request.getLocale());
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("signup", ctx, response.getWriter());
        
    }

	public User getUser() {
		return new User();
	}
	
	@GetMapping("/signup")
    public String finishSignup(final User user) {
		System.out.println("signup...");
        return "signup";
    }
	
	@PostMapping("/signup")
	public String signupSubmit(@ModelAttribute("user")User user) {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login";
	}
			
}
