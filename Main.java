import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kandybek", 17, "Man", "Kyrgyzstan", "Bishkek");
        Person person2 = new Person("Bekzat", 18, "Man", "Kyrgyzstan", "Osh");
        Person person3 = new Person("Abdyrahman", 32, "Man", "USA", "Chicago");
        Person person4 = new Person("Kanykei", 21, "Woman", "Russia", "Moscow");
        Person person5 = new Person("Aidana", 28, "woman", "USA", "Chicago");
        Person person6 = new Person();
        person6.setName("Alina");
        person6.setAge(21);
        person6.setGender("Woman");
        person6.setCountry("USA");
        person6.setCity("New York");
        Person person7 = new Person();
        person7.setName("Ainazik");
        person7.setAge(20);
        person7.setGender("Woman");
        person7.setCountry("Kyrgyzstan");
        person7.setCity("Bishkek");
        Person person8 = new Person();
        person8.setName("Zhandar");
        person8.setAge(22);
        person8.setGender("Man");
        person8.setCountry("Kyrgyzstan");
        person8.setCity("Bishkek");
        Person person9 = new Person();
        person9.setName("Zalkar");
        person9.setAge(17);
        person9.setGender("Man");
        person9.setCountry("Kyrgyzstan");
        person9.setCity("Jalal-Abad");
        Person person10 = new Person();
        person10.setName("Askar");
        person10.setAge(25);
        person10.setGender("Man");
        person10.setCountry("Russia");
        person10.setCity("Moscow");

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("The oldest person: " + getMaxAgePerson(people));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Female persons: "+Arrays.toString(getPeopleByGender(people,"woman")));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Male persons: "+Arrays.toString(getPeopleByGender(people,"man")));
    }

    public static Person getMaxAgePerson(Person[] people) {
        Person person = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > person.getAge()) {
                person = people[i];
            }
        }
        return person;
    }

    public static Person[] getPeopleByGender(Person[]people, String gender) {
        Person [] p = new Person[0];
            for (int i = 0; i < people.length ; i++) {
            if (people[i].getGender().equalsIgnoreCase(gender)) {
                p = Arrays.copyOf(p,p.length+1);
                p[p.length-1]=people[i];
            }
        }
        return p;
    }
}