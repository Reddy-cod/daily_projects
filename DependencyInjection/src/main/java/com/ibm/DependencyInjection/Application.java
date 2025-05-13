package com.ibm.DependencyInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		TextEditor textEditor=(TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		System.out.println("End");
	}
}