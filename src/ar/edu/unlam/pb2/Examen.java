package ar.edu.unlam.pb2;

public class Examen {
	//Atributos
	private Integer nota;
	//Metodos
	public void Calificar(Integer nota) throws Exception{
		if(nota>0&&nota<=10){
			this.nota=nota;
		}
		else{
			throw new Exception("La nota debe estar entre 1 y 10");
		}
	}
	public Integer getNota(){
		return nota;
	}
}
