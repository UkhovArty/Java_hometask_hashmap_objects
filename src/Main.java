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
        myFirstHashMap.put(3, "Nikita");
        System.out.println(myFirstHashMap.size());
        System.out.println(myFirstHashMap.get(1));
        System.out.println(myFirstHashMap.get(2));
        System.out.println(myFirstHashMap.get(3));
        System.out.println(myFirstHashMap.contains(2));
        myFirstHashMap.put(4, "ARTEM");
        myFirstHashMap.put(5, "privet");
        myFirstHashMap.put(6, "Ti");
        myFirstHashMap.put("you", "7");
        System.out.println(myFirstHashMap.size());
        System.out.println(myFirstHashMap.contains(2));
        System.out.println(myFirstHashMap.get(2));
        System.out.println(myFirstHashMap.get(5));
    }
}
