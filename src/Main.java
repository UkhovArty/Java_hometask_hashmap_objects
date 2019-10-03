public class Main {
    public static void main(String[] args) {
        HashMap myFirstHashMap = new HashMap(2);
        System.out.println(myFirstHashMap.size());
        myFirstHashMap.put(1, "petr");
        myFirstHashMap.put(2, "porosenok");
        System.out.println(myFirstHashMap.get(1));
        System.out.println(myFirstHashMap.get(4));
        System.out.println(myFirstHashMap.contains(2));
        myFirstHashMap.remove(1);
        System.out.println(myFirstHashMap.contains(1));
        System.out.println(myFirstHashMap.size());
        System.out.println(myFirstHashMap.contains(2));
        System.out.println(myFirstHashMap.get(1));
    }
}
