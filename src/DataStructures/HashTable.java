package DataStructures;

import java.util.Hashtable;


public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        //calculate index = key.hashCode() % capacity

        //adding item
        table.put(100,"March7");
        table.put(123,"Topaz");
        table.put(321,"Serval");
        table.put(555,"Jingliu");
        table.put(777,"Bronya");

        //printing hash table
        for (Integer key: table.keySet()) {
            System.out.println(key.hashCode() %10 + "\t"+key+"\t" + table.get(key));
            // print order -> Index Key Value
        }

        Hashtable<String,String> strTable = new Hashtable<>(10);

        //adding item
        strTable.put("100","March7");
        strTable.put("123","Topaz");
        strTable.put("321","Serval");
        strTable.put("555","Jingliu");
        strTable.put("777","Bronya");
        for (Integer key: table.keySet()) {
            System.out.println(key.hashCode() %10 + "\t"+key+"\t" + table.get(key));
            // print order -> Index Key Value
        }

    }
}
