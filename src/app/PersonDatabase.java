package app;


import java.util.Arrays;

class PersonDatabase {
    private int arrayLength = 1;
    private Person[] data = new Person[arrayLength];
    private int count = 0;

    void add(Person p) {
        if (count == arrayLength) {
            int dupa = arrayLength * 2;
            data = Arrays.copyOf(data, dupa);
            arrayLength = dupa;
        }
        System.out.println(arrayLength);
        data[count] = p;
        count++;
    }

    void remove(Person p) {
        int removeCounter = -1;
        for (int i = 0; i < count; i++) {
            if (data[i].equals(p)) {
                removeCounter = i;
                break;
            }
        }
        if (removeCounter != 1) {
            for (int i = removeCounter; i < count - 1; i++) {
                data[i] = data[i + 1];
            }
        }
        data[count - 1] = null;
        count--;
    }

    Person get(int index) {
        return data[index];
    }

    int size() {
        return count;
    }

    void showArray() {
        for (int i = 0; i < count; i++) {
            System.out.println("Person who is saved in the system is " + data[i].toString());
        }
    }
}
