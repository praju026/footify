package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PlayerController}.
 */
@Generated
public class PlayerController__BeanDefinitions {
  /**
   * Get the bean definition for 'playerController'.
   */
  public static BeanDefinition getPlayerControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PlayerController.class);
    InstanceSupplier<PlayerController> instanceSupplier = InstanceSupplier.using(PlayerController::new);
    instanceSupplier = instanceSupplier.andThen(PlayerController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
