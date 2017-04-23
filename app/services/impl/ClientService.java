package services.impl;

import models.Client;
import services.ClientServiceI;

import javax.inject.Inject;

/**
 * Created by yann on 13/04/17.
 */
public class ClientService implements ClientServiceI {

  @Inject
  private daos.ClientDAO ClientDAO;

  @Override
  public Client find(Long id) {
    return ClientDAO.find(id);
  }

  @Override
  public void update(Client Client) {
    ClientDAO.update(Client);
  }

  @Override
  public boolean delete(Client Client) {
    return ClientDAO.delete(Client);
  }

}
