package lab8;

public class TestLab8 {
    public static void main(String[] args) {
        WaitList<Integer> list1 = new WaitList<>();
        System.out.println("add");
        for (int i = 0; i <= 5; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        System.out.println(list1.remove());
        System.out.println(list1.remove());
        int i = list1.remove();
        UnfairWaitList<Integer> list2 = new UnfairWaitList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        list2.moveToBack(2);
        System.out.println(list2);
        System.out.println("\nisEmpty");
        System.out.println(list1.isEmpty());


    }
}
