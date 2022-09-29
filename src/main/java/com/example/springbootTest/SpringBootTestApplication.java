package com.example.springbootTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication @Slf4j public class SpringBootTestApplication {



	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootTestApplication.class, args);

		Environment env = run.getEnvironment();

		String ip = InetAddress.getLocalHost().getHostAddress();

		String port = env.getProperty("server.port");


		log.info("\n----------------------------------------------------------\n\t" +
				"Application  is running! Access URLs:\n\t" +
				"Local访问网址: \t\thttp://localhost:" + port +   "\n\t" +
				"External访问网址: \thttp://" + ip + ":" + port +   "\n\t" +
				"----------------------------------------------------------");
	}
}
