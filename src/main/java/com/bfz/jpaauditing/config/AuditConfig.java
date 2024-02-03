package com.bfz.jpaauditing.config;

import com.bfz.jpaauditing.audit.ApplicationAuditAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author bruferper
 */

@Configuration
@EnableJpaAuditing(auditorAwareRef = "getAuditorAware")
public class AuditConfig {

    @Bean
    public AuditorAware<String> getAuditorAware() {
        return new ApplicationAuditAware();
    }

}
