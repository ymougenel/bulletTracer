package daos;

import models.Client;

/**
 * Created by yann on 13/04/17.
 */
public class ClientDAO extends GenericDAO<Client> {

  public Client find(Long id) {
    return super.find(id, Client.class);
  }
}
