package structural.composite;

/**
 * Created by h.elahi on 11/11/2018.
 */
public class Parent extends Person {
    public Parent(String fullName, String nationalCode) {
        super(fullName, nationalCode);
    }

    //show parent and children of parent
    @Override
    public String toString() {
       StringBuilder stringBuilder=new StringBuilder();
       stringBuilder.append("parent : ");
       stringBuilder.append(printPerson());
       childrenList.forEach(child->stringBuilder.append(child.toString()));
       return stringBuilder.toString();
    }

    @Override
    public Person addChild(Person person) {
        childrenList.add(person);
        return this;
    }

    @Override
    public Person removeChild(Person person) {
        childrenList.remove(person);
        return this;
    }
}
