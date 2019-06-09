package app;

class Logic {
    void start() {
        PersonDatabase personDatabase = new PersonDatabase();
        Person person1 = new Person("Arkadiusz", "Brych", "888888");
        Person person2 = new Person("Pioter", "Nosacz", "77777");
        Person person3 = new Person("3", "Nos3", "6666");
        Person person4 = new Person("4", "Nos4", "5555");
        personDatabase.add(person1);
        personDatabase.add(person2);
        personDatabase.add(person3);
        personDatabase.add(person4);
        personDatabase.showArray();
        personDatabase.remove(person2);
        personDatabase.showArray();

        System.out.println();
    }


}
