import java.util.Comparator;
import java.util.List;

public class Filters {

    Comparator<Person> comparator= Person::compareTo;

    public void filterList(List<Person> persons){
        List<Person> shortedList=persons.stream().filter(c->c.getName().startsWith("J")).sorted(Person::compareTo).toList();
        for(Person person :shortedList){
            System.out.println("Name:"+person.getName()+"Age:"+person.getAge());
        }
    }
}
