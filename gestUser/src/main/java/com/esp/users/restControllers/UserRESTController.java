package com.esp.users.restControllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.esp.users.entities.Users;
import com.esp.users.dao.UserRepository;

@RestController
@CrossOrigin("*")
public class UserRESTController {
	@Autowired
	UserRepository userRep;
	
	@RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
	public Users getUserByUsername(@PathVariable("username") String
	username) {
		return userRep.findByUsername(username);
	}
	
	@GetMapping("/users")
	public List<Users> getUsers() {
		return userRep.findAll();
	}
	
	@PostMapping("/adduser")
	public Users saveUser(@RequestBody Users user) {
		return userRep.save(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteuser(@PathVariable (value="id") Long id) {
		Optional<Users> art = userRep.findById(id);
		if (art.isPresent()) {
			Users users = art.get();
			userRep.delete(users);
		}
	}
}