package ecs.config;

import com.github.bingoohuang.springrestclient.annotations.SpringRestClientEnabled;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * 由于isHandler判断为
 * 
 * <pre>
 * ((AnnotationUtils.findAnnotation(beanType, Controller.class) != null) || (AnnotationUtils
 *     .findAnnotation(beanType, RequestMapping.class) != null))
 * </pre>
 *
 * 会导致spring mvc对rest client的处理,如果定义重复了RequestMapping会导致服务无法启动.
 * 
 * @author shuwei@asiainfo.com
 */
public class RestClientExcludeMapping extends RequestMappingHandlerMapping {
  @Override
  protected boolean isHandler(Class<?> beanType) {
    if (AnnotationUtils.findAnnotation(beanType, SpringRestClientEnabled.class) != null)
      return false;
    return super.isHandler(beanType);
  }
}
