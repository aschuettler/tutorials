package com.javadevjournal.autoconfigure;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = ApacheOltuProperties.APACHE_OLTU_PREFIX)
public class ApacheOltuProperties {

    public static final String APACHE_OLTU_PREFIX="oltu";

    @NestedConfigurationProperty
    private Oauth oauth;

    public static class Oauth {

        private String authorizationLocation;
        private String clientID;
        private String redirectURI;
        private String clientSecret;
        private String grantType;

        public String getAuthorizationLocation() {
            return authorizationLocation;
        }

        public void setAuthorizationLocation(String authorizationLocation) {
            this.authorizationLocation = authorizationLocation;
        }

        public String getClientID() {
            return clientID;
        }

        public void setClientID(String clientID) {
            this.clientID = clientID;
        }

        public String getRedirectURI() {
            return redirectURI;
        }

        public void setRedirectURI(String redirectURI) {
            this.redirectURI = redirectURI;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public String getGrantType() {
            return grantType;
        }

        public void setGrantType(String grantType) {
            this.grantType = grantType;
        }
    }

    public Oauth getOauth() {
        return oauth;
    }

    public void setOauth(Oauth oauth) {
        this.oauth = oauth;
    }
}
