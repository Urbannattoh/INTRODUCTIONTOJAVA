public class stringbuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("kioko kyalo");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" mathew");
        System.out.println(sb);
    }
}
