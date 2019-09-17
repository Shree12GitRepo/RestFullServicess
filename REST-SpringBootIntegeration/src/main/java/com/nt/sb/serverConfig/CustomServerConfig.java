package com.nt.sb.serverConfig;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomServerConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
	
	public CustomServerConfig() {
		System.out.println("CustomServerConfig.CustomServerConfig()");
	}
	
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
       // factory.setContextPath("");
        factory.setPort(8084);
    }

}
