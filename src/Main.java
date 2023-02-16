
//final code with scanner

//scanner
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    //final code for submission with scanner and file handling
    //for submission

    //for week 7 - 2 decimal points & comma for amount
    public static String printNumberWithCommas(double amount) {
        DecimalFormat formatter = new DecimalFormat("PHP ##,###.00");
        String formattedNumber = formatter.format(amount);
        return String.format(formattedNumber, amount);
    }

    public static void main(String[] args) {

        //array

        String employee [] = {"Crisostomo, Jose", "Mata, Christian", "San Jose, Brad",
                "Salcedo, Anthony", "Romualdez, Alice", "Atienza, Rosie", "Farala, Martha",
                "Martinez, Leila", "San Jose, Allison", "Rosario, Cydney", "Lopez, Josie",
                "De leon, Selena", "Romualdez, Fredrick", "Bautista, Mark", "Lazaro, Darlen",
                "Delos Santos, Kolby", "Santos, Vella", "Del Rosario, Tomas", "Tolentino, Jacklyn",
                "Gutierrez, Percival"};

// Title per task/s
        final String companyName = "MOTOR PH DATABASE";
        final String hoursWorked = "TOTAL HOURS WORKED";
        final String totalWeekIncome = "TOTAL WEEKLY INCOME";
        final String govDeductions = "GOVERNMENT MANDATORY DEDUCTIONS";
        String attendance = "ATTENDANCE";
        String week = "September 5-9, 2022";
        String week5task = "WEEK 5 TASK";
        String week6task = "WEEK 6 TASK";
        String week7task = "WEEK 7 TASK";
        String week8task = "WEEK 8 TASK";
        String week9task = "WEEK 9 TASK";

//   Title of database
        String idTitle = "EMPLOYEE NUMBER";
        String lastNameTitle = "LAST NAME";
        String firstNameTitle = "FIRST NAME";
        String birthDateTitle = "BIRTHDATE";
        String fullNameTitle = "FULL NAME";
        String addressTitle = "ADDRESS";
        String phoneNumberTitle = "PHONE NUMBER";
        String sssTitle = "SSS NO.";
        String philhealthTitle = "PHILHEALTH NO.";
        String tinTitle = "TIN NO.";
        String pagibigTitle = "PAG-IBIG NO.";
        String statusTitle = "STATUS";
        String positionTitle = "POSITION";
        String iSupervisorTitle = "IMMEDIATE SUPERVISOR";
        String basicSalaryTitle = "BASIC SALARY";
        String riceSubsidyTitle = "RICE SUBSIDY";
        String phoneAllowanceTitle = "PHONE ALLOWANCE";
        String clothingAllowanceTitle = "CLOTHING ALLOWANCE";
        String grossRateTitle = "GROSS SEMI-MONTHLY RATE";
        String hourlyRateTitle = "HOURLY RATE";
        String hoursWorkedTitle = "TOTAL HOURS WORKED";
        String grossIncomeTitle = "GROSS WEEKLY INCOME";
        String timeInTitle = "TIME IN";
        String timeOutTitle = "TIME OUT";
        String remarksTitle = "REMARKS";
        String dateTitle = "DATE";

//tabs shortcut
        String tabs = "\t\t\t";


//  employee 1 database
        int id = 10001;
        String lastName = "Crisostomo";
        String firstName = "Jose";
        String fullName = (lastName + "," + " " + firstName);
        String birthDate = "February 14, 1984";
        String address = "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands";
        String phoneNumber = "918-621-603";
        String sss = "49-1632020-8";
        String philhealth = "382189453145";
        String tin = "317-674-022-000";
        String pagibig = "441093369646";
        String status = "Regular";
        String position = "HR Manager";
        String iSupervisor = "None";
        double basicSalary = 62670.00;
        double riceSubsidy = 1500;
        double phoneAllowance = 1000;
        double clothingAllowance = 1000;
        double grossRate = (basicSalary / 2);
        double hourlyRate = (basicSalary / 21) / 8;
        double taxDue = 9526.34;
        double sssContri = 581.30;
        double philhealhtContri = 550;
        double pagibigContri = 100;


//  employee 2 database
        int id1 = 10002;
        String lastName1 = "Mata";
        String firstName1 = "Christian";
        String fullName1 = (lastName1 + "," + " " + firstName1);
        String birthDate1 = "October 21, 1987";
        String address1 = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ";
        String phoneNumber1 = "783-776-744";
        String sss1 = "49-2959312-6";
        String philhealth1 = "824187961962";
        String tin1 = "103-100-522-000";
        String pagibig1 = "631052853464";
        String status1 = "Regular";
        String position1 = "Account Team Leader";
        String iSupervisor1 = "Romualdez, Fredrick";
        double basicSalary1 = 42975;
        double riceSubsidy1 = 1500;
        double phoneAllowance1 = 800;
        double clothingAllowance1 = 800;
        double grossRate1 = (basicSalary1 / 2);
        double hourlyRate1 = (basicSalary1 / 21) / 8;
        double taxDue1 = 4602.59;
        double sssContri1 = 581.30;
        double philhealhtContri1 = 550;
        double pagibigContri1 = 100;

//  employee 3 database
        int id2 = 10003;
        String lastName2 = "San Jose";
        String firstName2 = "Brad";
        String fullName2 = (lastName2 + "," + " " + firstName2);
        String birthDate2 = "March 15, 1996";
        String address2 = "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi";
        String phoneNumber2 = "797-009-261";
        String sss2 = "40-2400714-1";
        String philhealth2 = "239192926939";
        String tin2 = "672-474-690-000";
        String pagibig2 = "210850209964";
        String status2 = "Regular";
        String position2 = "Account Team Leader";
        String iSupervisor2 = "Crisostomo, Jose";
        double basicSalary2 = 42975;
        double riceSubsidy2 = 1500;
        double phoneAllowance2 = 800;
        double clothingAllowance2 = 800;
        double grossRate2 = (basicSalary2 / 2);
        double hourlyRate2 = (basicSalary2 / 21) / 8;
        double taxDue2 = 4602.59;
        double sssContri2 = 581.30;
        double philhealhtContri2 = 550;
        double pagibigContri2 = 100;


//Number of working hours
        String mon = "05-Sept-2022";
        String tues = "06-Sept-2022";
        String wed = "07-Sept-2022";
        String thurs = "08-Sept-2022";
        String fri = "09-Sept-2022";

        //convert string to int (time)
        //need to convert string(time) to be able to use if, else for remarks

        String timeIn = "08:00:00";
        String[] timeComponentsIn = timeIn.split(":");
        double hoursIn = Integer.parseInt(timeComponentsIn[0]);
        double minutesIn = Integer.parseInt(timeComponentsIn[1]);
        double secondsIn = Integer.parseInt(timeComponentsIn[2]);
        double timeIntIn = (hoursIn * 3600) + (minutesIn * 60) + secondsIn;

        String timeLate = "11:30:00";
        String[] timeComponentsLate = timeLate.split(":");
        double hoursLate = Integer.parseInt(timeComponentsLate[0]);
        double minutesLate = Integer.parseInt(timeComponentsLate[1]);
        double secondsLate = Integer.parseInt(timeComponentsLate[2]);
        double timeIntLate = (hoursLate * 3600) + (minutesLate * 60) + secondsLate;

        String timeOut = "17:00:00";
        String[] timeComponentsOut = timeOut.split(":");
        double hoursOut = Integer.parseInt(timeComponentsOut[0]);
        double minutesOut = Integer.parseInt(timeComponentsOut[1]);
        double secondsOut = Integer.parseInt(timeComponentsOut[2]);
        double timeIntOut = (hoursOut * 3600) + (minutesOut * 60) + secondsOut;

//Total working hours with late deductions
        double dailyWorkingHours = (timeIntOut - timeIntIn) / 3600 - 1;
        double withLate = (timeIntLate / 3600) - dailyWorkingHours;
        double totalWHours = dailyWorkingHours * 5;
        double totalWHours1 = dailyWorkingHours * 5;
        double totalWHours2 = (dailyWorkingHours * 5) - withLate;

//10001 weekly computation
        double weeklyGrossIncome = (totalWHours * hourlyRate);
        double weeklyRiceSubsidy = (riceSubsidy / 21) * 5;
        double weeklyPhoneAllowance = (phoneAllowance / 21) * 5;
        double weeklyClothingAllowance = (clothingAllowance / 21) * 5;
        double weeklyTaxDue = (taxDue / 21) * 5;
        double weeklySssContri = (sssContri / 21) * 5;
        double weeklyPhilhealthContri = (philhealhtContri / 21) * 5;
        double weeklyPagibigContri = (pagibigContri / 21) * 5;


//10002 weekly computation
        double weeklyGrossIncome1 = (totalWHours1 * hourlyRate1);
        double weeklyRiceSubsidy1 = (riceSubsidy1 / 21) * 5;
        double weeklyPhoneAllowance1 = (phoneAllowance1 / 21) * 5;
        double weeklyClothingAllowance1 = (clothingAllowance1 / 21) * 5;
        double weeklyTaxDue1 = (taxDue1 / 21) * 5;
        double weeklySssContri1 = (sssContri1 / 21) * 5;
        double weeklyPhilhealthContri1 = (philhealhtContri1 / 21) * 5;
        double weeklyPagibigContri1 = (pagibigContri1 / 21) * 5;

//10003 weekly computation
        double weeklyGrossIncome2 = (totalWHours2 * hourlyRate2);
        double weeklyRiceSubsidy2 = (riceSubsidy2 / 21) * 5;
        double weeklyPhoneAllowance2 = (phoneAllowance2 / 21) * 5;
        double weeklyClothingAllowance2 = (clothingAllowance2 / 21) * 5;
        double weeklyTaxDue2 = (taxDue2 / 21) * 5;
        double weeklySssContri2 = (sssContri2 / 21) * 5;
        double weeklyPhilhealthContri2 = (philhealhtContri2 / 21) * 5;
        double weeklyPagibigContri2 = (pagibigContri2 / 21) * 5;

//Hourly Rate*Total Hours Worked
        double totalGrossIncome = weeklyGrossIncome + (weeklyRiceSubsidy + weeklyPhoneAllowance +
                weeklyClothingAllowance);
        double totalGrossIncome1 = weeklyGrossIncome1 + (weeklyRiceSubsidy1 + weeklyPhoneAllowance1 +
                weeklyClothingAllowance1);
        double totalGrossIncome2 = weeklyGrossIncome2 + (weeklyRiceSubsidy2 + weeklyPhoneAllowance2 +
                weeklyClothingAllowance2);

//total Deductions

        double totalWeeklyDeductions = (weeklyTaxDue + weeklySssContri + weeklyPhilhealthContri +
                weeklyPagibigContri);
        double totalWeeklyDeductions1 = (weeklyTaxDue1 + weeklySssContri1 + weeklyPhilhealthContri1 +
                weeklyPagibigContri1);
        double totalWeeklyDeductions2 = (weeklyTaxDue2 + weeklySssContri2 + weeklyPhilhealthContri2 +
                weeklyPagibigContri2);

//if, else timeInValue= 28800.0 timeOutValue = 61200.0
        String remarks = "";
        if (timeIntIn < withLate) //late
        {
            remarks = "--";
        } else {
            remarks = "Late";
        }

        String remarks1 = "";
        if (timeIntIn > withLate) //not late
        {
            remarks1 = "--";
        } else {
            remarks1 = "Late";
        }

        //net INCOME

        double weeklyNetIncome = (totalGrossIncome - totalWeeklyDeductions);
        double weeklyNetIncome1 = (totalGrossIncome1 - totalWeeklyDeductions1);
        double weeklyNetIncome2 = (totalGrossIncome2 - totalWeeklyDeductions2);

//scanner
//WEEK 8 - SALARY COMPUTATION WITH GOVERNMENT DEDUCTIONS
        Scanner input = new Scanner(System.in);

        String pass = "******";
        String admin = "admin";
        String passcode = "admin123";
        String dash = "----------------------------------------------------------------";


        System.out.println();
        System.out.println("Hello, Admin! Please login.");
        System.out.println("Enter User Name");
        String user = input.nextLine();

// looping
        int count = 0;
        while (count < 4) {
            System.out.println("Enter Password");
            String password = input.next();
            count++;

            if ((user.equals(admin)) && (password.equals(passcode))) {
                System.out.println(dash);
                System.out.println("Username: " + admin);
                System.out.println("Password: " + pass);
                System.out.println(dash);
                System.out.println("MOTORPH PAYROLL SYSTEM" + "\n" + "(1) List of Employees" + "\n"+
                        "(2) Employee's Profile" + "\n" +
                        "(3) Time Keeping" + "\n" + "(4) Salary Computation" + "\n" + "(5) Logout");
                System.out.println(dash);

                break;
            } else if (count < 4) {
                System.out.println("Incorrect password, please try again!");
            }
        }
        if (count == 4) {
            System.out.println("ACCESS DENIED. TRY AGAIN!");
            return;
        }



            int adminOption = input.nextInt();
            if (adminOption == 1) {
                System.out.println(dash);

                //file handling
                //file writer
                try {
                    BufferedWriter writer = new BufferedWriter( new FileWriter("filehandling.txt"));
                    writer.write("MotorPH List of Employees");

                    for (String name : employee) {
                        writer.write("\n" + name);
                    }
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
//file reader
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
                    String line;
                    while((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println(reader.readLine());
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
                System.out.println(dash);

            } else if (adminOption == 2) {

                System.out.println("EMPLOYEE'S PROFILE" + "\n" + "(1) " + id + "\n" + "(2) " + id1 + "\n" +
                        "(3) " + id2);
                System.out.println(dash);

                int idNoEmployeeProfile = input.nextInt();
                if (idNoEmployeeProfile == 1) {
                    System.out.println(dash);
                    System.out.println("EMPLOYEE DETAILS" + "\n" + fullNameTitle + ":" + tabs + fullName + "\n" +
                            birthDateTitle + ":" + tabs + birthDate + "\n" + addressTitle + ":" + tabs + address + "\n" +
                            phoneNumberTitle + ":" + "\t\t" + phoneNumber + "\n" + sssTitle + ":" + tabs + sss + "\n" +
                            philhealthTitle + ":" + "\t\t" + philhealth + "\n" + tinTitle + ":" + tabs + tin + "\n" +
                            pagibigTitle + ":" + "\t\t" + pagibig + "\n" + statusTitle + ":" + tabs + "\t" + status +
                            "\n" + positionTitle + ":" + tabs + position + "\n" + basicSalaryTitle + ":" + "\t\t" +
                            printNumberWithCommas(basicSalary) + "\n" + riceSubsidyTitle + ":" + "\t\t" +
                            printNumberWithCommas(riceSubsidy) + "\n" + phoneAllowanceTitle + ":" + "\t" +
                            printNumberWithCommas(phoneAllowance) + "\n" + clothingAllowanceTitle + ":" + "\t" +
                            printNumberWithCommas(clothingAllowance));
                    System.out.println(dash);
                } else if (idNoEmployeeProfile == 2) {
                    System.out.println(dash);
                    System.out.println("EMPLOYEE DETAILS" + "\n" + fullNameTitle + ":" + tabs + fullName1 + "\n" +
                            birthDateTitle + ":" + tabs + birthDate1 + "\n" + addressTitle + ":" + tabs +
                            address1 + "\n" + phoneNumberTitle + ":" + "\t\t" + phoneNumber1 + "\n" + sssTitle + ":" +
                            tabs + sss1 + "\n" + philhealthTitle + ":" + "\t\t" + philhealth1 +
                            "\n" + tinTitle + ":" + tabs + tin1 + "\n" + pagibigTitle + ":" + "\t\t" + pagibig1 +
                            "\n" + statusTitle + ":" + tabs + "\t" + status1 + "\n" + positionTitle + ":" + tabs +
                            position1 + "\n" + basicSalaryTitle + ":" + "\t\t" +
                            printNumberWithCommas(basicSalary1) + "\n" + riceSubsidyTitle + ":" + "\t\t" +
                            printNumberWithCommas(riceSubsidy1) + "\n" + phoneAllowanceTitle + ":" +
                            "\t" + printNumberWithCommas(phoneAllowance1) + "\n" + clothingAllowanceTitle + ":" + "\t" +
                            printNumberWithCommas(clothingAllowance1));
                    System.out.println(dash);
                } else if (idNoEmployeeProfile == 3) {
                    System.out.println(dash);
                    System.out.println("EMPLOYEE DETAILS" + "\n" + fullNameTitle + ":" + tabs + fullName2 +
                            "\n" + birthDateTitle + ":" + tabs + birthDate2 + "\n" + addressTitle +
                            ":" + tabs + address2 + "\n" + phoneNumberTitle + ":" + "\t\t" +
                            phoneNumber2 + "\n" + sssTitle + ":" + tabs + sss2 + "\n" + philhealthTitle +
                            ":" + "\t\t" + philhealth2 + "\n" + tinTitle + ":" + tabs + tin2 + "\n" +
                            pagibigTitle + ":" + "\t\t" + pagibig1 + "\n" + statusTitle + ":" + tabs + "\t" +
                            "\n" + basicSalaryTitle + ":" + "\t\t" + printNumberWithCommas(basicSalary2) + "\n" +
                            riceSubsidyTitle + ":" + "\t\t" + printNumberWithCommas(riceSubsidy2) + "\n" +
                            phoneAllowanceTitle + ":" + "\t" + printNumberWithCommas(phoneAllowance2) +
                            "\n" + clothingAllowanceTitle + ":" + "\t" + printNumberWithCommas(clothingAllowance2));
                    System.out.println(dash);
                }

            } else if (adminOption == 3) {
                System.out.println(dash);
                System.out.println(hoursWorked);
                System.out.println(week);
                System.out.println(dash);

                System.out.println(idTitle + tabs + lastNameTitle + "\t" + tabs + firstNameTitle + tabs +
                        positionTitle + tabs + "\t" + hoursWorked);
                System.out.println(id + tabs + "\t\t" + lastName + tabs + "\t" + firstName + tabs + "\t" + position +
                        tabs + "\t" + totalWHours);
                System.out.println(id1 + tabs + "\t\t" + lastName1 + tabs + "\t\t" + firstName1 + tabs + position1 +
                        "\t\t" + totalWHours1);
                System.out.println(id2 + tabs + "\t\t" + lastName2 + tabs + "\t" + firstName + tabs + "\t" + position2 +
                        "\t\t" + totalWHours2);
                System.out.println(dash);

            } else if (adminOption == 4) {
                System.out.println(dash);
                System.out.println("SALARY COMPUTATION" + "\n" + "(1) " + id + "\n" + "(2) " + id1 + "\n" + "(3) "
                        + id2);
                System.out.println(dash);
                int salaryComputation = input.nextInt();
                if (salaryComputation == 1) {
                    System.out.println("EMPLOYEE DETAILS" + "\n" + idTitle + ":" + "\t" + id + "\n" + fullNameTitle +
                            ":" + tabs + fullName + "\n" + statusTitle + ":" + tabs + "\t" + status +
                            "\n" + positionTitle + ":" + tabs + position);
                    System.out.println(dash);
                    System.out.println("Input employee number to continue");
                    System.out.println(dash);

                } else if (salaryComputation == 2) {
                    System.out.println(dash);
                    System.out.println("EMPLOYEE DETAILS" + "\n" + idTitle + ":" + "\t" + id1 + "\n" +
                            fullNameTitle + ":" + tabs + fullName1 + "\n" + statusTitle + ":" + tabs + "\t" +
                            status1 + "\n" + positionTitle + ":" + tabs + position1);
                    System.out.println(dash);
                    System.out.println("Input employee number to continue");
                    System.out.println(dash);

                } else if (salaryComputation == 3) {
                    System.out.println(dash);
                    System.out.println("EMPLOYEE DETAILS" + "\n" + idTitle + ":" + "\t" + id2 + "\n" +
                            fullNameTitle + ":" + tabs + fullName2 + "\n" + statusTitle + ":" +
                            tabs + "\t" + status2 + "\n" + positionTitle + ":" + tabs + position2);
                    System.out.println(dash);
                    System.out.println("Input employee number to continue");
                    System.out.println(dash);
                }
                int salary = input.nextInt();
                if (salary == 10001) {
                    System.out.println(dash);
                    System.out.println("WEEKLY SALARY COMPUTATION");
                    System.out.println("September 5-9, 2022");
                    System.out.println();
                    System.out.println("WEEKLY BASIC SALARY: " + tabs + "\t\t" +
                            printNumberWithCommas(weeklyGrossIncome) + "\n" + riceSubsidyTitle + ":" +
                            tabs + tabs + "\t" + printNumberWithCommas(riceSubsidy) + "\n" + phoneAllowanceTitle +
                            ":" + tabs + tabs + printNumberWithCommas(phoneAllowance) + "\n" +
                            clothingAllowanceTitle + ":" + tabs + tabs +
                            printNumberWithCommas(clothingAllowance));
                    System.out.println();
                    System.out.println("TOTAL WEEKLY GROSS INCOME: " + tabs + "\t" +
                            printNumberWithCommas(totalGrossIncome));
                    System.out.println();
                    System.out.println(govDeductions + "\n" + "TAX: " + tabs + tabs + tabs +
                            printNumberWithCommas(weeklyTaxDue) +
                            "\n" + sssTitle + ":" + tabs + tabs + "\t\t" + printNumberWithCommas(weeklySssContri) + "\n" +
                            philhealthTitle + ":" + tabs + tabs + "\t" + printNumberWithCommas(weeklyPhilhealthContri) +
                            "\n" + pagibigTitle + ":" + tabs + tabs + "\t" +
                            printNumberWithCommas(weeklyPagibigContri));
                    System.out.println();
                    System.out.println("TOTAL WEEKLY NET INCOME: " + tabs + "\t" +
                            printNumberWithCommas(weeklyNetIncome));
                    System.out.println();
                    System.out.println();
                    System.out.println(dash);
                    System.out.println("***CONFIDENTIAL***");
                    System.out.println(dash);

                } else if (salary == 10002) {
                    System.out.println(dash);
                    System.out.println("WEEKLY SALARY COMPUTATION");
                    System.out.println("September 5-9, 2022");
                    System.out.println();
                    System.out.println("WEEKLY BASIC SALARY: " + tabs + "\t\t" +
                            printNumberWithCommas(weeklyGrossIncome1) + "\n" + riceSubsidyTitle + ":" +
                            tabs + tabs + "\t" + printNumberWithCommas(riceSubsidy1) + "\n" + phoneAllowanceTitle +
                            ":" + tabs + tabs + printNumberWithCommas(phoneAllowance1) + "\n" +
                            clothingAllowanceTitle + ":" + tabs + tabs +
                            printNumberWithCommas(clothingAllowance1));

                    System.out.println();
                    System.out.println("TOTAL WEEKLY GROSS INCOME: " + tabs + "\t" +
                            printNumberWithCommas(totalGrossIncome1));
                    System.out.println();
                    System.out.println(govDeductions + "\n" + "TAX: " + tabs + tabs + tabs +
                            printNumberWithCommas(weeklyTaxDue1) +
                            "\n" + sssTitle + ":" + tabs + tabs + "\t\t" + printNumberWithCommas(weeklySssContri1) + "\n" +
                            philhealthTitle + ":" + tabs + tabs + "\t" + printNumberWithCommas(weeklyPhilhealthContri1) +
                            "\n" + pagibigTitle + ":" + tabs + tabs + "\t" +
                            printNumberWithCommas(weeklyPagibigContri1));
                    System.out.println();
                    System.out.println("TOTAL WEEKLY NET INCOME: " + tabs + "\t" +
                            printNumberWithCommas(weeklyNetIncome1));
                    System.out.println();
                    System.out.println();
                    System.out.println(dash);
                    System.out.println("***CONFIDENTIAL***");
                    System.out.println(dash);

                } else if (salary == 10003) {
                    System.out.println(dash);
                    System.out.println("WEEKLY SALARY COMPUTATION");
                    System.out.println("September 5-9, 2022");
                    System.out.println();
                    System.out.println("WEEKLY BASIC SALARY: " + tabs + "\t\t" +
                            printNumberWithCommas(weeklyGrossIncome2) + "\n" + riceSubsidyTitle + ":" +
                            tabs + tabs + "\t" + printNumberWithCommas(riceSubsidy2) + "\n" + phoneAllowanceTitle +
                            ":" + tabs + tabs + printNumberWithCommas(phoneAllowance2) + "\n" +
                            clothingAllowanceTitle + ":" + tabs + tabs +
                            printNumberWithCommas(clothingAllowance2));
                    System.out.println();
                    System.out.println("TOTAL WEEKLY GROSS INCOME: " + tabs + "\t" +
                            printNumberWithCommas(totalGrossIncome2));
                    System.out.println();
                    System.out.println(govDeductions + "\n" + "TAX: " + tabs + tabs + tabs +
                            printNumberWithCommas(weeklyTaxDue2) +
                            "\n" + sssTitle + ":" + tabs + tabs + "\t\t" + printNumberWithCommas(weeklySssContri2) + "\n" +
                            philhealthTitle + ":" + tabs + tabs + "\t" + printNumberWithCommas(weeklyPhilhealthContri2) +
                            "\n" + pagibigTitle + ":" + tabs + tabs + "\t" +
                            printNumberWithCommas(weeklyPagibigContri2));
                    System.out.println();
                    System.out.println("TOTAL WEEKLY NET INCOME: " + tabs + "\t" +
                            printNumberWithCommas(weeklyNetIncome2));
                    System.out.println();
                    System.out.println();
                    System.out.println(dash);
                    System.out.println("***CONFIDENTIAL***");
                    System.out.println(dash);

                }
            } else if (adminOption == 5) {
                System.out.println(dash);
                System.out.println("THANK YOU! PLEASE LOG IN AGAIN!");
                System.out.println(dash);
            }


    }
}







    










