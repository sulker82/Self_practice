package day19_practies;

public class classMates2 {
    /*
    create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
     */
    public static void main(String[] args) {


            String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Spring Boot",
                    "API", "Database", "Data Structures"};

            for (int i = 0; i < classmates.length; i++) {
                String name = classmates[i];
                String reverseName = "";

                for (int j = name.length() - 1; j >= 0; j--) {
                    reverseName += name.charAt(j);
                }

                System.out.println(reverseName);

            }
    }
}
/*
 for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

        }


 */