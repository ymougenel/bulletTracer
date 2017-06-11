import play.libs.akka.AkkaGuiceSupport;
import com.google.inject.AbstractModule;

import static jdk.nashorn.internal.objects.NativeFunction.bind;

public class MainModule extends AbstractModule implements AkkaGuiceSupport {
  @Override
  protected void configure() {
    //this is where the magic happens
    bind(InitialData.class).asEagerSingleton();
  }
}