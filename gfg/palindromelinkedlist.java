class GfG
{
    public static boolean compute(Node node)
    {
        if(node.next == null)
        return true;
        String str = "";
        while(node != null)
        {
            str = str + node.data;
            node = node.next;
        }
        // String rev = str;
        // StringBuilder input1 = new StringBuilder();
        // input1.append(str);
        // input1.reverse();
        // System.out.println(str);
        // System.out.print(input1);
        
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        
        if(str.equals(rev))
        return true;
        else
        return false;
        
        
    }
}
