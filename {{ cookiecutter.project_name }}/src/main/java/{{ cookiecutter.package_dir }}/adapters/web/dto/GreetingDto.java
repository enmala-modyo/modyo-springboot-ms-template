package {{ cookiecutter.group_id }}.adapters.web.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GreetingDto extends Dto {

  private String message;

}
