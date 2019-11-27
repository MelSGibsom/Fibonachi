

package ua.Alexander.Romanov;

public class Fibonachi {

    public static void main(String[] args){
        int number0 = 1;
        int number1 = 1;
        int sum;
        System.out.print(number0+" "+number1+" ");
        for(int i = 3; i <=11; i++){
            sum =number0+number1;
            System.out.print(sum +" ");
            number0=number1;
            number1= sum;
        }
        System.out.println();
    }
}
