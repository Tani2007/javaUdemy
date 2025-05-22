public record RecodsVsPOJO(String id,String name ,String dateOfBirth,String classList) {
    //todo I n POJO we have to write that to string and getter and setter for each field
    //todo Record is better than POJO
    //todo Records contain data that is not meant to be altred.
    //? In toString we got output in the form of {} but in records we get utput in [].
    //?the arguments of records are known as records header.
    //?these arguments are private and final variable means you can get them but cannot update them.
}
