package ss4;

import java.util.Scanner;

public class ConstructTheQuadraticEquationClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        class QuadraticEquation2 {
            double a, b, c, result;
            public QuadraticEquation2(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            public double getDiscriminant() {
                return result = this.b * this.b - (4 * this.a * this.c);
            }
            public double valuaOne() {
                return this.c / this.b;
            }
            public double valueFout() {
                return -this.b / (2 * this.a);
            }
            public double valueTwo() {
                return (-this.b * this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
            }
            public double valueThere() {
                return (-this.b * this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
            }
        }
        double a, b, c, Result;
        System.out.print("Enter the quadratic equation, a = ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the quadratic equation, b = ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the quadratic equation, c = ");
        c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation2 quadraic = new QuadraticEquation2(a, b, c);
        double valueOne, valueTwo, valueFourt;
        valueOne = quadraic.valueTwo();
        valueTwo = quadraic.valueThere();
        valueFourt = quadraic.valueFout();
        double result = quadraic.getDiscriminant();
        if (a == 0 && b == 0) {
            System.out.print("The equation has no solution");
        } else {
            if (a == 0) {
                System.out.print("Equation has 1 solution = " + quadraic.valuaOne());
            } else {
                if (result > 0) {
                    System.out.print("Equation has 2 solutions: " + "Test 1 = " + valueOne + ", Test 2 = " + valueTwo);
                } else {
                    if (result == 0) {
                        System.out.println("Equation with Double Root: " + valueFourt);
                    } else {
                        System.out.println("The equation has no solution");
                    }
                }
            }
        }
    }


    }

