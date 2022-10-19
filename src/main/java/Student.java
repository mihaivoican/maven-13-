import lombok.*;        //a fost importata, vezi la dependencies in Pom.xml
//mai jos, cu @ sunt adnotari de la Lombok
@Getter         //genereaza gettere
@NoArgsConstructor      //genereaza constructor
@AllArgsConstructor         //genereaza alt constr cu toate argumentele
@ToString           //metoda tostring
@Builder            //pt a construi mai usor a instantia obiecte cu mai multi sau mai putine field-uri din cele din cls
@EqualsAndHashCode
@MyFirstAnnotation(flag = false)            //o adnotare proprie,pe cls vezi fisier cu acelasi nume
public class Student {
    @MyFirstAnnotation          //adnotare pe field
    private String name;
    private int age;
    private String schoolName;
    private int maxGrade;
    private int newField;

    @MyFirstAnnotation          //adnotare metoda
    public void doSomething() {

    }
}
