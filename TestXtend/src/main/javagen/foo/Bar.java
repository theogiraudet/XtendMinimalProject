package foo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;

@SuppressWarnings("all")
public class Bar {
  public static void main(final String... args) {
    try {
      try (final BufferedInputStream foo = new BufferedInputStream(System.in)) {
        final Procedure0 _function = () -> {
          Bar.bar(foo);
        };
        final Procedure0 bar = _function;
        bar.apply();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void bar(final BufferedInputStream bis) {
    InputStreamReader _inputStreamReader = new InputStreamReader(bis);
    System.out.println(new BufferedReader(_inputStreamReader).lines().collect(Collectors.joining("\n")));
  }
}
