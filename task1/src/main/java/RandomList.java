

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {

    List<String> firstQuestions = new ArrayList<>();
    List<String> secondQuestions = new ArrayList<>();
    List<String> thirdQuestions = new ArrayList<>();

     public RandomList(){

    }

    public static Random rand = new Random();


    public  List ExamList(final List firstObject, final List secondObject, final List thirdObject, final int sizeOfList) {
        List<List<String>> questions = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            questions.add(new ArrayList<String>() {{
                add((String) firstObject.get(rand.nextInt(sizeOfList)));
                add((String) secondObject.get(rand.nextInt(sizeOfList)));
                add((String) thirdObject.get(rand.nextInt(sizeOfList)));
            }});
        }
        return questions;

    }



    public static List FullListRandomValues(List object, int sizeOfList, int position){
        for(int i = 0 ; i < sizeOfList; i++){
            object.add(position + rand.nextInt(sizeOfList));
        }
        return object;
    }


    public void FullListKeyboardsValues(List StringArray, String[] array){
       /* Scanner input = new Scanner (System.in);
        for(int i = 0; i < sizeOfList; i++){
            integerArray.add(input.nextInt());
        }*/
        for (String  value : array) {
            StringArray.add(value);
        }


    }

    public static void main(String[] args){
        RandomList tests = new RandomList();

        tests.FullListKeyboardsValues(tests.firstQuestions, new String[]{"1.ds43sdsadadsa", "2dskfjksdfksdfsdfsd", "3fs343sdfsd", "4fsdfsdfsd" , "fsdfsdfsd","dfssdfsdf","dsfsdfsdfsdfs"});
        tests.FullListKeyboardsValues(tests.secondQuestions, new String[]{"1.dsa4322sdsadadsa", "2dskfj43ksdfsdfsd", "3fs432232sdfsd", "4fsdfsdfsd" , "fsdf4324dfsd"});
        tests.FullListKeyboardsValues(tests.thirdQuestions, new String[]{"1.d534dasdsadadsa", "2dskfjksdfk43sdfsd", "3fsdfsdfsd", "4fsdfsdf43" , "fsdfsdfsd"});

        System.out.println("First questions: " + tests.firstQuestions);
        System.out.println("Second questions: " + tests.secondQuestions);
        System.out.println("Third questions: " + tests.thirdQuestions);
        System.out.println("Examine questions: " + tests.ExamList(tests.firstQuestions,tests.secondQuestions,tests.thirdQuestions,5));
    }
}
