package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.InvoiceLineItem;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Invoice
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T08:53:29.363795320Z[GMT]")public class Invoice {

  private String id;

  private String invoiceNumber;

  private String customerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    ISSUED("ISSUED"),
    
    PAID("PAID"),
    
    OVERDUE("OVERDUE"),
    
    VOID("VOID");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  private String currency;

  private Double subtotal;

  private Double taxAmount;

  private Double totalAmount;

  private Double amountPaid;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issuedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public Invoice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Invoice(String id, String invoiceNumber, String customerId, StatusEnum status, Double totalAmount) {
    this.id = id;
    this.invoiceNumber = invoiceNumber;
    this.customerId = customerId;
    this.status = status;
    this.totalAmount = totalAmount;
  }

  public Invoice id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique invoice ID (UUID)
   * @return id
  */
  @NotNull   @Schema(name = "id", example = "i1n2v3c4", description = "Unique invoice ID (UUID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Sequential invoice number (unique)
   * @return invoiceNumber
  */
  @NotNull   @Schema(name = "invoiceNumber", example = "INV-2026-00317", description = "Sequential invoice number (unique)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invoiceNumber")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice customerId(String customerId) {
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

  public Invoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "ISSUED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invoice currency(String currency) {
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

  public Invoice subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * Get subtotal
   * @return subtotal
  */
    @Schema(name = "subtotal", example = "1200.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtotal")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public Invoice taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
    @Schema(name = "taxAmount", example = "216.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Invoice totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @NotNull   @Schema(name = "totalAmount", example = "1416.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Invoice amountPaid(Double amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

  /**
   * Get amountPaid
   * @return amountPaid
  */
    @Schema(name = "amountPaid", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountPaid")
  public Double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public Invoice lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(InvoiceLineItem lineItemsItem) {
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
  @Valid   @Schema(name = "lineItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineItems")
  public List<@Valid InvoiceLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Invoice issuedAt(LocalDate issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
  */
  @Valid   @Schema(name = "issuedAt", example = "Sat Aug 01 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuedAt")
  public LocalDate getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(LocalDate issuedAt) {
    this.issuedAt = issuedAt;
  }

  public Invoice dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  */
  @Valid   @Schema(name = "dueDate", example = "Mon Aug 31 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid   @Schema(name = "createdAt", example = "2026-08-01T09:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.customerId, invoice.customerId) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.subtotal, invoice.subtotal) &&
        Objects.equals(this.taxAmount, invoice.taxAmount) &&
        Objects.equals(this.totalAmount, invoice.totalAmount) &&
        Objects.equals(this.amountPaid, invoice.amountPaid) &&
        Objects.equals(this.lineItems, invoice.lineItems) &&
        Objects.equals(this.issuedAt, invoice.issuedAt) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.createdAt, invoice.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceNumber, customerId, status, currency, subtotal, taxAmount, totalAmount, amountPaid, lineItems, issuedAt, dueDate, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

