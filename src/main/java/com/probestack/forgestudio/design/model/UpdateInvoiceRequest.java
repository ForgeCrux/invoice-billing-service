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
 * UpdateInvoiceRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T08:53:29.363795320Z[GMT]")public class UpdateInvoiceRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dueDate;

  private String purchaseOrderRef;

  @Valid
  private List<@Valid InvoiceLineItem> lineItems;

  public UpdateInvoiceRequest dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  */
  @Valid   @Schema(name = "dueDate", example = "Tue Sep 15 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public UpdateInvoiceRequest purchaseOrderRef(String purchaseOrderRef) {
    this.purchaseOrderRef = purchaseOrderRef;
    return this;
  }

  /**
   * Get purchaseOrderRef
   * @return purchaseOrderRef
  */
    @Schema(name = "purchaseOrderRef", example = "PO-4488", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseOrderRef")
  public String getPurchaseOrderRef() {
    return purchaseOrderRef;
  }

  public void setPurchaseOrderRef(String purchaseOrderRef) {
    this.purchaseOrderRef = purchaseOrderRef;
  }

  public UpdateInvoiceRequest lineItems(List<@Valid InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public UpdateInvoiceRequest addLineItemsItem(InvoiceLineItem lineItemsItem) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInvoiceRequest updateInvoiceRequest = (UpdateInvoiceRequest) o;
    return Objects.equals(this.dueDate, updateInvoiceRequest.dueDate) &&
        Objects.equals(this.purchaseOrderRef, updateInvoiceRequest.purchaseOrderRef) &&
        Objects.equals(this.lineItems, updateInvoiceRequest.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueDate, purchaseOrderRef, lineItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvoiceRequest {\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    purchaseOrderRef: ").append(toIndentedString(purchaseOrderRef)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

