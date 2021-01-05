import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        System.out.println(list.size());

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            Integer next = iter.next();
            System.out.println(next);
            if (next==4){
                iter.remove();
            }

        }
        System.out.print("list 的大小为：");
        System.out.println(list.size());

        Iterator<Integer> iterat = list.iterator();
        while (iterat.hasNext()){
            Integer next = iterat.next();
            System.out.print(next+" ");


        }




    }
}
