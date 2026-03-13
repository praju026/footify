package com.footify;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FootifyApplication}.
 */
@Generated
public class FootifyApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'footifyApplication'.
   */
  public static BeanDefinition getFootifyApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FootifyApplication.class);
    beanDefinition.setInstanceSupplier(FootifyApplication::new);
    return beanDefinition;
  }
}
