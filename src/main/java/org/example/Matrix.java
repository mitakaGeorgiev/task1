package org.example;

import java.util.Scanner;

public class Matrix {
    private int rows;
    private int columns;
    private char[][] matrix;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = '-';
            }
        }
    }

    public void setMatrixValue(Ninja firstNinja, Ninja secondNinja) {
        Scanner scanner = new Scanner(System.in);
        Character firstNinjaCharacter = firstNinja.getName().charAt(0);
        Character secondNinjaCharacter = secondNinja.getName().charAt(0);
        for (int i = 0; i < rows; i++) {
            String currentInput = scanner.nextLine();
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = currentInput.charAt(j);
                if (currentInput.charAt(j) == firstNinjaCharacter) {
                    firstNinja.setColumnPosition(j);
                    firstNinja.setRowPosition(i);
                }
                if (currentInput.charAt(j) == secondNinjaCharacter) {
                    secondNinja.setColumnPosition(j);
                    secondNinja.setRowPosition(i);
                }


            }
        }
    }

    public void printMatrix() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }

    public void moveRight(Ninja currentNinja) {
        Character currentNinjaCharacter = currentNinja.getName().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if ((matrix[i][j] == currentNinjaCharacter) && (j + 1 < columns)) {

                    Character futureChar=matrix[i][j + 1] = currentNinjaCharacter;
                    Vegetable veggieToBeEaten=checkSquare(futureChar,currentNinja);
                    if(veggieToBeEaten!=null){
                        currentNinja.getBag().add(veggieToBeEaten);
                    }
                    matrix[i][j] = '-';
                    futureChar = currentNinjaCharacter;
                }
        }

    }
    public void moveLeft(Ninja currentNinja) {
        Character currentNinjaCharacter = currentNinja.getName().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if ((matrix[i][j] == currentNinjaCharacter) && (j -1 >=0 )) {

                    Character futureChar=matrix[i][j - 1] = currentNinjaCharacter;
                    Vegetable veggieToBeEaten=checkSquare(futureChar,currentNinja);
                    if(veggieToBeEaten!=null){
                        currentNinja.getBag().add(veggieToBeEaten);
                    }
                    matrix[i][j] = '-';
                    futureChar = currentNinjaCharacter;
                }
        }

    }
    public void moveUp(Ninja currentNinja) {
        Character currentNinjaCharacter = currentNinja.getName().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if ((matrix[i][j] == currentNinjaCharacter) && (i -1 >=0 )) {

                    Character futureChar=matrix[i-1][j] = currentNinjaCharacter;
                    Vegetable veggieToBeEaten=checkSquare(futureChar,currentNinja);
                    System.out.println("silata e "+veggieToBeEaten.getPower());
                    if(veggieToBeEaten!=null){
                        currentNinja.getBag().add(veggieToBeEaten);
                    }
                    matrix[i][j] = '-';
                    futureChar = currentNinjaCharacter;
                }
        }

    }
    public void moveDown(Ninja currentNinja) {
        Character currentNinjaCharacter = currentNinja.getName().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if ((matrix[i][j] == currentNinjaCharacter) && (i +1 <rows )) {

                    Character futureChar=matrix[i+1][j] = currentNinjaCharacter;
                    Vegetable veggieToBeEaten=checkSquare(futureChar,currentNinja);
                    if(veggieToBeEaten!=null){
                        currentNinja.getBag().add(veggieToBeEaten);
                    }
                    matrix[i][j] = '-';
                    futureChar = currentNinjaCharacter;
                }
        }

    }

    public Vegetable checkSquare(char square, Ninja ninja) {

        switch (square) {
            case 'A':
                Asparagus asparagus = new Asparagus();
                return asparagus;

            case 'B':
                Broccoli broccoli = new Broccoli();
                return broccoli;

            case 'C':
                CherryBerry cherryBerry = new CherryBerry();
                return cherryBerry;

            case 'M':
                Mushroom mushroom = new Mushroom();
                return mushroom;
            case 'R':
                Royal royal = new Royal();
                return royal;

            default:
                return null;
        }


    }


}