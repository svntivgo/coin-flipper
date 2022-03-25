package co.com.sofka.coinflipper.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("coins")
public class Coin {
  @Id
  private String id;
  private LocalDate fecha;
  private Boolean ladoMoneda;

  public Coin(LocalDate fecha, Boolean ladoMoneda) {
    this.fecha = fecha;
    this.ladoMoneda = ladoMoneda;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public Boolean getLadoMoneda() {
    return ladoMoneda;
  }

  public void setLadoMoneda(Boolean ladoMoneda) {
    this.ladoMoneda = ladoMoneda;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((ladoMoneda == null) ? 0 : ladoMoneda.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Coin other = (Coin) obj;
    if (fecha == null) {
      if (other.fecha != null)
        return false;
    } else if (!fecha.equals(other.fecha))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (ladoMoneda == null) {
      if (other.ladoMoneda != null)
        return false;
    } else if (!ladoMoneda.equals(other.ladoMoneda))
      return false;
    return true;
  }
}
