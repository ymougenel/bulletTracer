package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Abstract GenericModel
 */
@MappedSuperclass
public class GenericModel extends Model{
  @Id
  @GeneratedValue
  public Long id;
}
