

import com.avaje.ebean.Ebean;
import models.Consultant;
import org.apache.commons.lang3.BooleanUtils;
import play.Application;
import play.Configuration;
import play.Logger;
import play.api.Environment;
import play.libs.Yaml;


import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.util.List;
import java.util.Map;

final class MainModule {


  /**
   * Parser Yaml.
   */
  //private final CustomYaml customYaml;

  /**
   * Constructeur.
   *
   */
  @Inject
  private MainModule(Application application) {
    //this.configuration = configuration;
    System.out.println("Exécution des tâches de démarrage de l'application");
    this.insertData();
  }

  /**
   * Insère les données du fichier YAML référencé par la propriété {@code insert.data.file}
   * si la propriété {@code insert.data.yaml} est positionnée à {@code vrai}.
   */
  private void insertData() {

    // Inserts data.
    final Boolean insert = true;//configuration.getBoolean("insert.data.yaml");

    try {
      if (BooleanUtils.isTrue(insert) && Ebean.find(Consultant.class).findRowCount() == 0) {
        //final String fixtures = configuration.getString("insert.data.file");
        final Map<String, List<Object>> yamlData = (Map<String, List<Object>>) Yaml.load("initial-data.yml");
        if (yamlData == null) {
          System.err.println("Main module: No data found");
          return;
        }
        yamlData.values().stream()
                .filter(beans -> beans != null)
                .forEach(Ebean::saveAll);
      }
    } catch (PersistenceException pe) {
      Logger.warn("Le schéma de la base n'est pas encore chargé : {}", pe.getMessage());
    }
  }
}