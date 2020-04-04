package com.fermi4.springcloud.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fermi4.springcloud.model.Coupon;

@FeignClient("zuul-api-gateway")

//@RibbonClient("coupon-service")
// Zuul uses ribbon on the server side, so we do not need it on client side
public interface CouponClient {
	// need to include the microservice name so that Zuul can route the request to the proper service
	@GetMapping("/coupon-service/coupons/retrieve/{code}")
	Coupon getCoupon(@PathVariable String code);
	
}
