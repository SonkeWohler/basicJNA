package sonki.jna;

import com.sun.jna.Native;
import com.sun.jna.Library;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World of C calls");
    CInterface lib = Native.load("c", CInterface.class);
    double result = lib.cosh(0);
    System.out.println("hyper cosine of 0 is " + result);
  }
}
