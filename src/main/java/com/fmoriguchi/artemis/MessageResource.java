package com.fmoriguchi.artemis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author fmoriguchi
 *
 */
@RestController
@RequestMapping("messages")
class MessageResource {
	
	private final SendMessage message;
	
	MessageResource(SendMessage message) {
		this.message = message;
	}

	@GetMapping("{m}")
	String send(@PathVariable String m) {
		
		message.send(m);

		return m;
	}

}
