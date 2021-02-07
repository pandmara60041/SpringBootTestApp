package com.example.demo;

import org.springframework.boot.CommandLineRunner;

public class RunnerTest 
implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RunnerTest.run():code modified");
		int a =10;
		System.out.println("a:"+a);
		
	}

}
