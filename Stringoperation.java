public class Stringoperation {
    public static void main(String ar[]) {
        String s = "PESCOE";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println("********");
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println("******");
        System.out.println(s.startsWith("P"));
        System.out.println(s.endsWith("e"));
        System.out.println("*******");
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        System.out.println("*******");
        System.out.println(s.length());
        System.out.println("*******");
        String s1 = "Hello Bear!!";
        String replaceString = s1.replace("Bear", "Dear");
        System.out.println(replaceString);
    }
}