package io.telcos.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.telcos.mx.client.model.DomicilioRespuesta;
import io.telcos.mx.client.model.PersonaRespuesta;
import io.telcos.mx.client.model.Servicios;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("observacion")
  private String observacion = null;
  @SerializedName("persona")
  private PersonaRespuesta persona = null;
  @SerializedName("domicilios")
  private List<DomicilioRespuesta> domicilios = null;
  @SerializedName("servicios")
  private Servicios servicios = null;
  public Respuesta folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "123431", value = "Folio de la consulta proporcionado por el otorgante")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "386636538", value = "Folio de la consulta proporcionado por círculo de crédito")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Respuesta observacion(String observacion) {
    this.observacion = observacion;
    return this;
  }
   
  @ApiModelProperty(example = "El expediente no cuenta con servicios de telecomunicaciones registrados.", value = "Descripción sobre la respuesta del servicio")
  public String getObservacion() {
    return observacion;
  }
  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }
  public Respuesta persona(PersonaRespuesta persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public PersonaRespuesta getPersona() {
    return persona;
  }
  public void setPersona(PersonaRespuesta persona) {
    this.persona = persona;
  }
  public Respuesta domicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
    return this;
  }
  public Respuesta addDomiciliosItem(DomicilioRespuesta domiciliosItem) {
    if (this.domicilios == null) {
      this.domicilios = new ArrayList<DomicilioRespuesta>();
    }
    this.domicilios.add(domiciliosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<DomicilioRespuesta> getDomicilios() {
    return domicilios;
  }
  public void setDomicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
  }
  public Respuesta servicios(Servicios servicios) {
    this.servicios = servicios;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Servicios getServicios() {
    return servicios;
  }
  public void setServicios(Servicios servicios) {
    this.servicios = servicios;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioOtorgante, respuesta.folioOtorgante) &&
        Objects.equals(this.folioConsulta, respuesta.folioConsulta) &&
        Objects.equals(this.observacion, respuesta.observacion) &&
        Objects.equals(this.persona, respuesta.persona) &&
        Objects.equals(this.domicilios, respuesta.domicilios) &&
        Objects.equals(this.servicios, respuesta.servicios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, folioConsulta, observacion, persona, domicilios, servicios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    observacion: ").append(toIndentedString(observacion)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
    sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
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
