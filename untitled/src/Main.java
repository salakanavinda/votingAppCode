

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static final int nomi = 3;
    public static void main(String[] args){

       Scanner in = new Scanner(System.in);
        int arr[] = new int[nomi];


        List<Person> li = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        while(count<nomi){


            System.out.println("Enter your Id :");
            int id = in.nextInt();
            System.out.println("Enter your Name :");
            String name = in.next();
            System.out.println("Enter your vote :");
            int vote = in.nextInt();
            Person p = new Person();
            p.setId(id);
            p.setName(name);
            p.setVote(vote);

            if(p.getId()!=0){
               li.add(p);
               arr[count]=vote;
            }
            count++;

        }

        for(Person pp :li){

            System.out.println(pp.getName());
        }

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);

            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }

        }

        Integer ma = Collections.max(map.values());

        System.out.println("Win  : "+ ma);


       int num=7894;
       int reminder;
       int newValue=0;

       while(num>0){
           reminder=num%             10;
           newValue=newValue*10+reminder;
           num=num/10;
       }

       System.out.println(newValue);
    }
}
