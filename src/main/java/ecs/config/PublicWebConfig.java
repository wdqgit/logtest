package ecs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Created by xu_shuwen on 16-4-18.
 */
@Configuration
public class PublicWebConfig extends WebMvcConfigurationSupport {

  @Override
  protected void addInterceptors(InterceptorRegistry registry) {}

  @Override
  protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
    return new RestClientExcludeMapping();
  }

}
