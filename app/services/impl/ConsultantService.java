package services.impl;

import daos.ConsultantDAO;
import models.Consultant;
import services.ConsultantServiceI;

import javax.inject.Inject;

/**
 * Created by yann on 13/04/17.
 */
//TODO implements Interface method
public class ConsultantService implements ConsultantServiceI{

  @Inject
  private ConsultantDAO consultantDAO;

  @Override
  public Consultant find(Long id) {
    return consultantDAO.find(id);
  }

  @Override
  public void update(Consultant consultant) {
    consultantDAO.update(consultant);
  }

  @Override
  public boolean delete(Consultant consultant) {
    return consultantDAO.delete(consultant);
  }
}
