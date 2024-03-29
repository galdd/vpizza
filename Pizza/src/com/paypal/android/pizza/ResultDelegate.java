package com.paypal.android.pizza;
import java.io.Serializable;

import com.paypal.android.MECL.PayPalListener;

/*
 * Our PayPalListener class to get the device reference token from MECL
 */
public class ResultDelegate implements PayPalListener, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public void couldNotFetchDeviceReferenceToken() {
		//Initialization failed and we didn't get a token
		Pizza._deviceReferenceToken = null;
	}

	@Override
	public void receivedDeviceReferenceToken(String token) {
		//Initialization was successful
		Pizza._deviceReferenceToken = token;
	}

}
