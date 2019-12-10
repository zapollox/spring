package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author apollo
 * Created by apollo on 2019/12/10.
 */
public class A {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Dao appConfig = (Dao) ac.getBean(Dao.class);
		System.out.println(appConfig.toString());
	}
}
