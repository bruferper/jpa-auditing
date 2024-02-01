package com.bfz.jpaauditing.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * @author bruferper
 */

public class ApplicationAuditAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // We can choose the source of this user info (Spring Security, Request Headers, etc)
        return Optional.of("bruferper");
    }

}
