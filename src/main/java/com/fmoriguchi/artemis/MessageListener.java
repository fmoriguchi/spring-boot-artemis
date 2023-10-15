/**
 * 
 */
package com.fmoriguchi.artemis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @author fmoriguchi
 *
 */
@Component
class MessageListener {

	private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

	@JmsListener(destination = "message")
	void onMessage(String message) {

		log.info("Message received > {}", message);
	}

}
