package services;

import models.Consultant;

/**
 * Created by yann on 13/04/17.
 */
public interface ConsultantServiceI {

  Consultant find(Long id);

  void update(Consultant Consultants);

  boolean delete(Consultant Consultants);
}
