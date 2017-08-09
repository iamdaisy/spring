package net.multicampus.dev.di01;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext(TVUser.class, "beaninit.xml");
		
		
		TV tv = (TV) context.getBean("samsungTV");
				
		tv.powerOn();
		tv.channelUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}


