package com.footify.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ClubController}.
 */
@Generated
public class ClubController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ClubController apply(RegisteredBean registeredBean, ClubController instance) {
    AutowiredFieldValueResolver.forRequiredField("clubRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
