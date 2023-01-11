package ss10_dsa_list.bai_tap.array_list;

import java.util.Arrays;

//import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    // khởi tạo mảng ban đầu với lenght mặt định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // khởi tạo mảng với chiều dài truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal capacity: " + size);
        }
    }

    // thêm phần tử mới vào mảng
    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + index);
        } else if (size == elements.length) {
            ensureCapacity();
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    private void ensureCapacity() {
    }

    // thêm xong rồi xóa
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal capacity: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements[index];
    }


    // trả về tổng số phần tử có trong mảng
    public int size() {
        return this.size;
    }

    // kiểm tra phần tử có tồn tại trong mảng hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // trả về phần tử ở vị trí index
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Illegal capacity: " + index);
        }
        return (E) elements[index];
    }

    // thêm phần tử vào cuối mảng
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity();
        }
        elements[size] = element;
        size++;
        return true;
    }

    // sao chép mảng ra mảng mới
    public MyList<E> clone() {
        MyList<E> newArrayClone = new MyList<>();
        newArrayClone.elements = Arrays.copyOf(this.elements, this.size);
        newArrayClone.size = this.size;
        return newArrayClone;
    }

    // xóa mảng
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
