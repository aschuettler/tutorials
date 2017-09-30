package com.javadevjournal.configurator;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.OAuthProviderType;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(OAuthClientRequest.class)
@EnableConfigurationProperties(ApacheOltuProperties.class)
@ConditionalOnWebApplication
public class ApacheOltuAutoClientConfigurator {

    @Autowired
    ApacheOltuProperties properties;


    @Bean
    @ConditionalOnMissingBean
    public OAuthClientRequest oAuthClientRequest() throws OAuthSystemException {
        return OAuthClientRequest.authorizationProvider(OAuthProviderType.GITHUB)
                .setClientId(properties.getOauth().getClientID())
                .setRedirectURI(properties.getOauth().getRedirectURI())
                .buildQueryMessage();
    }

}
