import org.joda.time.DateTime;

public class Driver {
    public static void main(String[] args) {

        DateTime sd1 = new DateTime(2021, 12, 28, 0, 0);
        DateTime sd2 = new DateTime(2022, 12, 28, 0, 0);
        DateTime sd3 = new DateTime(2023, 12, 28, 0, 0);

        DateTime ed1 = new DateTime(2022, 12, 28, 0, 0);
        DateTime ed2 = new DateTime(2023, 12, 28, 0, 0);
        DateTime ed3 = new DateTime(2024, 12, 28, 0, 0);

        Module m1 = new Module("Quantum Computing", "PH1234");
        Module m2 = new Module("Cosmology", "PH1235");
        Module m3 = new Module("Partial Differential Equations", "PH1236");
        Module m4 = new Module("Electromagnetism", "PH1237");
        Module m5 = new Module("Group Theory", "MA1234");
        Module m6 = new Module("Numerical Analysis", "MA1235");
        Module m7 = new Module("Linear Algebra", "MA1236");
        Module m8 = new Module("Complex Analysis", "MA1237");
        Module m9 = new Module("Computer Systems", "CT1234");
        Module m10 = new Module("Object Oriented Programming", "CT1235");
        Module m11 = new Module("Database Systems", "CT1236");
        Module m12 = new Module("Software Engineering", "CT1237");

        Module modules[] = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
        Module ph[] = {m1, m2, m3, m4};
        Module ma[] = {m5, m6, m7, m8};
        Module ct[] = {m9, m10, m11, m12};
        Module m_ph_ma[] = {m1, m2, m3, m4, m5, m6, m7, m8};
        Module m_ph_ct[] = {m1, m2, m3, m4, m9, m10, m11, m12};
        Module m_ma_ct[] = {m5, m6, m7, m8, m9, m10, m11, m12};

        Course c1 = new Course("Theoretical Physics", ph, sd1, ed1);
        Course c2 = new Course("Mathematics", ma, sd2, ed2);
        Course c3 = new Course("Computer Science", ct, sd3, ed3);

        Course courses[] = {c1, c2, c3};
        Course c_ph_ma[] = {c1, c2};
        Course c_ph_ct[] = {c1, c3};
        Course c_ma_ct[] = {c2, c3};

        Student s1 = new Student("GiannisAntetokounmpo", "20", "01/01/2001", 12345601, c_ph_ma, m_ph_ma);
        Student s2 = new Student("KobeBryant", "19", "02/02/2002", 12345602, c_ph_ma, m_ph_ma);
        Student s3 = new Student("HarryKane", "18", "03/03/2003", 12345603, c_ph_ma, m_ph_ma);
        Student s4 = new Student("MichaelJordan", "17", "04/04/2004", 12345604, c_ph_ma, m_ph_ma);
        Student s5 = new Student("KylianMbappé", "16", "05/05/2005", 12345604, c_ph_ct, m_ph_ct);
        Student s6 = new Student("RobertLewandowski", "15", "06/06/2006", 12345604, c_ph_ct, m_ph_ct);
        Student s7 = new Student("ZlatanIbrahimović", "14", "07/07/2007", 12345604, c_ph_ct, m_ph_ct);
        Student s8 = new Student("LionelMessi", "13", "08/08/2008", 12345604, c_ph_ct, m_ph_ct);
        Student s9 = new Student("BrianO'Driscoll", "12", "09/09/2009", 12345604, c_ma_ct, m_ma_ct);
        Student s10 = new Student("RonanO'Gara", "11", "10/10/2010", 12345604, c_ma_ct, m_ma_ct);
        Student s11 = new Student("PaulO'Connell", "10", "11/11/2011", 12345604, c_ma_ct, m_ma_ct);
        Student s12 = new Student("LeBronJames", "9", "12/12/2012", 12345604, c_ma_ct, m_ma_ct);
        Student students[] = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12};

        // Display courses with their respective modules
        for (Course c : courses) {
            System.out.println(c + " modules:");
            for (Module m : c.getModules()) {
                System.out.println(m);
            }
            System.out.println("\n");
        }

        // Display students with their respective usernames, modules and courses
        for (Student s : students) {
            System.out.println(s.getUsername() + "'s registered courses:");
            for (Course c : s.getCourses()) {
                System.out.println(c);
            }
            System.out.println("\n" + s.getUsername() + "'s assigned modules:");
            for (Module m : s.getModules()) {
                System.out.println(m);
            }
            System.out.println("\n");
        }
    }
}
