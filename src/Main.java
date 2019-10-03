public class Main {
    public static void main(String[] args) {
        HashMap myFirstHashMap = new HashMap(100);
        Map map = new Map(3, "petr");
        myFirstHashMap.put(map);
        System.out.println(myFirstHashMap.get(3).getKey());
    }
}
