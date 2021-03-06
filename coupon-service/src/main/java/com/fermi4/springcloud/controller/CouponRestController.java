package com.fermi4.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fermi4.springcloud.model.Coupon;
import com.fermi4.springcloud.repo.CouponRepository;

@RestController
@RequestMapping("/coupons")
public class CouponRestController {

	@Autowired
	CouponRepository _repo;

	@PostMapping("/create")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return _repo.save(coupon);
	}
	
	@GetMapping("/retrieve/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		return _repo.findByCode(code);
	}

}
