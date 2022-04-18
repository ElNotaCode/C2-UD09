package ej5;

//@Author ElNotaCode (Eloi Martorell) 18/04/2022

public class Aula {
	//constantes
	protected int ID = 1;
	protected int NUMEROMAXIMOESTUDIANTES = 10;
	protected String MATERIAALULA = "Fisica";
	
	//variables
	protected int id;
	protected int numeroMaximoEstudiantes;
	protected String materiaAula;
	
	protected String materias[] = new String[3];
	
	//por defecto
	protected Aula() {
		this.id = ID;
		this.numeroMaximoEstudiantes = NUMEROMAXIMOESTUDIANTES;
		this.materiaAula = MATERIAALULA;
	}
	
	//con todos los parametros
	protected Aula(int id, int numeroMaximoEstudiantes, String materiaAula) {
		this.id = id;
		this.numeroMaximoEstudiantes = numeroMaximoEstudiantes;
		cargarArray();
		if(materiaAula == materias[0] || materiaAula == materias[1] || materiaAula == materias[2]) {
			this.materiaAula = materiaAula;
		}else {
			this.materiaAula = MATERIAALULA;
		}
		
	}
	
	public int getId() {
		return id;
	}

	public int getNumeroMaximoEstudiantes() {
		return numeroMaximoEstudiantes;
	}

	public String getMateriaAula() {
		return materiaAula;
	}

	private void cargarArray() {
		materias[0] = "Matematicas";
		materias[1] = "Filosofia";
		materias[2] = "Fisica";
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", numeroMaximoEstudiantes=" + numeroMaximoEstudiantes + ", materiaAula="
				+ materiaAula + "]";
	}
	
	
}
