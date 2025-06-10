class Main {
    public static void main(String[] args) {
     // removed white space 
     StringBuilder sb=new StringBuilder();
      String s="amit  kumar  ";
      char ch[]=s.toCharArray();
      for(char p: ch)
      {
          if(!Character.isWhitespace(p))
          {
              sb.append(p);
          }
      }
      System.out.println(sb.toString());
      
    }
}
