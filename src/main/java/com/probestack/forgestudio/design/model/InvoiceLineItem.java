package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InvoiceLineItem
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T08:34:39.853488103Z[GMT]")public class InvoiceLineItem {

  private String description;

  private Integer quantity;

  private Double unitPrice;

  private Double taxRatePercent;

  public InvoiceLineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InvoiceLineItem(String description, Integer quantity, Double unitPrice) {
    this.description = description;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public InvoiceLineItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull   @Schema(name = "description", example = "Platform subscription - August 2026", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceLineItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * minimum: 1
   * @return quantity
  */
  @NotNull @Min(1)   @Schema(name = "quantity", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InvoiceLineItem unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  */
  @NotNull   @Schema(name = "unitPrice", example = "100.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unitPrice")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public InvoiceLineItem taxRatePercent(Double taxRatePercent) {
    this.taxRatePercent = taxRatePercent;
    return this;
  }

  /**
   * Get taxRatePercent
   * @return taxRatePercent
  */
    @Schema(name = "taxRatePercent", example = "18.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxRatePercent")
  public Double getTaxRatePercent() {
    return taxRatePercent;
  }

  public void setTaxRatePercent(Double taxRatePercent) {
    this.taxRatePercent = taxRatePercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLineItem invoiceLineItem = (InvoiceLineItem) o;
    return Objects.equals(this.description, invoiceLineItem.description) &&
        Objects.equals(this.quantity, invoiceLineItem.quantity) &&
        Objects.equals(this.unitPrice, invoiceLineItem.unitPrice) &&
        Objects.equals(this.taxRatePercent, invoiceLineItem.taxRatePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, quantity, unitPrice, taxRatePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLineItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    taxRatePercent: ").append(toIndentedString(taxRatePercent)).append("\n");
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

