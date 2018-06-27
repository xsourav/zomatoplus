package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant r1)
	{
		Restaurant persistentr2=restaurantRepository.save(r1);
		return persistentr2;
	}
	
	@GetMapping("/getAll")
	public List<Restaurant> getAll(){
		List<Restaurant> listofrestaurant=restaurantRepository.findAll();
		return listofrestaurant;
	}
	
	@PostMapping("/findLogin")
	public Restaurant userLogin(@RequestBody Restaurant res)
	{
		Restaurant usr1=restaurantRepository.findByRname(res.getRname());
		if(res.equals(null))
			return null;
		else
			return res;
	}
	
	@PostMapping("/addItems")
		public Items addItems(@RequestBody Items item) {
			itemRepo.saveAndFlush(item);
			return item;
				
		}
	
	
	
//	@GetMapping("/getAll")
//	public List<Restaurant> getAll(){
//		List<Restaurant> rlist=new ArrayList<>();
//		rlist.add(new Restaurant("bjks","jsbcdjk","bdsjb","bdsnb "));
//		return rlist;
//	}
//	
//	@PostMapping("/create")
//	public User createUser() {
//		User u1 = new User();
//		System.out.println(u1.toString());
//		return u1;
//	}
//	
//	@PostMapping("/addItems")
//	public Items addItem(@RequestBody Items item){
//		Items food = new Items();
//		food.setInmae(item.getInmae());
//		food.setIprice(item.getIprice());
//		return item;	
//	}
}
