package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ninja firstNinja = new Ninja(scanner.nextLine());
        Ninja secondNinja = new Ninja(scanner.nextLine());
        String matrixDimentions = scanner.nextLine();
        String[] matrixDimentionsSplited = matrixDimentions.split(" ");
        Matrix matrix = new Matrix(Integer.parseInt(matrixDimentionsSplited[0]), Integer.parseInt(matrixDimentionsSplited[1]));
        matrix.setMatrixValue(firstNinja, secondNinja);

        matrix.printMatrix();

        List<String> ninjaCommands = Arrays.stream(scanner.nextLine()
                        .split(""))
                .collect(Collectors.toList());
        for (String command : ninjaCommands) {
            switch (command) {
                case "R":
                    matrix.moveRight(firstNinja);
                    break;
                case "U":
                    matrix.moveUp(firstNinja);
                    break;
                case "D":

                    matrix.moveDown(firstNinja);
                    break;
                case "L":
                    matrix.moveLeft(firstNinja);
                    break;
                default:
            }



            matrix.moveRight(firstNinja);

            matrix.printMatrix();
            System.out.println();

        }
        matrix.printMatrix();


    }
}