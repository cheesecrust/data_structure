package com.maru;

import org.jetbrains.annotations.Nullable;

public class HashSet {

    private final Object[] set;
    private final boolean inNull;
    private final int size;

    public HashSet(int size) {
        this.set = new Object[size];
        this.inNull = false;
        this.size = size;
    }

    public boolean add(@Nullable Object item) {
        if (item == null){
            return false;
        }

        if (contain(item)){
            return false;
        }

        for (int i = 0; i < size; i++){
            if (set[i] == null){
                set[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean contain(@Nullable Object item) {
        if (item == null){
            return false;
        }

        for (int i = 0; i < size; i++){
            if (set[i] == item){
                return true;
            }
        }
        return false;
    }

    public boolean remove(@Nullable Object item) {
        if (item == null){
            return false;
        }

        if (!contain(item)){
            return false;
        }

        for (int i = 0; i < size; i++){
            if (set[i] == item){
                set[i] = null;
                return true;
            }
        }
        return false;
    }
}
