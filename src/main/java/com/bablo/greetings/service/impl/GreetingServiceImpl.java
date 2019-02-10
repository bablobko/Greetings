/**
 * 
 */
package com.bablo.greetings.service.impl;

import com.bablo.greetings.greeting.helper.Language;
import com.bablo.greetings.greeting.service.GreetingService;

/**
 * @author anusharma
 *
 */
public class GreetingServiceImpl implements GreetingService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bablo.greetings.greeting.service.GreetingService#sendGreetings(com.bablo.
	 * greetings.greeting.helper.Language)
	 */
	public String sendGreetings(Language lang) {
		String str = null;
		switch (lang) {
		case HINDI:
			str = "Namaskar";
			break;
		case ENGLISH:
			str = "Hello";
			break;
		case NEPALI:
			str = "Namaskar";
			break;
		case GERMAN:
			str = "Hallo";
			break;
		case FRENCH:
			str = "Bonjour";
			break;
		case DUTCH:
			str = "Hallo";
			break;
		default:
			str = "Hi";
			break;
		}
		
		return str;
	}

}
