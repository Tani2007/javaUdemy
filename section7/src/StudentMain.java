public class StudentMain {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            Student s = new Student("12"+i,
                    switch (i){
                case 1 -> "Tanishq";
                case 2 -> "Ted";
                case 3 -> "Tracy";
                case 4 -> "Marshal";
                case 5 -> "Barney";
                default -> "Anonymous";
                    },
                    "09/03/2007","Java MatserClass");
            System.out.println(s);//? toString() method is implicitly present here.
        }

    }
}
