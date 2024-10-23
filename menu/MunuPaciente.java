package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MunuPaciente {
    Scanner scanner = new Scanner(System.in);


    public int mostrarMenu() {
            System.out.println("SISTEMA HOSPITAL ");
            System.out.println("1. Ver mis consultas ");
            System.out.println("2. Ver mis datos"); //////////
            System.out.println("3. Ver mi expediente  médico ");
            System.out.println("4. Salir");

            System.out.println("Seleccione una opcion");
            int opcion= scanner.nextInt();

            return opcion; }


    public void procesarDatosMenu(int opcion, Hospital hospital, Paciente paciente){
        switch(opcion){
            case 1:
                hospital.verConsultasPaciente(paciente.getId());
                break;

            case 2:
                System.out.println("Tus datos son: ");
                paciente.mostrarDatosPorId(paciente.getId()); }
        }

    }

