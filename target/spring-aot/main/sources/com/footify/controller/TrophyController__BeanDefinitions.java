package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TrophyController}.
 */
@Generated
public class TrophyController__BeanDefinitions {
  /**
   * Get the bean definition for 'trophyController'.
   */
  public static BeanDefinition getTrophyControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TrophyController.class);
    InstanceSupplier<TrophyController> instanceSupplier = InstanceSupplier.using(TrophyController::new);
    instanceSupplier = instanceSupplier.andThen(TrophyController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
