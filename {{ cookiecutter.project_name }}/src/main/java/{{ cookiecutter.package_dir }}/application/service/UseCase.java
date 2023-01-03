package {{ cookiecutter.group_id }}.application.service;

import {{ cookiecutter.group_id }}.application.port.in.InputPort;
import {{ cookiecutter.group_id }}.application.port.out.OutputPort;
import java.time.LocalDateTime;
import java.time.ZoneId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UseCase implements InputPort {

  private final OutputPort port;

  @Override
  public String getGreeting(String name) {
    var hour = LocalDateTime.now(ZoneId.of("America/Santiago")).getHour();
    return port.loadGreeting(hour) + " " + name + "!!!";
  }
}
