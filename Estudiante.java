/**
 * Documentacion estudiante
 * @author QuesadaCuadradoAntonio
 * @version 1.0
 */


enum Curso {
  PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};


public class Estudiante extends Persona{
  Curso curso;
  
  /**
   * Constructor
   * 
   * @param nombre Nombre del estudiante
   * @param apellidos Apellidos del estudiante
   * @param nif NIF del estudiante
   * @param curso Curso del estudiante
   */
  protected Estudiante(String nombre, String apellidos, String nif,
      Curso curso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.nif = nif;
    this.curso = curso;
  }

  /**
   * Devolver el curso del estudiante
   * 
   * @return Curso del estudiante
   */
  protected Curso getCurso() {
    return curso;
  }

  /**
   * Establecer el curso del estudiante
   * 
   * @param curso Curso del estudiante
   */
  protected void setCurso(Curso curso) {
    this.curso = curso;
  }

  
}