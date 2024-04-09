package com.bus.BusBooking.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bus.BusBooking.request.JwtRequest;
import com.bus.BusBooking.response.Response;

@FeignClient(name = "", path = "")
@RibbonClient(value = "")
public interface BusService {

	@PostMapping("/registerUser")
	public ResponseEntity<Response> createUser(@RequestBody JwtRequest jwtRequest);
	

}
