package com.practice.collections.queue;

import java.util.HashMap;
//import com.google.common.collect.BiMap;
//import com.google.common.collect.HashBiMap;

public class IndexedPriorityQueue<T extends Comparable<T>> {
    //key value Map
    static HashMap<String,Integer> key_index_Map = new HashMap<>();
    //inverse key value Map
    static HashMap<Integer,String> index_key_Map = new HashMap<>();
    static HashMap<Integer,Integer> value_node_map = new HashMap<>();

    static int[] index_value_Array= new int[16];
    static int[] value_node_Array= new int[16];
    static int[] node_index_Array = new int[16];

    private class Node<T extends Comparable<T>>{
       T keyIndex;
       T value;
        public Node(T keyIndex, T value){
           this.keyIndex = keyIndex;
           this.value = value;
        }
    }

    public static void main(String[] args) {
        addUserWithIndex("Ariel",1,2);
        addUserWithIndex("briel",2,5);
        addUserWithIndex("criel",3,6);
        addUserWithIndex("driel",4,9);
        System.out.println(getKeyIndexFromNode(2));
    }

    private static void addUserWithIndex(String name, Integer keyIndex, int value) {
        key_index_Map.put(name , keyIndex);
        index_key_Map.put(keyIndex,name);
        updateMappingArrays(keyIndex,value);
    }

    private static void updateMappingArrays(Integer index, int value) {
        index_value_Array[index] = value;
        value_node_Array[value -1] = value;
        value_node_map.put(index,value -1);
        node_index_Array[index] = index;

    }
    private static int getKeyIndexFromNode(int nodeID) {
        int tmp = index_value_Array[nodeID];
        int nd = value_node_map.get(nodeID);
        int vl= node_index_Array[nodeID];
        System.out.println(index_key_Map.get(vl));
        return node_index_Array[nodeID];

    }


/*
 Googles guava API has biMap inbuilt
 */
//    private class BiMapTest {
//
//        public static void main(String[] args) {
//
//            BiMap<String, String> biMap = HashBiMap.create();
//
//            biMap.put("k1", "v1");
//            biMap.put("k2", "v2");
//
//            System.out.println("k1 = " + biMap.get("k1"));
//            System.out.println("v2 = " + biMap.inverse().get("v2"));
//        }
//    }
}
