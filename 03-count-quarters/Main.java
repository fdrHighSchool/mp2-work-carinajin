class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(75));
    System.out.println(countQuarters(100));
    System.out.println(countQuarters(1278));
    System.out.println(countQuarters(125));
  }
  public static int countQuarters(int cents) {
    String one = "" + cents;
    int two = one.length();
    String b = one.substring(two - 2);
    int a = Integer.parseInt(th);
    return a / 25;
  }
}
