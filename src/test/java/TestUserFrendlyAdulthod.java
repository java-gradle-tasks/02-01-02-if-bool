import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TestUserFrendlyAdulthod {

   @Test
   public void test() {
      String newLine="";
      if (System.getProperty("os.name").startsWith("Windows")) {
         newLine="\r\n";
      } else {
         newLine="\n";
      }

      InputStream stdin = System.in;

      int year=21;

      String input=String.valueOf(year)+newLine;
      System.setIn(new ByteArrayInputStream(input.getBytes()));

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(byteArrayOutputStream);
      PrintStream stdout = System.out;
      System.setOut(ps);

      //MyAdulthood.main(new String[0]);
      MyAdulthood.metodus(true);

      System.setIn(stdin);
      System.setOut(stdout);

      String expected="Felnottkor meghatarozas!"+newLine;
      expected+="Adja meg hany eves:";
      expected+="On felnottkoru!"+newLine;

      String actual=byteArrayOutputStream.toString();

      System.out.println("Elvart:"+newLine+expected);
      System.out.println("Aktualis:"+newLine+actual);

      Assertions.assertEquals(expected,actual,"A  felhasznalobarat es felnott esetben a kod nem megfelelo!");

   }
}
