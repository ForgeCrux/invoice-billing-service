package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.CreateInvoiceRequestDomainRepository;
import com.probestack.forgestudio.design.model.CreateInvoiceRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.CreateInvoiceRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.CreateInvoiceRequestMongoRepository;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CreateInvoiceRequestMongoPersistenceAdapter implements CreateInvoiceRequestDomainRepository {
    private final CreateInvoiceRequestMongoRepository repository;

    public CreateInvoiceRequestMongoPersistenceAdapter(
            CreateInvoiceRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateInvoiceRequest save(CreateInvoiceRequest createInvoiceRequest) {
        CreateInvoiceRequestDocument document = toDocument(createInvoiceRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<CreateInvoiceRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<CreateInvoiceRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private CreateInvoiceRequestDocument toDocument(CreateInvoiceRequest createInvoiceRequest) {
        CreateInvoiceRequestDocument document = new CreateInvoiceRequestDocument();
        BeanUtils.copyProperties(createInvoiceRequest, document);
        return document;
    }

    private CreateInvoiceRequest toDomain(CreateInvoiceRequestDocument document) {
        CreateInvoiceRequest domain = new CreateInvoiceRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
