package CarFactory;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Speed {
    MAX_SPEED_200(220), MAX_SPEED_220(220), MAX_SPEED_250(250);
    int count;

    Speed(int count) {
        this.count = count;
    }
}