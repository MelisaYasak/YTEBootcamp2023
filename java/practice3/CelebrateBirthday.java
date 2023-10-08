package java.practice3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CelebrateBirthday {
  
  public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Doğum Günü Tebrik Programı -----\n");
        System.out.print("Please enter your birthday (YYYY-MM-DD SS:DD): ");
        String birthdayString = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime birthDay = LocalDateTime.parse(birthdayString, formatter);

        if(birthDay.getMonthValue() == LocalDateTime.now().getMonthValue() && birthDay.getDayOfMonth() == LocalDateTime.now().getDayOfMonth()){
          System.out.println("Bugün Doğum Gününüz. Kutlu Olsun!");
        }else{
          long days = LocalDateTime.now().until(birthDay, ChronoUnit.DAYS);
          long hour = LocalDateTime.now().until(birthDay, ChronoUnit.HOURS);
          System.out.println(" Doğum Gününüze "+ days+" gün veya "+ hour+ " saat kaldı.");

        }

  }
}
