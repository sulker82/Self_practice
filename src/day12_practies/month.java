package day12_practies;

public class month {
    public static void main(String[] args) {
    mont("ocak");
    }
    /*
    create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */

      public static void mont(String num){
          switch (num) {
              case "ocak":
              case "mart":
              case "mayis":
              case "temmuz":
              case "agustos":
              case "ekim":
              case "aralik":
                  System.out.println(num + " has 31 days");
                  break;
              case "april":
              case "haziran":
              case "eylul":
              case "kasim":
                  System.out.println(num + " has 30 days");
                  break;
              default:
                  System.out.println(num + " has 28 days");

          }
      }



}