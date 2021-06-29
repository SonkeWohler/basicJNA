package sonki.jna;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Library;
import com.sun.jna.Platform;

public class Main {

  public static void exampleCosh() {
    CInterface lib = Native.load(Platform.isWindows() ? "msvcrt" : "c", CInterface.class);
    double result = lib.cosh(0);
    System.out.println("hyper cosine of 0 is " + result);
  }

  private static void println(String line) {
    System.out.println(line);
  }

  public static void main(String[] args) {
    println("Hello World of C calls");

    //exampleCosh();
    
    String pathToLib = "C:\\Users\\Sonke.Wohler\\repos\\experiment\\basicJNA\\code";
    //System.setProperty("jna.library.path", pathToLib);
    //println(System.getProperty("jna.library.path"));
    
    NativeLibrary.addSearchPath("myDLL", pathToLib);
    
    MyCInterface lib = Native.loadLibrary("myDLL", MyCInterface.class);
    //println(lib.myCosh(0.0).toString());
    System.out.println(lib.myCosh(0.0));
    
  }
}
