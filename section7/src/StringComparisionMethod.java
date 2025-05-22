import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class StringComparisionMethod {
    public static void main(String[] args) {
        //! indent--> to remove space or add space in biginning of multiline text.
        //! strip,stripLeading,stripTrailing,trim.
        //!toLowerCase, toUpperCase.
        //! concat join repeat replace replaceAll replaceFirst substring subSequence
        String birthDate = "09/03/2007";
        int startingIndex = birthDate.indexOf("2007");
        System.out.println("Starting index of 2007 is "+startingIndex);
        System.out.println("birthYear "+birthDate.substring(startingIndex));//! give remaining staring after starting index.
        System.out.println("month is "+birthDate.substring(3,5));//!give the string from index 4 to index 5
        String today = String.join("/","22","05","2007");
        System.out.println(today);
        today = today.concat("/");//! add everything after the string
        System.out.println(today);
        String newToday = "26"+ "/" + "05" + "/" + "2005";
        System.out.println(newToday);
        System.out.println(today.replace("/","-"));
        System.out.println(today.replace("25","26"));
        System.out.println(today.replaceFirst("/","-"));
        System.out.println(today.replaceAll("/","-"));
        System.out.println("ABC\n".repeat(3));
        System.out.println("----".repeat(30));
        System.out.println("ABC\n".repeat(3).indent(10));
        System.out.println("----".repeat(30));
    }
}
