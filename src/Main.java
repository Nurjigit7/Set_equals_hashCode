import java.util.*;


public class Main {
    public static void main(String[] args) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 0; i < 10000; i++) {
//            hashSet.add(i);
//        }
//        Iterator<Integer> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        int cout = 0;
//        for (int i = 0; i < 400; i++) {
//            list.add(random.nextInt(0, 20));
//            cout += list.get(i);
//            System.out.print(list.get(i)+" ");
//
//        }
//        System.out.println();
//        System.out.print("ArrayList : "+cout);
//        HashSet<Integer> hashSet = new HashSet<>(list);
//        cout = 0;
//
//        Iterator<Integer> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            cout += iterator.next();
//        }
//        System.out.println();
//        System.out.println("после :"+cout);

        HashSet<Student>hashSet=new HashSet<>();
        hashSet.add(new Student(1,"Nurjigit",22));
        hashSet.add(new Student(1,"Nurjigit",22));
        hashSet.add(new Student(1,"Nurjigit",22));
        hashSet.add(new Student(1,"Nurjigit",22));
        hashSet.add(new Student(1,"Nurjigit",22));
        for (Student student : hashSet) {
            System.out.println(student);
            TreeSet<Student>students=new TreeSet<>(hashSet);
            System.out.println(students);

        }
        Set<Integer>set=new HashSet<>();

    }
}