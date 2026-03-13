package com.footify.repository;

import com.footify.entity.Transfer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link TransferRepository}.
 */
@Generated
public class TransferRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public TransferRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link TransferRepository#findByPlayerId(java.lang.Long)}.
   */
  public List<Transfer> findByPlayerId(Long player_Id) {
    String queryString = "SELECT t FROM Transfer t WHERE t.player.id = :player_Id";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("player_Id", player_Id);

    return (List<Transfer>) query.getResultList();
  }
}
