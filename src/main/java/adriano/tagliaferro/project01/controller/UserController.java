package adriano.tagliaferro.project01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import adriano.tagliaferro.project01.entity.User;

@RestController
public class UserController {

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public List<User> getUsers() {

		List<User> users = new ArrayList<>();

		User user = new User("Adriano", "teste@teste.com");

		users.add(user);
		
		user = new User("Joaquim", "joaquim@gmail.com");
		
		users.add(user);

		return users;
	}
	
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public User setUser(@RequestBody User user) {
		
		return user;
	}

}
