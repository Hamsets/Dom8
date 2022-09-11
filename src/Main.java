import java.util.*;


public class Main {
    public static void main(String[] args) {
    enum Gender {MALE, FEMALE}
        System.out.println("Primer raboty s LinkedList");
        Person person1 = new Person("Ignat","Vasilyev", Gender.MALE.toString());
        Person person2 = new Person("Iren","Grobovskaya", Gender.FEMALE.toString());
        Person person3 = new Person("Itshak","Izrailevich", Gender.MALE.toString());
        Person person4 = new Person("Aglaya","Zavraznaya", Gender.FEMALE.toString());
        Person person5 = new Person("Olga","Nagrudskaya", Gender.FEMALE.toString());
        LinkedList<Person> listPer = new LinkedList<>();
        listPer.add(person1);
        listPer.add(person2);
        listPer.add(person3);
        listPer.add(person4);
        listPer.add(person5);
        for (Person person : listPer) {
            System.out.print(person.toString() + " hashCode: " + person.hashCode() + "\n");
        }
        System.out.println("Size of LinkedList: " + listPer.size());
        System.out.println("____________________________________________________");

        System.out.println("Primer raboty s Set (HashSet)");
        Person person6 = new Person("Izmira","Povtornaya", Gender.FEMALE.toString());
        Person person7 = new Person("Priscilla","Srednevekovaya", Gender.FEMALE.toString());
        Person person8 = new Person("Ashot","Armeni", Gender.MALE.toString());
        Person person9 = new Person("Ashot","Armeni", Gender.MALE.toString());
        Person person10 = new Person("Izmira","Povtornaya", Gender.FEMALE.toString());
        Set<Person> setPer = new HashSet<>();
        setPer.add(person6);
        setPer.add(person7);
        setPer.add(person8);
        setPer.add(person9);
        setPer.add(person10);
        for (Person person : setPer) {
            System.out.print(person.toString() + " hashCode: " + person.hashCode() + "\n");
        }
        System.out.println("Size of Set: " + setPer.size());
        System.out.println("____________________________________________________");

        System.out.println("Primer raboty s Map (HashSet)");
        Map<Integer,Person> mapPer = new HashMap<>();
        Person person11 = new Person("Proton","Prostoy", Gender.MALE.toString());
        Person person12 = new Person("Vasilisa","Premudraya", Gender.FEMALE.toString());
        Person person13 = new Person("Dazdraperma","Sovetskaya", Gender.FEMALE.toString());
        Person person14 = new Person("Kong","King", Gender.MALE.toString());
        Person person15 = new Person("Roman","Aminaev", Gender.MALE.toString());
        mapPer.put(11, person11);
        mapPer.put(12, person12);
        mapPer.put(13, person13);
        mapPer.put(14, person14);
        mapPer.put(15, person15);
        //String.valueOf(person15.hashCode())
        for (int i = 11; i < 16; i++) {
            System.out.println(mapPer.get(i).toString());
        }
        System.out.println("Size of Map: " + mapPer.size());
    }
}