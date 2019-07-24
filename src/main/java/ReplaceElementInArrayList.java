
import java.util.Scanner;
import java.util.ArrayList;
//code accesses and prints all the elements of array list
public class ReplaceElementInArrayList {
    public static void main(String[] args){
        ArrayList<String> myArrList = new ArrayList<String>();
            myArrList.add("One");
            myArrList.add("Two");
            myArrList.add("Three");
            myArrList.set(1, "One and Half");
            for (String elememt : myArrList)
                System.out.println(elememt);

    }
}

