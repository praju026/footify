package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClubController}.
 */
@Generated
public class ClubController__BeanDefinitions {
  /**
   * Get the bean definition for 'clubController'.
   */
  public static BeanDefinition getClubControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClubController.class);
    InstanceSupplier<ClubController> instanceSupplier = InstanceSupplier.using(ClubController::new);
    instanceSupplier = instanceSupplier.andThen(ClubController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
