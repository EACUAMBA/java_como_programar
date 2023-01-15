package com.eacuamba.dev.chapter_18_recursao._18_8_torres_de_hanoi;

public class TowersOfHanoi {

    public static void solveTowers(
            int disks,
            int sourcePeg,
            int destinationPeg,
            int temporaryPeg
    ) {
        if (disks == 1) {
            System.out.printf(
                    "%d -->> %d%n",
                    sourcePeg,
                    destinationPeg
            );
            return;
        }

        solveTowers(
                disks - 1,
                sourcePeg,
                temporaryPeg,
                destinationPeg
        );

        System.out.printf(
                "%d -->> %d%n",
                sourcePeg,
                destinationPeg
        );

        solveTowers(
                disks - 1,
                temporaryPeg,
                destinationPeg,
                sourcePeg
        );
    }


    public static void main(String[] args) {
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 2;
        int totalDisk = 3;

        solveTowers(
                totalDisk,
                startPeg,
                endPeg,
                tempPeg
        );
    }
}
