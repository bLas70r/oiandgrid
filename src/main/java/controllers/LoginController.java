package controllers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import dao.Address;
import dao.BillingInfo;
import dao.Customer;
import dao.Order;
import dao.OrderAttribute;
import dao.OrderItem;
import dao.User;

@Controller
@SessionAttributes("name")
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String welcome1(ModelMap model) {

		return "redirect:login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		if (model.get("user") != null) {
			return "welcome";
		}
		boolean isValidUser = true;

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("user", new User(name));
		model.put("dummyCustomer", getObjectAsJSON(new Customer()));
		model.put("dummyOrder", getObjectAsJSON(new Order()));
		model.put("dummyAddress", getObjectAsJSON(new Address()));
		model.put("dummyOrderAttribute", getObjectAsJSON(new OrderAttribute()));
		model.put("dummyOrderOrderItem", getObjectAsJSON(new OrderItem()));
		model.put("dummyBillingInfo", getObjectAsJSON(new BillingInfo()));
		model.put("UserName", name);
		model.put("UserRole", "PBotanakov".equalsIgnoreCase(name) ? "administrator" : "accountant");

		return "welcome";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(ModelMap model) {
		model.remove("user");
		return "login";
	}

	private String getObjectAsJSON(Object obj) {

		StringBuilder sb = new StringBuilder();
		for (Field f : obj.getClass().getDeclaredFields()) {
			if (sb.length() == 0) {
				sb.append("var " + obj.getClass().getSimpleName() + " =  {" + f.getName() + ": ''");
			} else {
				sb.append("," + f.getName() + ": ''");
			}
		}

		sb.append("};");

		return sb.toString();

	}
}
