package menu;

import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Hospital hospital = new Hospital();


    public void login() {
        int intentosMax = 5, intentosUsuario = 0;

        while (intentosUsuario < intentosMax) {

            System.out.println("Bienvenido \n Inicia sesión para continuar:");

            System.out.println("Ingresa tu usuario: ");
            String usuario = scanner.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            String contraseña = scanner.nextLine();

            Usuario usuarioEnSesion = hospital.validarInicioSesion(usuario, contraseña);

            if (usuarioEnSesion instanceof Usuario) {

                if (usuarioEnSesion.getRol() == Rol.PACIENTE) {
                    Paciente pacienteEnSesion = (Paciente) usuarioEnSesion;

                    MunuPaciente menuPaciente = new MunuPaciente();
                    int opcion =0;
                    while (opcion != 4) {

                        menuPaciente.mostrarMenu();
                        menuPaciente.procesarDatosMenu(opcion, hospital, pacienteEnSesion);

                    } intentosUsuario = 0;

                } else if (usuarioEnSesion.getRol() == Rol.MEDICO) {
                    Medico medicoEnSesion = (Medico) usuarioEnSesion;
                    MenuMedico menuMedico = new MenuMedico();
                    int opcion =0;

                    while (opcion != 7) {
                        menuMedico.mostrarMenu();
                        menuMedico.procesarDatosMenu(opcion,medicoEnSesion,hospital);
                    } intentosUsuario = 0;


                } else {
                    Administrador administradorEnSesion = (Administrador) usuarioEnSesion;
              MenuAdministrador menuAdministrador = new MenuAdministrador();
              int opcion =0;

              while (opcion != 13) {
                  opcion= menuAdministrador.mostrarMenu();
                  menuAdministrador.procesarDatosMenu(opcion,hospital,administradorEnSesion);
              }
                    intentosUsuario = 0;
                }

            } else {
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
            }

        }
        System.out.println("Intentos maximos permitidos");

    }

    private int mostrarErrorInicioSesion(int intentosUsuario) {
        System.out.println("Usuario o contraseña incorrectos, intenta de nuevo");
        return intentosUsuario + 1;
    }

}
