package sonki.jna;

import com.sun.jna.Library;

public interface MyCInterface extends Library {
    double myCosh(double value);
}
