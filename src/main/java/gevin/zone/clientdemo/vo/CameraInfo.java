package gevin.zone.clientdemo.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * @author gevin
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CameraInfo {
    String nameProject;
    String infoProject;
    String nameDevice;
    String infoDevice;
    String numsDevice;
    String passageway;
    String typeDevice;
    String accessToken;
}
