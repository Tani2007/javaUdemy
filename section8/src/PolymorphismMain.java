import java.util.Scanner;

public class PolymorphismMain {
    public static void main(String[] args) {
        Movie finalDestiny = new Adventure("final destination");
        finalDestiny.watchMovie();
        Movie ted = new Comedy("TED");
        ted.watchMovie();
//        Movie theMovie = Movie.getMovie("adventure","Godzillaa");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("enter qQ to exit");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            String title = s.nextLine();
            Movie theMovie = Movie.getMovie(type,title);
            theMovie.watchMovie();
        }
    }
}
