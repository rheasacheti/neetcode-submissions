class DynamicArray {
    int capacity;
    int size; 
    int[] arr;
    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity) {
            resize();
        } 
        arr[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    private void resize() {
        this.capacity = 2 * getCapacity();
        int[] temp = arr;
        arr = new int[capacity];
        for(int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
