package lab05;

public class StringBufferDemo {
    public static void main(String[] args) {
        String s = "Greenwich Vietnam";
        System.out.println("Original string: " + s);
        s = s.replaceAll("e","u");
        System.out.println("New string: " + s);

        StringBuffer sb = new StringBuffer("Greenwich Vietnam");
        System.out.println("Original string buffer: " + sb);
        sb.setCharAt(2,'u');
        sb.setCharAt(3, 'o');
        sb.setCharAt(12, 'a');
        System.out.println("New string buffer: " + sb);

        StringBuffer sb1 = new StringBuffer("Java Programming");
        System.out.println("Original: " + sb1);
        //append: at to the end of string buffer
        sb1.append(" Language");
        System.out.println("After append: " + sb1);
        //insert: at the specific position (index/offset) in string buffer
        sb1.insert(4,"Script");
        System.out.println("After insert: " + sb1);
        sb1 = sb1.reverse();
        System.out.println("After reverse: " + sb1);
    }
}
