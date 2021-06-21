package sonki.jna;

import com.sun.jna.Native;
import com.sun.jna.Library;
import com.sun.jna.Platform;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World of C calls");
    CInterface lib = Native.load(Platform.isWindows() ? "msvcrt" : "c", CInterface.class);
    double result = lib.cosh(0);
    System.out.println("hyper cosine of 0 is " + result);
  }
}
