package com.eacuamba.java_como_programar.chapter_8._8_14_package_access;

/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public class PackageDataContext {
    public static void main(String[] args) {
        System.out.println("Printing without change the first values.");
        PackageData packageData = new PackageData("EACUAMBA", 12);
        System.out.printf("ALIA: %s, AGE: %s.%n%n", packageData.alia, packageData.age );

        packageData.age = 29;
        packageData.alia = "EACNOW";
        System.out.println("Printing after change the values");
        System.out.printf("ALIA: %s, AGE: %s.%n%n", packageData.alia, packageData.age );

    }
}
class PackageData{
    String alia;
    int age;

    public PackageData(String alia, int age){
        this.age = age;
        this.alia = alia;
    }
}