package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.CreateInvoiceRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for CreateInvoiceRequest domain operations.
 */
public interface CreateInvoiceRequestDomainRepository {
    CreateInvoiceRequest save(CreateInvoiceRequest createInvoiceRequest);

    Optional<CreateInvoiceRequest> findById(String id);

    List<CreateInvoiceRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
