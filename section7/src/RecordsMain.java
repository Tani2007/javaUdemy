public class RecordsMain {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            RecodsVsPOJO myRec = new RecodsVsPOJO("12"+i,
                    switch (i){
                        case 1 -> "Tanishq";
                        case 2 -> "Ted";
                        case 3 -> "Tracy";
                        case 4 -> "Marshal";
                        case 5 -> "Barney";
                        default -> "Anonymous";
                    },
                    "09/03/2007","Java MatserClass");
            System.out.println(myRec);
        }
        Student s = new Student("123","tanishq","45345","54353453");
        RecodsVsPOJO recStudent = new RecodsVsPOJO("157","coder","435345","fhfgh");
        System.out.println(s);
        System.out.println(recStudent);
        System.out.println(s.getName());//!while using pojo you have to use get Name to get name but in Records you just have to write s.name() like this and you will get your name from that class.
        System.out.println(recStudent.name());//!No need to write getName() just write name();
        s.setName("tSaxena");//!you can not setData in records as they are immutable.
        System.out.println(s.getName());
    }
}
