public class Main
{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        University u1 = new University();
        University u2 = new University();

        s1.name = "Melvin";
        s1.age = 18;
        s1.mark = 8.7f;

        s2.name = "Ryder";
        s2.age = 20;
        s2.mark = 9.5f;

        s3.name = "Lakisha";
        s3.age = 23;
        s3.mark = 7.2f;

        s4.name = "Carl";
        s4.age = 27;
        s4.mark = 9.0f;

        s5.name = "Dustin";
        s5.age = 24;
        s5.mark = 6.3f;

        s6.name = "Mary";
        s6.age = 21;
        s6.mark = 8.2f;

        Student [] utmstudents = {s1 , s2, s3};

        Student [] usmstudents = {s4 , s5, s6};

        University [] universities = {u1 , u2};

        u1.nume = "UTM";
        u1.year = 1950;
        u1.students = utmstudents;

        u2.nume = "USM";
        u2.year = 1800;
        u2.students = usmstudents;

        //System.out.println(students[0].name + "\n" + students[1].name);
        //System.out.println(u1.students[0].name + "\n" + u1.universities[1].name);

        System.out.println("Please see the UTM students list below:");

        for(int i = 0; i < u1.students.length; i++){
            System.out.println(u1.students[i].name + " Age:" + u1.students[i].age + " Mark:" + u1.students[i].mark);
        }

        System.out.println("\n" + "Please see the USM students list below:");

        for(int i = 0; i < u2.students.length; i++){
            System.out.println(u2.students[i].name + " Age:" + u2.students[i].age + " Mark:" + u2.students[i].mark);
        }
    }
}