package com.cip.prog7;

public class Libro {
	
	private String titulo,autor;
	private int ejemplares,prestados;
	
	//Constructr sin par�metros:
	
	public Libro(){	
		
	}
	
	//Constructor con par�metros:
	
	public Libro(String titulo,String autor,int ejemplares,int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	//Get y Set:
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	//Ahora realizamos los m�todos:
	
	//M�todo de prestamo:
	
	public boolean prestamo() {
		boolean prestaLibro = true;
		if(prestados < ejemplares) {
		   prestados++;
		}else {
			prestaLibro=false;
		}
		return prestaLibro;
		
	}
	
	//M�todo de devoluci�n:
	
	public boolean devolucion() {
		boolean devoluLibro = true;
		if(prestados == 0) {
		   devoluLibro = false;
			
		}else {
		   prestados--;
		}
		return devoluLibro;
	}
	
	//toString:
	
	@Override
	public String toString() {
		return "T�tulo: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + ejemplares + 
				"\nprestados: " + prestados;
	}
	

}
