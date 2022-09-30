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
package com.example.springbootTest.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: TODO
 * @date: 2022年09月29日 9:09 PM
 */
@AllArgsConstructor
public class User {
	//private static final long serialVersionUID = -2509001847811833520L;

	public interface View{}
	public interface sonView extends View{}


	@JsonView(User.View.class)
	@Getter
	@Setter
	private Integer userID;

	@JsonView(User.sonView.class)
	@Getter
	@Setter
	private String userName;

	@Getter
	@Setter
	private String password;
}
