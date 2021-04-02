package com.aim.algorithm.queue;

import com.aim.algorithm.sort.impl.HeapSort;
import jodd.util.MathUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MaxPriorityQueue implements Queue {
    private final HeapSort heapSort = new HeapSort();

    private Integer[] queue;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Object peek() {
        return this.size == 0 ? null : this.queue[0];
    }

    @Override
    public Object poll() {
        if (this.size == 0) {
            return null;
        }
        int result = this.queue[0];
        this.queue[0] = this.queue[--size];
        this.queue[size] = null;
        heapSort.maxHeapify(this.queue, size, 0);
        return result;
    }

    public void increase(int i, Integer value) {
        if (value < this.queue[i]) {
            throw new RuntimeException("new value is small than current value");
        }
        this.queue[i] = value;
        while(i > 0 && this.queue[(i - 1) / 2] < this.queue[i]){
            this.queue[(i - 1) / 2] = this.queue[(i - 1) / 2] ^ this.queue[i];
            this.queue[i] = this.queue[(i - 1) / 2] ^ this.queue[i];
            this.queue[(i - 1) / 2] = this.queue[(i - 1) / 2] ^ this.queue[i];
            i = (i - 1) / 2;
        }
    }

    @Override
    public boolean offer(Object value) {
        if(this.size >= this.queue.length) {
            queue = Arrays.copyOf(queue, queue.length + ((queue.length < 64) ?
                    (queue.length + 2) :
                    (queue.length >>> 1)));
        }
        this.queue[++size] = Integer.MIN_VALUE;
        increase(size, (Integer) value);
        return true;
    }
}
