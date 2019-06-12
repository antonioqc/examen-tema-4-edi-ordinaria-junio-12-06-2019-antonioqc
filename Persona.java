public class Persona {

  protected String nombre;
  protected String apellidos;
  protected String nif;

  /**
   * Constructor
   */
  public Persona() {
    super();
  }

  /**
   * Obtener el nombre de la persona
   * 
   * @return Nombre de la persona
   */
  protected String getNombre() {
    return nombre;
  }

  /**
   * Establecer el nombre de la persoa
   * 
   * @param nombre Nombre de la persona
   */
  protected void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtener los apellidos de la persona
   * 
   * @return Apellidos de la persona
   */
  protected String getApellidos() {
    return apellidos;
  }

  /**
   * Establecer los apellidos de la persona
   * 
   * @param apellidos Apellidos de la persona
   */
  protected void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  /**
   * Obtener el NIF de la persona
   * 
   * @return NIF de la persona
   */
  protected String getNif() {
    return nif;
  }

  /**
   * Establecer el NIF de la persona
   * 
   * @param nif NIF de la persona
   */
  protected void setNif(String nif) {
    this.nif = nif;
  }

}
