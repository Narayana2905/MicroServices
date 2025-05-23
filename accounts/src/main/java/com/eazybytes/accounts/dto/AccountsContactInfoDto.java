package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}
//@Component
//@ConfigurationProperties(prefix = "accounts")
//public record AccountsContactInfoDto(String message,Map<String, String> contactDetails,List<String> onCallSupport) {}
