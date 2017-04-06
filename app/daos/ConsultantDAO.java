package daos;

import models.Consultant;

public class ConsultantDAO extends GenericDAO<Consultant> {


  public Consultant find(Long id) {
    return super.find(id,Consultant.class);
  }

}
