public class Person {
   private String name;

   //The class should have a constructor that accepts a `String` value and sets
   //the person's name to the passed string.
    public Person(String name) {
    this.name = name;
    }
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, There " + this.name);
    }
//Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.
    public static void main(String[] args) {
//        Person jaewoo= new Person("Jaewoo");
//
//        String jaewooName2= jaewoo.name;
//        String jaewooName= jaewoo.getName();
//        System.out.println("jaewooName = " + jaewooName);
//        System.out.println("jaewooName2 = " + jaewooName2);
//
//        jaewoo.setName("Jaewoo Baek");
//        System.out.println("jaewoo.getName() = " + jaewoo.getName());
//
//        jaewoo.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}

