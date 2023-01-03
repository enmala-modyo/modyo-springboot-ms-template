package {{ cookiecutter.group_id }}.adapters.restclient;

import {{ cookiecutter.group_id }}.application.port.out.OutputPort;

public class RestAdapter implements OutputPort {

  @Override
  public String loadGreeting(int hour) {
    String greeting;
    if (hour > 5 && hour < 12) {
      greeting = "Good Morning";
    } else if (hour < 20) {
      greeting = "Good Afternoon";
    } else {
      greeting = "Good Night";
    }
    return greeting;
  }
}
