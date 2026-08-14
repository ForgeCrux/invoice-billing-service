package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.CreateInvoiceRequestDocument;
import java.lang.String;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for CreateInvoiceRequest documents.
 */
public interface CreateInvoiceRequestMongoRepository extends MongoRepository<CreateInvoiceRequestDocument, String> {
}
