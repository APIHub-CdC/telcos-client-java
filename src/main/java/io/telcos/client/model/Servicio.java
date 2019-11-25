package io.telcos.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.telcos.client.model.CatalogoMoneda;


public class Servicio {
  @SerializedName("fechaAperturaCuenta")
  private String fechaAperturaCuenta = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("claveUnidadMonetaria")
  private CatalogoMoneda claveUnidadMonetaria = null;
  @SerializedName("saldoActual")
  private String saldoActual = null;
  @SerializedName("pagoActual")
  private String pagoActual = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  @SerializedName("fechaCierreCuenta")
  private String fechaCierreCuenta = null;
  public Servicio fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "20/01/2018", value = "Fecha en que se aperturó el crédito.")
  public String getFechaAperturaCuenta() {
    return fechaAperturaCuenta;
  }
  public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
  }
  public Servicio fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  @ApiModelProperty(example = "28/02/2018", value = "Periodo al que corresponde el crédito reportado por el otorgante.")
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  public Servicio claveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoMoneda getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Servicio saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  @ApiModelProperty(example = "14714", value = "Saldo del crédito.")
  public String getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }
  public Servicio pagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Pago actual.")
  public String getPagoActual() {
    return pagoActual;
  }
  public void setPagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
  }
  public Servicio idDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "007", value = "Identificador de domicilio asociado al elemento Domicilio. Esta etiqueta solo se presenta para los productos que incluyen detalle de Domicilios.")
  public String getIdDomicilio() {
    return idDomicilio;
  }
  public void setIdDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
  }
  public Servicio fechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "01/04/2018", value = "Fecha en la que se liquidó o cerró el crédito.")
  public String getFechaCierreCuenta() {
    return fechaCierreCuenta;
  }
  public void setFechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicio servicio = (Servicio) o;
    return Objects.equals(this.fechaAperturaCuenta, servicio.fechaAperturaCuenta) &&
        Objects.equals(this.fechaReporte, servicio.fechaReporte) &&
        Objects.equals(this.claveUnidadMonetaria, servicio.claveUnidadMonetaria) &&
        Objects.equals(this.saldoActual, servicio.saldoActual) &&
        Objects.equals(this.pagoActual, servicio.pagoActual) &&
        Objects.equals(this.idDomicilio, servicio.idDomicilio) &&
        Objects.equals(this.fechaCierreCuenta, servicio.fechaCierreCuenta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaAperturaCuenta, fechaReporte, claveUnidadMonetaria, saldoActual, pagoActual, idDomicilio, fechaCierreCuenta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicio {\n");
    
    sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    pagoActual: ").append(toIndentedString(pagoActual)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
    sb.append("    fechaCierreCuenta: ").append(toIndentedString(fechaCierreCuenta)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
