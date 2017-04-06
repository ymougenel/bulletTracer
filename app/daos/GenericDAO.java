package daos;

import com.avaje.ebean.Ebean;
import models.GenericModel;

/**
 * GenericDAO
 */
public class GenericDAO<T extends GenericModel> {

  public <S extends T> S save(S entity) {
    Ebean.save(entity);
    return entity;
  }

  public <S extends T> boolean delete(S entity) {
    return Ebean.delete(entity);
  }

  public <S extends T> S find(Long id, Class<S> clazz) {
    return Ebean.find(clazz, id);
  }
}
