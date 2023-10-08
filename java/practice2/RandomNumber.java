package java.practice2;

public class RandomNumber {

  public static void main(String args[]) {
    int max = 60;
    int min = 50;
    int range = max - min + 1;

    double rand = (Math.random() * range) + min;
    double rand_2 = (Math.random() * range) + min;
    
    System.out.println("\ndouble First Value: " + rand);
    System.out.println("\ndouble Second Value: " + rand_2);
    
    long longRand = Math.round(rand);
    long longRand_2 = Math.round(rand_2);

    System.out.println("\nlong First Value: " + longRand);
    System.out.println("\nlong Second Value: " + longRand_2);
    
    
    int intRand = Math.toIntExact(longRand);
    int intRand_2 = Math.toIntExact(longRand);

    System.out.println("\nint First Value: " + intRand);
    System.out.println("\nint Second Value: " + intRand_2);
    
    short shortRand = Short.parseShort(String.valueOf(intRand));
    short shortRand_2 = Short.parseShort(String.valueOf(intRand_2));

    System.out.println("\nshort First Value: " + shortRand);
    System.out.println("\nshort Second Value: " + shortRand_2);
    
    float floatRand = Float.parseFloat(String.valueOf(shortRand));
    float floatRand_2 = Float.parseFloat(String.valueOf(shortRand_2));

    System.out.println("\nfloat First Value: " + floatRand);
    System.out.println("\nfloat Second Value: " + floatRand_2);
    
    char charRand = (char) floatRand;
    char charRand_2 = (char) floatRand_2;

    System.out.println("\nchar First Value: " + charRand);
    System.out.println("\nchar Second Value: " + charRand_2);
  } 
}
