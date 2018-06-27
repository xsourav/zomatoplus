package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRespository;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRespository userRespository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		User persistedUser=userRespository.save(user);
		return persistedUser;
	}
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> listofusers=userRespository.findAll();
		return listofusers;
	}
	
	
//	@GetMapping("/loginex")
//	public User exuserLogin(@RequestParam("uname") String uname,@RequestParam("password") String password) {
//		User usr = new User();
//		usr.setUname("Sourav");
//		usr.setPassword("123");
//		return usr;
//	}
//	
//	@GetMapping("/getAll")
//	public List<User> getAll()
//	{
//		List<User> users = new ArrayList<>();
//		users.add(new User("Sourav","123"));
//		users.add(new User("Spring","123"));
//		return users;
//		
//	}
//	
//	@PostMapping("/create")
//	public User createUser() {
//		User u1 = new User();
//		System.out.println(u1.toString());
//		return u1;
//	}
//	
	@PostMapping("/login")
	public User userLogin(@RequestBody User usr)
	{
		User usr1=userRespository.findByUnameAndPassword(usr.getUname(), usr.getPassword());
		if(usr1.equals(null))
			return null;
		else
			return usr1;
}

	

}
