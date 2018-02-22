package com.cip.prog7;

import java.util.Scanner;

public class mainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Libro libro1 = new Libro("El Quijote", "Cervantes", 2, 0);
		Libro libro2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 0);

		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getEjemplares());
		System.out.println("Prestados: " + libro1.getPrestados());
		System.out.println();

		System.out.println("Libro 2:");
		System.out.println("Titulo: " + libro2.getTitulo());
		System.out.println("Autor: " + libro2.getAutor());
		System.out.println("Ejemplares: " + libro2.getEjemplares());
		System.out.println("Prestados: " + libro2.getPrestados());
		System.out.println();

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());

		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");

		}

		if (libro2.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro2.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro2.getTitulo() + " para prestar");
		}

		if (libro2.devolucion()) {
			System.out.println("Se ha devuelto el libro " + libro2.getTitulo());
		} else {
			System.out.println("No hay ejemplares del libro " + libro2.getTitulo() + " prestados");
		}

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro2.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro2.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro2.getTitulo() + " para prestar");
		}

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro1.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
		}

		if (libro1.prestamo()) {
			System.out.println("Se ha prestado el libro " + libro2.getTitulo());
		} else {
			System.out.println("No quedan ejemplares del libro " + libro2.getTitulo() + " para prestar");
		}
		sc.close();
	}
     
}
