package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TrophyController}.
 */
@Generated
public class TrophyController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TrophyController apply(RegisteredBean registeredBean, TrophyController instance) {
    AutowiredFieldValueResolver.forRequiredField("trophyRepository").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("clubRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
