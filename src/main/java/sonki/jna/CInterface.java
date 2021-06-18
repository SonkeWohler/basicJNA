package sonki.jna;

import com.sun.jna.Library;

public interface CInterface extends Library {
  double cosh(double value);
}
