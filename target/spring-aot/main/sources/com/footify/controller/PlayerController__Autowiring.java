package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PlayerController}.
 */
@Generated
public class PlayerController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PlayerController apply(RegisteredBean registeredBean, PlayerController instance) {
    AutowiredFieldValueResolver.forRequiredField("playerRepository").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("clubRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
