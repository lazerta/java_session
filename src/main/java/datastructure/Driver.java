package datastructure;

public class Driver {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>(2);

        for (int i = 0; i < 10; i++){
            list.add(i);
            System.out.println(list);
            System.out.println(list.size());
        }
        int test = 0;
        test = list.get(1);
    }
}
