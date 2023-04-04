import java.util.Arrays;

public class ArraysExercises {

    static Person[] addPerson(Person[] incomingArray, Person newPerson){

        Person[] longerArrayCopy = Arrays.copyOf(incomingArray, incomingArray.length+1);

        System.out.println(incomingArray.length);
        System.out.println(longerArrayCopy.length);
        longerArrayCopy[longerArrayCopy.length - 1] = newPerson;

        return longerArrayCopy;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person firstPerson = new Person ("jaewoo");
        Person secondPerson = new Person ("soohyun");
        Person thirdPerson = new Person ("hyeonki");

        Person[] people = {firstPerson, secondPerson, thirdPerson};

//        for (Person person : people);{
//            System.out.println(firstPerson.getName());
//        }

        Person[] longerArray = addPerson(people, new Person("test"));

                for (Person person : people);{
            System.out.println(firstPerson.getName());
        }
    }
}
