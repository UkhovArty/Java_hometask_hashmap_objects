public class HashMap {

    private Map[] table;
    private double threshold = 0;
    private final double loadfactor;

    public HashMap(Integer initialCapacity) {
        table = new Map[initialCapacity];
        loadfactor = 0.75;
    }

    public HashMap() {
        table = new Map[3];
        loadfactor = 0.75;
    }

    public void put(Object key, Object value) {
        Map map = new Map(key, value);
        int i = hash(key);
        for (int j = 0; j < table.length; j++) {
            if (table[(i + j) % table.length] != null) {
                if (table[(i + j) % table.length].equals(map)) {
                    break;
                }
            }
            if (table[(i + j) % table.length] == null || table[(i + j) % table.length].removeFlag) {
                table[(i + j) % table.length] = map;
                table[(i + j) % table.length].removeFlag = false;
                threshold = threshold + 1;
                break;
            }
        }
        resize();
    }

    public Object get(Object key) {
        Object tmp = new Object();
        tmp = null;
        int i = hash(key);
        for (int j = 0; j < table.length; j++)
            if (table[(i + j) % table.length] != null) {
                if (table[(i + j) % table.length].getKey().equals(key)) {
                    tmp = table[(i + j) % table.length].getValue();
                    break;
                }
            }
        return tmp;
    }

    public boolean contains(Object key) {
        boolean flag = false;
        int i = hash(key);
        for (int j = 0; j < table.length; j++) {
            if (table[(i + j) % table.length] != null) {
                if (table[(i + j) % table.length].getKey().equals(key) && !table[(i + j) % table.length].removeFlag) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public int size() {
        return table.length;
    }

    public void remove(Object key) {
        int i = hash(key);
        for (int j = 0; j <= table.length; j++) {
            if (table[(i + j) % table.length] != null) {
                if (table[(i + j) % table.length].getKey().equals(key)) {
                    table[(i + j) % table.length].removeFlag = true;
                }
            }
        }
    }

    private int hash(Object object) {
        return Math.abs(object.hashCode() % table.length);
    }

    private void resize() {
        if (threshold / table.length >= loadfactor) {
            Map[] table1 = table;
            table = new Map[table.length * 2];
            for (Map map : table1) {
                if (map != null) {
                    put(map.getKey(), map.getValue());
                }
            }
        }
    }
}