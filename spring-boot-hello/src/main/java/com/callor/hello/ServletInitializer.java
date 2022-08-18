package com.callor.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/*
SpringBootServletInitializer 클래스
Boot Project 에서 root-context.xml, servlet-context.xml 을 대신하는
클래스로서
여기에서 HelloApplication.class.main() method 를 내부에 호출한다.
 */
/*
@ConponentScan
Anotation 을 이용하여 Class 를 Scan 하여 bean 으로 생성하도록 하는 지시어
 */
@ComponentScan(
		{
		"com.callor.hello.controller",
		"com.callor.service"
		}
)
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}

}
