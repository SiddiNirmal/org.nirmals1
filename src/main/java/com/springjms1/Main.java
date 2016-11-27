package com.springjms1;

import javax.jms.JMSException;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class Main {
	public static void main(String[] args) throws JMSException {
		ApplicationContext ac =new ClassPathXmlApplicationContext("spring.xml");
		JmsTemplate jmsTemplate = (JmsTemplate)ac.getBean("jmsTemplate");
		ActiveMQTextMessage activeMQTextMessage = (ActiveMQTextMessage)jmsTemplate.receive();
		String mess= activeMQTextMessage.getText();
		System.out.println(mess);
	}

}
