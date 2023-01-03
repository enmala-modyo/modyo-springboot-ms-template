package {{ cookiecutter.group_id }}.application.port.out;

public interface OutputPort {

  String loadGreeting(int hour);
}
