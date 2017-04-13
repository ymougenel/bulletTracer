package services;

import models.Client;

/**
 * Created by yann on 13/04/17.
 */
public interface ClientServiceI {

  Client find(Long id);

  void update(Client Clients);

  boolean delete(Client Clients);
}
