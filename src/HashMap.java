public class HashMap {

    private Map[] table;

    public HashMap(Integer initialCapacity) {
        table = new Map[initialCapacity];
    }

    public void put(Map map) {
        Object key = map.getKey();
        for (int i = key.hashCode(); i <= table.length; i++) {
            if (table[i] == null || table[i].removeFlag) {
                table[i] = map;
                break;
            }
        }
    }

    public Map get(Object key) {
        Map tmp = new Map(key, key);
        for ( int i = hash(key); i <= table.length; i++)
            if (table[i].getKey().equals(key)) {
                tmp = table[i];
                break;
            }
        return tmp;
    }
    public boolean contains(Object key) {
        boolean flag = false;

        for (int i = hash(key); i < table.length; i++) {
            if(table[i].getKey().equals(key)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public int size() {
        return table.length;
    }
    public void remove(Object key) {
        for (int i = hash(key); i <= table.length; i++) {
            if (table[i].getKey().equals(key)) {
                table[i] = null;
                table[i].removeFlag = true;
            }
        }
    }

    private int hash(Object object) {
        return object.hashCode();
    }
}
