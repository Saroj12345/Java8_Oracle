import java.util.Arrays;
import java.util.Scanner;

public class ChefProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfDays  = scanner.nextInt();
        String[] ingredinets = new String[numberOfDays];
        for(int i=0;i<numberOfDays;i++) {
            String ingredient = scanner.next();
            ingredinets[i]=ingredient;
        }

        int[] array= chefCanCookOrNot(ingredinets);
        for(int element : array) {
            System.out.print(element);
        }
        //Arrays.asList(array).stream().forEach(i -> System.out.print(i));
    }

    private static int[] chefCanCookOrNot(String[] ingredinets) {

        int countForFiber=0;
        int countForFat=0;
        int countForCarb=0;
        int i=0;
        int[] intArray = new int[ingredinets.length];

        for(String ingredient : ingredinets) {

            if(ingredient.toUpperCase().startsWith("FIBER")) {
                countForFiber++;
            }
            else if(ingredient.toUpperCase().startsWith("FAT")) {
              countForFat++;
            }
            else if(ingredient.toUpperCase().startsWith("CARB")) {
              countForCarb++;
            }
            if(countForFiber==3 || countForFat==3 || countForCarb==3) {
                intArray[i]=1;
                countForFiber=0;
                countForFat=0;
                countForCarb=0;
            }
             else if(countForFiber==2) {
                 if(countForFat==1 || countForCarb==1) {
                     intArray[i]=1;
                     countForFiber=0;
                     countForFat=0;
                     countForCarb=0;
                 }
            }
            else if(countForFat==2) {
                if(countForFiber==1 || countForCarb==1) {
                    intArray[i]=1;
                    countForFiber=0;
                    countForFat=0;
                    countForCarb=0;
                }
            }
            else if(countForCarb==2) {
                if(countForFiber==1 || countForFat==1) {
                    intArray[i]=1;
                    countForFiber=0;
                    countForFat=0;
                    countForCarb=0;
                }
            }
            else {
                intArray[i]=0;
            }
            i++;
        }

        return intArray;
    }


}
