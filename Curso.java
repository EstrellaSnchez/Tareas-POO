public class Curso {
    public String NombreCurso;
    public String CodigoCurso;
    public String NombreInstructor;


    public Curso(String nombreCurso, String codigoCurso, String nombreInstructor) {
        this.NombreCurso = NombreCurso;
        this.CodigoCurso = CodigoCurso;
        this.NombreInstructor = NombreInstructor;

    }

    public String getNombreCurso() {
        return NombreCurso;
    }


    public String getCodigoCurso() {
        return CodigoCurso;
    }

    public String getInstructor() {
        return NombreInstructor;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Curso: " + NombreCurso);
        System.out.println("Código del Curso: " + CodigoCurso);
        System.out.println("Instructor: " + NombreInstructor);
    }

}
