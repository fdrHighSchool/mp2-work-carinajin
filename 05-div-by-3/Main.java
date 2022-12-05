class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(600));
    System.out.println(divBy3(200));
    System.out.println(divBy3(3246));
    System.out.println(divBy3(15));
    System.out.println(divBy3(0));
  }
  public static boolean divBy3(int a) {
    int b = 0;
    int c = 0;
       do {
    c = a % 10;
    b += r;
    a = a / 10;
  }
  while (a > 0);
    return b % 3 == 0;
  }
} 
