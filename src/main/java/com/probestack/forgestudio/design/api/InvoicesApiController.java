package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateInvoiceRequest;
import com.probestack.forgestudio.design.model.Invoice;
import com.probestack.forgestudio.design.model.InvoiceListResponse;
import com.probestack.forgestudio.design.model.UpdateInvoiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.InvoicesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T08:53:29.363795320Z[GMT]")
@Controller
@RequestMapping("${openapi.invoiceBillingService.base-path:/v1}")
public class InvoicesApiController implements InvoicesApi {

    private static final Logger log = LoggerFactory.getLogger(InvoicesApiController.class);

    private final InvoicesService invoicesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public InvoicesApiController(InvoicesService invoicesService, GeneratedRequestValidator generatedRequestValidator) {
        this.invoicesService = invoicesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Invoice> createInvoice(@RequestBody() CreateInvoiceRequest createInvoiceRequest) {
        log.info("Processing createInvoice request");
        try {
            generatedRequestValidator.validate("createInvoice", createInvoiceRequest);
            var response = invoicesService.createInvoice(createInvoiceRequest);
            log.info("createInvoice completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createInvoice: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable() String invoiceId) {
        log.info("Processing getInvoiceById request");
        try {
            var response = invoicesService.getInvoiceById(invoiceId);
            log.info("getInvoiceById completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getInvoiceById: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<InvoiceListResponse> listInvoices(@RequestParam() String customerId, @RequestParam() String status, @RequestParam() Integer page, @RequestParam() Integer size) {
        log.info("Processing listInvoices request");
        try {
            var response = invoicesService.listInvoices(customerId, status, page, size);
            log.info("listInvoices completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listInvoices: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Invoice> updateInvoice(@PathVariable() String invoiceId, @RequestBody() UpdateInvoiceRequest updateInvoiceRequest) {
        log.info("Processing updateInvoice request");
        try {
            generatedRequestValidator.validate("updateInvoice", updateInvoiceRequest);
            var response = invoicesService.updateInvoice(invoiceId, updateInvoiceRequest);
            log.info("updateInvoice completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateInvoice: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> voidInvoice(@PathVariable() String invoiceId) {
        log.info("Processing voidInvoice request");
        try {
            var response = invoicesService.voidInvoice(invoiceId);
            log.info("voidInvoice completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process voidInvoice: {}", e.getMessage(), e);
            throw e;
        }
    }
}
