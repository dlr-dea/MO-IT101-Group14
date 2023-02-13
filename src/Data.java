import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Data {


    //for week 7 - 2 decimal points & comma for amount
    public static String printNumberWithCommas(double amount) {
        DecimalFormat formatter = new DecimalFormat("##,###.00");
        String formattedNumber = formatter.format(amount);
        return String.format(formattedNumber, amount);
    }

    public static void main(String[] args) {


// Title per task/s
        final String companyName = "MOTOR PH DATABASE";
        final String hoursWorked = "TOTAL HOURS WORKED";
        final String totalWeekIncome = "TOTAL WEEKLY INCOME";
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
        String fullNameTitle = "FULLNAME";
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


//Week 5 TASK: EMPLOYEE DATABASE USING VARIABLE
        System.out.println();
        System.out.println(week5task);
        System.out.println(companyName);

        System.out.println(idTitle + tabs + lastNameTitle + "\t" + tabs + firstNameTitle + tabs + "\t" +
                birthDateTitle + tabs + "\t\t" + addressTitle + tabs + tabs + tabs + tabs + tabs + tabs + "\t" +
                phoneNumberTitle + tabs + sssTitle + tabs + "\t\t" + philhealthTitle + tabs +
                tinTitle + tabs + "\t\t" + pagibigTitle + tabs + statusTitle + tabs + positionTitle + tabs + "\t" +
                iSupervisorTitle + tabs + basicSalaryTitle + tabs + riceSubsidyTitle + tabs + phoneAllowanceTitle + tabs +
                clothingAllowanceTitle + tabs + grossRateTitle + tabs + hourlyRateTitle);

        System.out.println(id + tabs + "\t\t" + lastName + tabs + "\t" + firstName + tabs + "\t\t" +
                birthDate + tabs + address + tabs + phoneNumber + tabs + "\t" +
                sss + tabs + philhealth + tabs +
                tin + tabs + pagibig + tabs + status + tabs + position + tabs + "\t" + iSupervisor + tabs + "\t" +
                tabs + printNumberWithCommas(basicSalary) + tabs + "\t" + printNumberWithCommas(riceSubsidy) +
                tabs + "\t" + printNumberWithCommas(phoneAllowance) + tabs + "\t" +
                printNumberWithCommas(clothingAllowance) + tabs + "\t\t" + printNumberWithCommas(grossRate) + tabs +
                tabs + printNumberWithCommas(hourlyRate));

        System.out.println(id1 + tabs + "\t\t" + lastName1 + tabs + "\t\t" + firstName1 + tabs + "\t" +
                birthDate1 + tabs + address1 + tabs + tabs + tabs + phoneNumber1 + tabs + "\t" +
                sss1 + tabs + philhealth1 + tabs +
                tin1 + tabs + pagibig1 + tabs + status1 + tabs + position1 + "\t\t" + iSupervisor1 + "\t" +
                tabs + printNumberWithCommas(basicSalary1) + tabs + "\t" + printNumberWithCommas(riceSubsidy1) +
                tabs + "\t" + printNumberWithCommas(phoneAllowance1) + tabs + "\t\t" +
                printNumberWithCommas(clothingAllowance1) + tabs + tabs + printNumberWithCommas(grossRate1) + tabs +
                tabs + printNumberWithCommas(hourlyRate1));

        System.out.println(id2 + tabs + "\t\t" + lastName2 + tabs + "\t" + firstName2 + tabs + "\t\t" +
                birthDate2 + tabs + "\t" + address2 + tabs + tabs + "\t\t" + phoneNumber2 + tabs + "\t" +
                sss2 + tabs + philhealth2 + tabs +
                tin2 + tabs + pagibig2 + tabs + status2 + tabs + position2 + "\t\t" + iSupervisor2 + "\t" +
                tabs + printNumberWithCommas(basicSalary2) + tabs + "\t" + printNumberWithCommas(riceSubsidy2) +
                tabs + "\t" + printNumberWithCommas(phoneAllowance2) + tabs + "\t\t" +
                printNumberWithCommas(clothingAllowance2) + tabs + tabs + printNumberWithCommas(grossRate2) + tabs +
                tabs + printNumberWithCommas(hourlyRate2));


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

//10001 weekly allowance
        double rSubsidy = (riceSubsidy / 21) * 5;
        double pAllowance = (phoneAllowance / 21) * 5;
        double cAllowance = (clothingAllowance / 21) * 5;

//10002 weekly allowance
        double rSubsidy1 = (riceSubsidy1 / 21) * 5;
        double pAllowance1 = (phoneAllowance1 / 21) * 5;
        double cAllowance1 = (clothingAllowance1 / 21) * 5;

//10003 weekly allowance
        double rSubsidy2 = (riceSubsidy2 / 21) * 5;
        double pAllowance2 = (phoneAllowance2 / 21) * 5;
        double cAllowance2 = (clothingAllowance2 / 21) * 5;

//Hourly Rate*Total Hours Worked
        double grossIncome = (totalWHours * hourlyRate) + (rSubsidy + pAllowance + cAllowance);
        double grossIncome1 = (totalWHours1 * hourlyRate1) + (rSubsidy + pAllowance + cAllowance);
        double grossIncome2 = (totalWHours2 * hourlyRate2) + (rSubsidy + pAllowance + cAllowance);

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


        System.out.println();
        System.out.println(attendance);
        System.out.println();
        System.out.println("\t" + week);
        System.out.println("\t" + idTitle + ":" + " " + id);
        System.out.println("\t" + fullNameTitle + ":" + " " + fullName);
        System.out.println();
        System.out.println(dateTitle + tabs + "\t\t" + timeInTitle + tabs + "\t" + timeOutTitle +
                tabs + remarksTitle);

        System.out.println(mon + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(tues + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(wed + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(thurs + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(fri + tabs + timeIn + tabs + timeOut + tabs + remarks1);

        //10002
        System.out.println();
        System.out.println("\t" + week);
        System.out.println("\t" + idTitle + ":" + " " + id1);
        System.out.println("\t" + fullNameTitle + ":" + " " + fullName1);
        System.out.println();
        System.out.println(dateTitle + tabs + "\t\t" + timeInTitle + tabs + "\t" + timeOutTitle + tabs + remarksTitle);

        System.out.println(mon + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(tues + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(wed + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(thurs + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(fri + tabs + timeIn + tabs + timeOut + tabs + remarks1);

        //10003
        System.out.println();
        System.out.println("\t" + week);
        System.out.println("\t" + idTitle + ":" + " " + id2);
        System.out.println("\t" + fullNameTitle + ":" + " " + fullName2);
        System.out.println();
        System.out.println(dateTitle + tabs + "\t\t" + timeInTitle + tabs + "\t" + timeOutTitle + tabs + remarksTitle);

        System.out.println(mon + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(tues + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(wed + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(thurs + tabs + timeIn + tabs + timeOut + tabs + remarks1);
        System.out.println(fri + tabs + timeLate + tabs + timeOut + tabs + remarks);


//Week 6 TASK: TOTAL WORKING HOURS CALCULATION
        System.out.println();
        System.out.println(week6task);
        System.out.println(hoursWorked);
        System.out.println(week);

        System.out.println(idTitle + tabs + lastNameTitle + "\t" + tabs + firstNameTitle + tabs +
                positionTitle + tabs + "\t" + hoursWorked);
        System.out.println(id + tabs + "\t\t" + lastName + tabs + "\t" + firstName + tabs + "\t" + position +
                tabs + "\t" + totalWHours);
        System.out.println(id1 + tabs + "\t\t" + lastName1 + tabs + "\t\t" + firstName1 + tabs + position1 +
                "\t\t" + totalWHours1);
        System.out.println(id2 + tabs + "\t\t" + lastName2 + tabs + "\t" + firstName + tabs + "\t" + position2 +
                "\t\t" + totalWHours2);


//ATTENDANCE RECORD

        //10001
        System.out.println();
        System.out.println(week7task);

//Week 7 TASK: TOTAL WEEKLY GROSS INCOME CALCULATION

        System.out.println(totalWeekIncome);
        System.out.println(week);


        System.out.println(idTitle + tabs + lastNameTitle + "\t" + tabs + firstNameTitle + tabs +
                positionTitle + tabs + "\t" + hoursWorkedTitle + tabs + riceSubsidyTitle + tabs +
                phoneAllowanceTitle + tabs + clothingAllowanceTitle + tabs + hourlyRateTitle + tabs +
                grossIncomeTitle);
        System.out.println(id + tabs + "\t\t" + lastName + tabs + "\t" + firstName + tabs + "\t" + position +
                tabs + "\t" + totalWHours + tabs + tabs + printNumberWithCommas(rSubsidy) + tabs + "\t\t" +
                printNumberWithCommas(pAllowance) + tabs + "\t\t" + printNumberWithCommas(cAllowance) + tabs + tabs +
                printNumberWithCommas(hourlyRate) + tabs + "\t" +
                printNumberWithCommas(grossIncome));
        System.out.println(id1 + tabs + "\t\t" + lastName1 + tabs + "\t\t" + firstName1 + tabs + position1 +
                "\t\t" + totalWHours1 + tabs + tabs + printNumberWithCommas(rSubsidy1) + tabs + "\t\t" +
                printNumberWithCommas(pAllowance1) + tabs + "\t\t" + printNumberWithCommas(cAllowance1) + tabs +
                tabs + printNumberWithCommas(hourlyRate1) + tabs + "\t" +
                printNumberWithCommas(grossIncome1));
        System.out.println(id2 + tabs + "\t\t" + lastName2 + tabs + "\t" + firstName + tabs + "\t" + position2 +
                "\t\t" + totalWHours2 + tabs + tabs + printNumberWithCommas(rSubsidy2) + tabs + "\t\t" +
                printNumberWithCommas(pAllowance2) + tabs + "\t\t" + printNumberWithCommas(cAllowance2) +
                tabs + tabs + printNumberWithCommas(hourlyRate2) + tabs + "\t" +
                printNumberWithCommas(grossIncome2));


//scanner
        Scanner input = new Scanner(System.in);

        int password = 123456;
        String pass = "******";
        String admin = "admin";

        System.out.println();
        System.out.println("Hello, Admin! Please login.");
        System.out.println("Enter User Name");
        admin = input.next();
        System.out.println("Enter Password");
        password = input.nextInt();

        System.out.println("Username: " + "\n" + admin);
        System.out.println("Password: " + "\n" + pass);

        if (admin == admin && password == 123456) {


            System.out.println();
            System.out.println("Enter Employee No: ");
            id = input.nextInt();
            if (id == 10001) {

                System.out.println("EMPLOYEE DETAILS" + "\n" + fullNameTitle + ":" + tabs + fullName + "\n" +
                        birthDateTitle + ":" +  tabs + birthDate + "\n" + addressTitle + ":" + tabs + address + "\n" +
                        phoneNumberTitle + ":" + "\t\t" + phoneNumber + "\n" + sssTitle + ":" + tabs + sss + "\n" +
                        philhealthTitle + ":" + "\t\t" + philhealth + "\n" + tinTitle + ":" + tabs + tin + "\n" +
                        pagibigTitle + ":" + "\t\t" + pagibig + "\n" + statusTitle + ":" + tabs + "\t" + status +
                        "\n" + positionTitle + ":" + tabs + position + "\n" + basicSalaryTitle + ":" + "\t\t" +
                        printNumberWithCommas(basicSalary) + "\n" + riceSubsidyTitle + ":" + "\t\t" +
                        printNumberWithCommas(riceSubsidy) + "\n" + phoneAllowanceTitle + ":" + "\t" +
                        printNumberWithCommas(phoneAllowance) + "\n" + clothingAllowanceTitle + ":" + "\t" +
                        printNumberWithCommas(clothingAllowance));

                System.out.println();
                System.out.println("Enter Employee No: ");
                id1 = input.nextInt();

                if (id1 == 10002) {

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

                    System.out.println();
                    System.out.println("Enter Employee No: ");
                    id2 = input.nextInt();

                    if (id2 == 10003) {

                        System.out.println("EMPLOYEE DETAILS" + "\n" + fullNameTitle + ":" + tabs + fullName2 +
                                "\n" + birthDateTitle + ":" + tabs + birthDate2 + "\n" + addressTitle +
                                ":" + tabs + address2 + "\n" + phoneNumberTitle + ":" + "\t\t" +
                                phoneNumber2 + "\n" + sssTitle + ":" + tabs + sss2 + "\n" + philhealthTitle +
                                ":" + "\t\t" + philhealth2 + "\n" + tinTitle + ":" + tabs + tin2 + "\n" +
                                pagibigTitle + ":" + "\t\t" + pagibig1 + "\n" + statusTitle + ":" + tabs + "\t" +
                                status2 + "\n" + positionTitle + ":" + tabs + position2 +
                                "\n" + basicSalaryTitle + ":" + "\t\t" + printNumberWithCommas(basicSalary2) + "\n" +
                                riceSubsidyTitle + ":" + "\t\t" + printNumberWithCommas(riceSubsidy2) + "\n" +
                                phoneAllowanceTitle + ":" + "\t" + printNumberWithCommas(phoneAllowance2) +
                                "\n" + clothingAllowanceTitle + ":" + "\t" + printNumberWithCommas(clothingAllowance2));


                    } else {
                        System.out.println("ERROR");

                    }
                } else {
                    System.out.println("ERROR");


                }
            } else {
                System.out.println("ERROR");

            }
        } else {
            System.out.println("ERROR");

        }



    }

}




