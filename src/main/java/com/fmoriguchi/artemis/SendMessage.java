/**
 * 
 */
package com.fmoriguchi.artemis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author fmoriguchi
 *
 */
@Component
class SendMessage {

	private static final Logger log = LoggerFactory.getLogger(SendMessage.class);

	private final JmsTemplate jms;

	SendMessage(JmsTemplate jms) {

		this.jms = jms;
	}

	void send(String message) {

		log.info("Sending a message '{}'", message);

		jms.convertAndSend("message", message);
	}
}
