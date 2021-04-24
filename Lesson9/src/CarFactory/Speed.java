package CarFactory;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Speed {
    MAXSPEED_220(220);
    int count;

    Speed(int count) {
        this.count = count;
    }
}