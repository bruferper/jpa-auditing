package com.bfz.jpaauditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "getAuditorAware")
public class JpaAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuditingApplication.class, args);
	}

}
