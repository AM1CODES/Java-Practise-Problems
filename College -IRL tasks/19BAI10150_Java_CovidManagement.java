import java.util.*;

class Ambulance {
     String sid, sname, desg, sex;
     int salary;

     void new_staff() {
         Scanner input = new Scanner(System.in);

         System.out.print("id:-");
         sid = input.nextLine();

         System.out.print("name:-");
         sname = input.nextLine();

         System.out.print("desigination:-");
         desg = input.nextLine();

         System.out.print("sex:-");
         sex = input.nextLine();

         System.out.print("salary:-");
         salary = input.nextInt();

         input.close();
     }

     void staff_info()

     {
         System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
     }

 }

class Doctor {
    String id, name, specilist, time, qualification;
    int room;

    void new_doctor() {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        id = input.nextLine();

        System.out.print("name:-");
        name = input.nextLine();

        System.out.print("specilization:-");
        specilist = input.nextLine();

        System.out.print("time:-");
        time = input.nextLine();

        System.out.print("qualification:-");
        qualification = input.nextLine();

        System.out.print("room no.:-");
        room = input.nextInt();

        input.close();
    }

    void doctor_info() {
        System.out.println(id + "\t" + name + "  \t" + specilist + "     \t" + time + "    \t" + qualification
                + "       \t" + room);
    }
}

class Patient {
    String id, name, sex, status;
    int age;

    void new_patient() {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        id = input.nextLine();

        System.out.print("name:-");
        name = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("admit_status:-");
        status = input.nextLine();

        System.out.print("age:-");
        age = input.nextInt();

        input.close();
    }

    void patient_info() {
        System.out.println(id + "\t" + name + "     \t" + sex + "      \t" + status + "\t" + age);
    }
}

class Medicine {
    String name, comp, exp_date;
    int cost, count;

    void new_medi() {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        name = input.nextLine();

        System.out.print("comp:-");
        comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

        input.close();
    }

    void find_medi() {
        System.out.println(name + "  \t" + comp + "    \t" + exp_date + "     \t" + cost);
    }
}

class Oxygen {
    String Ventilator;
    int lab_cost;

    void new_feci() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ventilator:-");
        Ventilator = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

        input.close();
    }

    void feci_list() {
        System.out.println(Ventilator + "\t\t" + lab_cost);

    }
}

class Ventilator {
    String fec_name;

    void add_feci()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Ventilator:-");
        fec_name = input.nextLine();

        input.close();
    }

    void show_feci() {
        System.out.println(fec_name);
    }
}

public class CovidManagement {
    public static void main(String args[]) {
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        Doctor[] doctors = new Doctor[25];

        Patient[] patients = new Patient[100];

        Oxygen[] oxygens = new Oxygen[20];

        Ventilator[] ventilators = new Ventilator[20];

        Medicine[] medicines = new Medicine[100];

        Ambulance[] ambulances = new Ambulance[100];

        int i;

        for (i = 0; i < 25; i++)
            doctors[i] = new Doctor();

        for (i = 0; i < 100; i++)
        patients[i] = new Patient();

        for (i = 0; i < 20; i++)
        oxygens[i] = new Oxygen();

        for (i = 0; i < 20; i++)
        ventilators[i] = new Ventilator();

        for (i = 0; i < 100; i++)
        medicines[i] = new Medicine();

        for (i = 0; i < 100; i++)
        ambulances[i] = new Ambulance();

        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

        while (status == 1)

        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Ambulance ");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice)

            {

            case 1:

            {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                      **DOCTOR SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                s1 = 1;

                while (s1 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Doctors List");
                    c1 = input.nextInt();
                    switch (c1)

                    {
                    case 1: {
                        doctors[count1].new_doctor();
                        count1++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count1; j++) {
                            doctors[j].doctor_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s1 = input.nextInt();
                }
                break;
            }

            case 2:

            {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     **PATIENT SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                s2 = 1;

                while (s2 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Patients List");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        patients[count2].new_patient();
                        count2++;
                        break;
                    }

                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count2; j++) {
                            patients[j].patient_info();
                        }
                        break;
                    }
                    }

                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s2 = input.nextInt();
                }
                break;
            }

            case 3: {
                s3 = 1;

                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     **MEDICINE SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                while (s3 == 1) {
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    c1 = input.nextInt();

                    switch (c1) {

                    case 1: {
                        medicines[count3].new_medi();
                        count3++;
                        break;
                    }

                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count3; j++) {
                            medicines[j].find_medi();
                        }
                        break;
                    }

                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
            }

            case 4:

            {
                s4 = 1;

                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                    **LABORATORY SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                while (s4 == 1)

                {
                    System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                    c1 = input.nextInt();

                    switch (c1)

                    {
                    case 1: {
                        l[count4].new_feci();
                        count4++;
                        break;
                    }

                    case 2:

                    {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("Fecilities\t\t Cost");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count4; j++) {
                            l[j].feci_list();
                        }
                        break;
                    }
                    }

                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            case 5:

            {
                s5 = 1;

                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("          **HOSPITAL FACILITY SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                while (s5 == 1)

                {
                    System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                    c1 = input.nextInt();

                    switch (c1)

                    {
                    case 1: {
                        f[count5].add_feci();
                        count5++;
                        break;
                    }

                    case 2: {

                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("Hospital  Facility are:");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count5; j++) {
                            f[j].show_feci();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s5 = input.nextInt();
                }
                break;
            }

            case 6:

            {
                s6 = 1;

                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                       **STAFF SECTION**");
                System.out.println("--------------------------------------------------------------------------------");

                while (s6 == 1)

                {
                    String a = "nurse", b = "worker", c = "security";
                    System.out.println(
                            "1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                    c1 = input.nextInt();

                    switch (c1)

                    {
                    case 1: {
                        s[count6].new_staff();
                        count6++;
                        break;
                    }

                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count6; j++) {
                            if (a.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }

                    case 3: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count6; j++) {
                            if (b.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }
                    case 4: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Gender \t Salary");
                        System.out.println(
                                "--------------------------------------------------------------------------------");

                        for (j = 0; j < count6; j++) {
                            if (c.equals(s[j].desg))
                                s[j].staff_info();
                        }
                        break;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s6 = input.nextInt();
                }
                break;
            }
            default: {
                System.out.println(" You Have Enter Wrong Choice!!!");
            }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();
        }
    }
}