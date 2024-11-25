package org.ies.highschool.componentes;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read() {
        System.out.println("Introduce los datos del estudiante");
        System.out.println("1. Introduce el nombre");
        String nombre = scanner.nextLine();
        System.out.println("2. Introduce el apellido");
        String apellido = scanner.nextLine();
        System.out.println("3. Introduce la direccion");
        String direccion = scanner.nextLine();

        return new Student(
                nombre,
                apellido,
                direccion
        );
    }
}