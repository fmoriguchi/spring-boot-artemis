/**
 * 
 */
package com.fmoriguchi.artemis;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author fmoriguchi
 *
 */
@Component
class SendMessage {

	private final JmsTemplate jms;

	SendMessage(JmsTemplate jms) {

		this.jms = jms;
	}

	void send(String message) {

		jms.convertAndSend("message", message);
	}
}
