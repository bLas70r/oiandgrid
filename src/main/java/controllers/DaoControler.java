package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import dao.Order;
import dao.User;
@RestController
public class DaoControler {
	
	@RequestMapping(value="/createUser")
	public void createUser() {
		System.out.println("IN");
	}
	
	@RequestMapping(value="/createCustomer")
	public void createCustomer() {
		System.out.println("IN");
	}
	@RequestMapping(value="/addAddressToCustomer")
	public void addAddressToCustomer() {
		System.out.println("IN");
	}
	@RequestMapping(value="/createOrder")
	public void createOrder() {
		System.out.println("IN");
	}
	@RequestMapping(value="/searchCustomer")
	public void searchCustomers() {
		System.out.println("IN");
	}
	@RequestMapping(value="/searchOrder", method = RequestMethod.POST , consumes = { "application/json" })
	@ResponseBody
	public void searchOrders(@RequestBody Order wrapperObj) 
			throws JsonMappingException, JsonParseException, IOException{
		System.out.println("IN");
	}
	
	public void deleteOrder() {
		
	}
	
	public void deleteCustomer() {
		
	}
	
	public void createBillingInfo() {
		
	}
    @RequestMapping(value="/login2", method = RequestMethod.POST ,produces=MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<User>> showWelcomePage(ModelMap model){
    	List<User> users = new ArrayList<User>();
    	users.add(new User("kiko"));
    	users.add(new User("kiko2"));
    	users.add(new User("kiko3"));
    	model.addAttribute("users", users);
    	
    	 return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }
}
