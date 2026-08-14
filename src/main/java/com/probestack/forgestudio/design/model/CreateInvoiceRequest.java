package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.InvoiceLineItem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateInvoiceRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T08:53:29.363795320Z[GMT]")public class CreateInvoiceRequest {

  private String customerId;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems = new ArrayList<>();

  private String currency = "USD";

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  private String purchaseOrderRef;

  public CreateInvoiceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateInvoiceRequest(String customerId, List<@Valid InvoiceLineItem> lineItems, LocalDate dueDate) {
    this.customerId = customerId;
    this.lineItems = lineItems;
    this.dueDate = dueDate;
  }

  public CreateInvoiceRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @NotNull   @Schema(name = "customerId", example = "cust-88213", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CreateInvoiceRequest lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreateInvoiceRequest addLineItemsItem(InvoiceLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
  */
  @NotNull @Valid @Size(min = 1)   @Schema(name = "lineItems", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lineItems")
  public List<@Valid InvoiceLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CreateInvoiceRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
    @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CreateInvoiceRequest dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  */
  @NotNull @Valid   @Schema(name = "dueDate", example = "Mon Aug 31 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public CreateInvoiceRequest purchaseOrderRef(String purchaseOrderRef) {
    this.purchaseOrderRef = purchaseOrderRef;
    return this;
  }

  /**
   * Get purchaseOrderRef
   * @return purchaseOrderRef
  */
    @Schema(name = "purchaseOrderRef", example = "PO-4471", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseOrderRef")
  public String getPurchaseOrderRef() {
    return purchaseOrderRef;
  }

  public void setPurchaseOrderRef(String purchaseOrderRef) {
    this.purchaseOrderRef = purchaseOrderRef;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvoiceRequest createInvoiceRequest = (CreateInvoiceRequest) o;
    return Objects.equals(this.customerId, createInvoiceRequest.customerId) &&
        Objects.equals(this.lineItems, createInvoiceRequest.lineItems) &&
        Objects.equals(this.currency, createInvoiceRequest.currency) &&
        Objects.equals(this.dueDate, createInvoiceRequest.dueDate) &&
        Objects.equals(this.purchaseOrderRef, createInvoiceRequest.purchaseOrderRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, lineItems, currency, dueDate, purchaseOrderRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvoiceRequest {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    purchaseOrderRef: ").append(toIndentedString(purchaseOrderRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

