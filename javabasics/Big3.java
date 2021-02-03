public class Big3 {
  public static void main(String[] args) {
    int n1 = 4, n2 = 12, n3 = 8;
    int biggest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
    System.out.println("biggest number: " + biggest);
  }
}

