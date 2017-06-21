package cinema.web.controllers;


import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import cinema.business.entities.Order;
import cinema.business.entities.Movie;
import cinema.business.services.OrderService;
import cinema.business.services.MovieService;


@Controller
public class OrderController implements CinemaController {

    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        WebContext ctx = new WebContext(request, response,
        						servletContext, request.getLocale());
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("order", ctx, response.getWriter());
        
    }
	@Autowired
	private MovieService movieService;
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/success", method = RequestMethod.POST)
    public String finishOrderTicket(final ModelMap model, Order order, final BindingResult bindingResult ) {
    	model.clear();
		if (bindingResult.hasErrors()) {
    		return "redirect:/ticket";
    	}

		Movie movie = movieService.findById(order.getId());
		Subject subject = SecurityUtils.getSubject();
		//order.setId(subject.getPrincipal().toString());
		//order.setExpenditure(order.getCount() * movie.getPrice());
        System.out.println(subject.getPrincipal().toString());


        model.addAttribute("order", order);

        return "success";
    }

	@RequestMapping("order/{orderId}")
	public String orderDetail(@PathVariable("orderId")String orderId) {
		return	"order";
	}
}
