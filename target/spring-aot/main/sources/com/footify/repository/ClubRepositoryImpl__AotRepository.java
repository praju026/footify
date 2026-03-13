package com.footify.repository;

import com.footify.entity.Club;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link ClubRepository}.
 */
@Generated
public class ClubRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public ClubRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link ClubRepository#findByName(java.lang.String)}.
   */
  public Optional<Club> findByName(String name) {
    String queryString = "SELECT c FROM Club c WHERE c.name = :name";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("name", name);

    return Optional.ofNullable((Club) convertOne(query.getSingleResultOrNull(), false, Club.class));
  }
}
