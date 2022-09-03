package GenericCollections.List.LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {


    //LinkedList theoritically doesnt deal with indexes, like ArrayList. But java treats it the same, where indexes is used. So unable to understand that!!
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

for(int i=0;i<=list.size()-1-i;i++){
 Integer temp=list.get(i);
 list.set(i,list.get(list.size()-1-i));
 list.set(list.size()-1-i, temp);
}

for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
}

    }
}
