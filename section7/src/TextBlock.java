public class TextBlock {
    public static void main(String[] args) {
        //todo Text Block --> it is just a fromat of special multiline String litrals
        //todo it is simpy a String with a new representation in the source code.
        String bulletList = "Printing a bulleted List:" + "\u2022 First Bullet Point";
        String textBlock = """
                This is my Text Block String and believe me it is super good:
                        \u2022 this is my bullet point.
                """;
        System.out.println(bulletList);
        System.out.println(textBlock);//! using text block the way you write in the those block the get printed in same way.
        System.out.printf("your age is %d",18);
    }
}
