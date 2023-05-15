package co.edu.upb.vista;

import co.edu.upb.modelo.modelo;

import java.util.Scanner;

public class vista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre autor ");
        String autor = sc.nextLine();
        System.out.println("ingrese nombre libro ");
        String libro = sc.nextLine();
        System.out.println("ingrese cantidad");
        int cantidad = sc.nextInt();
        modelo.addLibroPorAutor(autor,libro);
        System.out.println("ingrese nombre autor ");
        String autor1 = sc.nextLine();
        System.out.println("ingrese nombre libro ");
        String libro1 = sc.nextLine();
        System.out.println("ingrese cantidad");
        int cantidad1 = sc.nextInt();
        modelo.addLibroPorTitulo(libro1,cantidad1);
        System.out.println("ingrese nombre autor ");
        String autor2 = sc.nextLine();
        System.out.println("ingrese nombre libro ");
        String libro2 = sc.nextLine();
        System.out.println("ingrese cantidad");
        int cantidad2 = sc.nextInt();
        modelo.removeLibro(libro2, cantidad2);

    }
}
