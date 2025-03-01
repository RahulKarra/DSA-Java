package Arrays;

public class insertingintoarray {

    public static void main(String[] args) {

        int[] array = new int[6];  //create an array of size 6
        int length = 0; //specify its length to 0

        for (int i = 0; i < 3; i++) {   //print 3 indexes
            array[length] = i;
            length++;
        }
        for (int i = 0; i <array.length; i++) {
            array[length] = 10; //starting from the 4th index insert 10 at 4th and continue rest with 0
            //System.out.println(" index " + i + " contains " + array[i]);
        }

        for (int i = 3; i >=0; i--) {       //creating a space for inserting a new element
            array[i + 1] = array[i];
        }
            array[0]=20;
        for (int i = 0; i < array.length ; i++) {
           // System.out.println(" index " + i + " contains " + array[i]);
        }
        for (int i = 4; i >=2 ; i--) {
            array[i + 1] = array[i];
        }
        array[2]=30;
        for (int i = 0; i < array.length ; i++) {
            System.out.println(" index " + i + " contains " + array[i]);
        }
        }
    }





