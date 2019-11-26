package io.telcos.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.telcos.client.model.DomicilioRespuesta;
import io.telcos.client.model.PersonaRespuesta;
import io.telcos.client.model.Servicios;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
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
  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "386636538", value = "Folio de la consulta")
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
   
  @ApiModelProperty(example = "Se encontró a la persona pero su expediente no contiene servicios de telecomunicaciones.", value = "Descripción sobre la respuesta del servicio")
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
    return Objects.equals(this.folioConsulta, respuesta.folioConsulta) &&
        Objects.equals(this.observacion, respuesta.observacion) &&
        Objects.equals(this.persona, respuesta.persona) &&
        Objects.equals(this.domicilios, respuesta.domicilios) &&
        Objects.equals(this.servicios, respuesta.servicios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioConsulta, observacion, persona, domicilios, servicios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
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
