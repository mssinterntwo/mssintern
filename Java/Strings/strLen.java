public class strLen {
   public static void main(String args[]) throws Exception {
      String str = "string";
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println("Length of the given string ::"+i);
   }
}