/****************************************************************************
 *
 *                      ICU Research Platform
 *                © Koninklijke Philips N.V., 2022.
 *
 * All rights are reserved. Reproduction or dissemination
 * in whole or in part is prohibited without the written
 * consent of the copyright owner.
 *
 *
 * FILE NAME: ApplicationController.java
 *
 * CREATED: Apr 16, 2022 4:04:12 PM
 *
 * ORIGINAL AUTHOR(S): 310078398
 *
 ***************************************************************************/
package com.example.springbootTest.controller;

import com.example.springbootTest.entity.User;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @date: 2022年09月29日 9:05 PM
 */

@RestController public class UserController {

	@JsonView(User.sonView.class) @RequestMapping("/JsonViewTest") public User getUserWithPassword() {
		User user = new User(1, "zhou", "123");
		return user;
	}

	@JsonView(User.View.class) @RequestMapping("/JsonViewTest2") public User getUserWithoutPassword() {
		User user = new User(1, "zhou", "123");
		return user;
	}
}
