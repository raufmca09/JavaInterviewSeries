import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String args[]){

        int num[] = {1,2,2,3,4,2,1,5};

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int i : num){
            if(!unique.add(i)){
                duplicate.add(i);
            }
        }

        System.out.println("Duplicate numbers -> " + duplicate);

    }
}
