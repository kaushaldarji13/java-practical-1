
public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Kaushal");
        System.out.println(sb.capacity());
        sb.append(" Darji");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
    }
}
