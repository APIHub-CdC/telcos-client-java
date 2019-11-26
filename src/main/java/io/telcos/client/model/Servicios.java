package io.telcos.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.telcos.client.model.TelefoniaCelular;
import io.telcos.client.model.TelefoniaLocalDistancia;
import io.telcos.client.model.TelevisionPaga;

public class Servicios {
  @SerializedName("telefoniaCelular")
  private TelefoniaCelular telefoniaCelular = null;
  @SerializedName("televisionPaga")
  private TelevisionPaga televisionPaga = null;
  @SerializedName("telefoniaLocalDistancia")
  private TelefoniaLocalDistancia telefoniaLocalDistancia = null;
  public Servicios telefoniaCelular(TelefoniaCelular telefoniaCelular) {
    this.telefoniaCelular = telefoniaCelular;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelefoniaCelular getTelefoniaCelular() {
    return telefoniaCelular;
  }
  public void setTelefoniaCelular(TelefoniaCelular telefoniaCelular) {
    this.telefoniaCelular = telefoniaCelular;
  }
  public Servicios televisionPaga(TelevisionPaga televisionPaga) {
    this.televisionPaga = televisionPaga;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelevisionPaga getTelevisionPaga() {
    return televisionPaga;
  }
  public void setTelevisionPaga(TelevisionPaga televisionPaga) {
    this.televisionPaga = televisionPaga;
  }
  public Servicios telefoniaLocalDistancia(TelefoniaLocalDistancia telefoniaLocalDistancia) {
    this.telefoniaLocalDistancia = telefoniaLocalDistancia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public TelefoniaLocalDistancia getTelefoniaLocalDistancia() {
    return telefoniaLocalDistancia;
  }
  public void setTelefoniaLocalDistancia(TelefoniaLocalDistancia telefoniaLocalDistancia) {
    this.telefoniaLocalDistancia = telefoniaLocalDistancia;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicios servicios = (Servicios) o;
    return Objects.equals(this.telefoniaCelular, servicios.telefoniaCelular) &&
        Objects.equals(this.televisionPaga, servicios.televisionPaga) &&
        Objects.equals(this.telefoniaLocalDistancia, servicios.telefoniaLocalDistancia);
  }
  @Override
  public int hashCode() {
    return Objects.hash(telefoniaCelular, televisionPaga, telefoniaLocalDistancia);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicios {\n");
    
    sb.append("    telefoniaCelular: ").append(toIndentedString(telefoniaCelular)).append("\n");
    sb.append("    televisionPaga: ").append(toIndentedString(televisionPaga)).append("\n");
    sb.append("    telefoniaLocalDistancia: ").append(toIndentedString(telefoniaLocalDistancia)).append("\n");
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
