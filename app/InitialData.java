import com.avaje.ebean.Ebean;
import models.Consultant;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import play.libs.Yaml;

public class InitialData {
  public InitialData() {

    if (Ebean.find(Consultant.class).findRowCount() == 0) {
      InputStream is = this.getClass().getClassLoader().getResourceAsStream("initial-data.yml");

      //Yaml.load("initial-data.yml"); //calls Play.application() which isn't available yet
      Ebean.save((List<?>) Yaml.load("initial-data.yml"));    }
  }
}