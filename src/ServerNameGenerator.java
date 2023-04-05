public class ServerNameGenerator {


    static String[] adjectives = {"slow","flying","fast","red","black","Yellow","blue","green","racing","hot"};
    static String[] nouns = {"cat","car","aardvark","pillow","cup","canine","jellyfish","planetoid","student","chef"};

    static String returnElement(String[] incomingArr) {

        int rand= (int)(Math.random() * 9);
        System.out.println(rand);

        return incomingArr[rand];
    };
    public static void main(String[] args) {
        System.out.printf("%s-%s", returnElement(adjectives), returnElement(nouns));


    }
}
