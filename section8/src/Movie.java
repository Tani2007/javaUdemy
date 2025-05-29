import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Movie {
    private String title;
    public Movie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();//!System.out.println(man.getClass().getSimpleName());//Movie(class name)
        System.out.println(title +" is a "+ instanceType);
    }
    public static  Movie getMovie(String type,String title){

        return switch(type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Scary Music","Suspense","something bad happens");
    }
}
class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Hillarous","funny music ","something good happens");
    }
}
