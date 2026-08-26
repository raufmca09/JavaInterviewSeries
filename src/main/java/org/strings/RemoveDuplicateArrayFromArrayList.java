import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayFromArrayList {

    public static void main(String args[]){

        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,6,7,8,8,9,10,11,10));

        System.out.println("given Array -> " + nums);
        //1. Using Linked List

        LinkedHashSet<Integer> llnums = new LinkedHashSet<Integer>(nums);

        System.out.println("After removing duplicates using linkedHashset - > " + llnums);

        //2. Compare to Array list and findout missing letter

        ArrayList<String> ls1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        ArrayList<String> ls2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

        ls2.removeAll(ls1);

        System.out.println(ls2);

    }
}
