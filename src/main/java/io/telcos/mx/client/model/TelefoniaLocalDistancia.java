package io.telcos.mx.client.model;

import java.util.Objects;
import io.telcos.mx.client.model.Servicio;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class TelefoniaLocalDistancia extends ArrayList<Servicio> {
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoniaLocalDistancia {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
