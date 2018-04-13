package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARROS
 * @generated
 */
@Entity
@Table(name = "\"CARROS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Carros")
public class Carros implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "placa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String placa;

  /**
  * @generated
  */
  @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String marca;

  /**
  * @generated
  */
  @Column(name = "modelo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String modelo;

  /**
  * @generated
  */
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer ano;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Carros(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Carros setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém placa
   * return placa
   * @generated
   */
  
  public java.lang.String getPlaca(){
    return this.placa;
  }

  /**
   * Define placa
   * @param placa placa
   * @generated
   */
  public Carros setPlaca(java.lang.String placa){
    this.placa = placa;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public java.lang.String getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public Carros setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }

  /**
   * Obtém modelo
   * return modelo
   * @generated
   */
  
  public java.lang.String getModelo(){
    return this.modelo;
  }

  /**
   * Define modelo
   * @param modelo modelo
   * @generated
   */
  public Carros setModelo(java.lang.String modelo){
    this.modelo = modelo;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.Integer getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Carros setAno(java.lang.Integer ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Carros setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Carros object = (Carros)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
