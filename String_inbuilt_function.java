public class String_inbuilt_function {
    public static void main(String[] args) {
        String name= new String("Ramesh");
        System.out.println(name);
        int length=name.length();
        System.out.println(length);
        String lowercase=name.toLowerCase();
        System.out.println(lowercase);
        String uppercase=name.toUpperCase();
        System.out.println(uppercase);
        String strim=name.trim();
        System.out.println(strim);
        String substr=name.substring(0,3);
        System.out.println(substr);
        System.out.println(name.replace('R', 'M'));
        System.out.println(name.startsWith("Mam"));                   //still string is ramesh
        System.out.println(name.endsWith("esh"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf(name));
        System.out.println(name.indexOf("s"));
        System.out.println(name.equals("Ramesh"));
        System.out.println(name.equalsIgnoreCase("ramesh"));
    }
}
