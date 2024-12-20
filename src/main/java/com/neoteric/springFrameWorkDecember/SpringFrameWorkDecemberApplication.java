package com.neoteric.springFrameWorkDecember;

import com.neoteric.springFrameWorkDecember.annotations.Atm;
import com.neoteric.springFrameWorkDecember.annotations.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameWorkDecemberApplication {

	public static void main(String[] args) {
// talking to IOC container using the application context
		//
		ApplicationContext a=
		SpringApplication.run(SpringFrameWorkDecemberApplication.class, args);//here abstraction and
		// this is the actual IOC container in the JVM

	//	Atm atm = new Atm();
		Atm atm=a.getBean(Atm.class); //say spring this class is created bean
		User user= a.getBean(User.class);

		atm.message();
		user.pin();
	}

}
