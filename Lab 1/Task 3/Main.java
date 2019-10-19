public class Main
{
    public static void main(String[] args) {

        float s = 0;
        float n = 0;
        float g = 0;
        float m = 0;

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();
        Student s8 = new Student();
        Student s9 = new Student();

        University u1 = new University();
        University u2 = new University();
        University u3 = new University();

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

        s7.name = "Denis";
        s7.age = 22;
        s7.mark = 7.8f;

        s8.name = "Dima";
        s8.age = 26;
        s8.mark = 8.2f;

        s9.name = "Marcel";
        s9.age = 19;
        s9.mark = 8.8f;

        Student [] utmstudents = {s1 , s2, s3};

        Student [] usmstudents = {s4 , s5, s6};

        Student [] ulimstudents = {s7 , s8, s9};

        University [] universities = {u1 , u2, u3};

        u1.nume = "UTM";
        u1.year = 1950;
        u1.students = utmstudents;

        u2.nume = "USM";
        u2.year = 1800;
        u2.students = usmstudents;

        u3.nume = "ULIM";
        u3.year = 1856;
        u3.students = ulimstudents;

        for(int i = 0; i < u1.students.length; i++){

            s += u1.students[i].mark;

            n = u1.students.length;

        }

        n = u1.students.length;

        s = s / n;

        System.out.format("Average mark for UTM is : " + "%.2f%n", s);

        for(int i = 0; i < u2.students.length; i++){

            g += u2.students[i].mark;

            n = u2.students.length;

        }

        n = u2.students.length;

        g = g / n;

        System.out.format("Average mark for USM is : " + "%.2f%n", g);

        for(int i = 0; i < u3.students.length; i++){

            m += u3.students[i].mark;

            n = u3.students.length;

        }

        n = u3.students.length;

        m = m / n;

        System.out.format("Average mark for ULIM is : " + "%.2f%n", m);

    }
}

