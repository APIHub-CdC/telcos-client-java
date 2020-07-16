package io.telcos.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.telcos.mx.client.model.CatalogoMoneda;

public class Servicio {
  @SerializedName("fechaAperturaCuenta")
  private String fechaAperturaCuenta = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("claveUnidadMonetaria")
  private CatalogoMoneda claveUnidadMonetaria = null;
  @SerializedName("saldoActual")
  private Float saldoActual = null;
  @SerializedName("pagoActual")
  private String pagoActual = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  @SerializedName("fechaCierreCuenta")
  private String fechaCierreCuenta = null;
  @SerializedName("cuentaActual")
  private String cuentaActual = null;
  public Servicio fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "2015-01-20", value = "La fecha de apertura es la fecha en que el Otorgante reporta la apertura del crédito al consumidor.")
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
   
  @ApiModelProperty(example = "2018-02-28", value = "Periodo al que corresponde el crédito reportado por el otorgante.")
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
  public Servicio saldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  @ApiModelProperty(example = "14714.0", value = "Saldo del crédito.")
  public Float getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
  }
  public Servicio pagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
    return this;
  }
   
  @ApiModelProperty(example = " V", value = "Pago actual.")
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
   
  @ApiModelProperty(example = "316110890", value = "Identificador único del domicilio")
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
   
  @ApiModelProperty(example = "2016-04-29", value = "Fecha en la que se liquidó o cerró el crédito.")
  public String getFechaCierreCuenta() {
    return fechaCierreCuenta;
  }
  public void setFechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
  }
  public Servicio cuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
    return this;
  }
   
  @ApiModelProperty(example = "303139149", value = "Número de cuenta del Otorgante. Este elemento es reportado solo para las cuentas del mismo Otorgante que realiza la consulta")
  public String getCuentaActual() {
    return cuentaActual;
  }
  public void setCuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
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
        Objects.equals(this.fechaCierreCuenta, servicio.fechaCierreCuenta) &&
        Objects.equals(this.cuentaActual, servicio.cuentaActual);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaAperturaCuenta, fechaReporte, claveUnidadMonetaria, saldoActual, pagoActual, idDomicilio, fechaCierreCuenta, cuentaActual);
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
    sb.append("    cuentaActual: ").append(toIndentedString(cuentaActual)).append("\n");
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
