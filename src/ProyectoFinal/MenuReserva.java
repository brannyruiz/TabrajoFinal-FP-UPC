package ProyectoFinal;

import java.lang.String;
import java.util.Scanner;

public class MenuReserva {
    public static void main(String[] args) {

        String[][] lunes = new String[7][9];
        lunes[0][0] = "MESA0102LIB";
        lunes[0][1] = "MESA0204RES";
        lunes[0][2] = "MESA0304RES";
        lunes[0][3] = "MESA0402LIB";
        lunes[0][4] = "MESA0506RES";
        lunes[0][5] = "MESA0702LIB";
        lunes[0][6] = "MESA0804RES";
        lunes[0][7] = "MESA0904RES";
        lunes[0][8] = "MESA0904RES";


        lunes[1][0] = "MESA0102RES";
        lunes[1][1] = "MESA0204LIB";
        lunes[1][2] = "MESA0304RES";
        lunes[1][3] = "MESA0402RES";
        lunes[1][4] = "MESA0506RES";
        lunes[1][5] = "MESA0602RES";
        lunes[1][6] = "MESA0704LIB";
        lunes[1][7] = "MESA0804RES";
        lunes[1][8] = "MESA0904RES";

        lunes[2][0] = "MESA0102RES";
        lunes[2][1] = "MESA0204LIB";
        lunes[2][2] = "MESA0304RES";
        lunes[2][3] = "MESA0402RES";
        lunes[2][4] = "MESA0506RES";
        lunes[2][5] = "MESA0602RES";
        lunes[2][6] = "MESA0704LIB";
        lunes[2][7] = "MESA0804RES";
        lunes[2][8] = "MESA0904RES";


        lunes[3][0] = "MESA0102RES";
        lunes[3][1] = "MESA0204LIB";
        lunes[3][2] = "MESA0304RES";
        lunes[3][3] = "MESA0402RES";
        lunes[3][4] = "MESA0506RES";
        lunes[3][5] = "MESA0602RES";
        lunes[3][6] = "MESA0704LIB";
        lunes[3][7] = "MESA0804RES";
        lunes[3][8] = "MESA0904RES";


        lunes[4][0] = "MESA0102RES";
        lunes[4][1] = "MESA0204LIB";
        lunes[4][2] = "MESA0304RES";
        lunes[4][3] = "MESA0402RES";
        lunes[4][4] = "MESA0506RES";
        lunes[4][5] = "MESA0602RES";
        lunes[4][6] = "MESA0704LIB";
        lunes[4][7] = "MESA0804RES";
        lunes[4][8] = "MESA0904RES";


        lunes[5][0] = "MESA0102RES";
        lunes[5][1] = "MESA0204LIB";
        lunes[5][2] = "MESA0304RES";
        lunes[5][3] = "MESA0402RES";
        lunes[5][4] = "MESA0506RES";
        lunes[5][5] = "MESA0602RES";
        lunes[5][6] = "MESA0704LIB";
        lunes[5][7] = "MESA0804RES";
        lunes[5][8] = "MESA0904RES";


        lunes[6][0] = "MESA0102RES";
        lunes[6][1] = "MESA0204LIB";
        lunes[6][2] = "MESA0304RES";
        lunes[6][3] = "MESA0402RES";
        lunes[6][4] = "MESA0506RES";
        lunes[6][5] = "MESA0602RES";
        lunes[6][6] = "MESA0704LIB";
        lunes[6][7] = "MESA0804RES";
        lunes[6][8] = "MESA0904RES";


        String[][] martes = new String[7][9];
        martes[0][0] = "MESA0102LIB";
        martes[2][0] = "MESA0102RES";
        martes[4][0] = "MESA0102RES";
        martes[5][0] = "MESA0102RES";

        martes[0][1] = "MESA0304RES";
        martes[2][1] = "MESA0102RES";
        martes[4][1] = "MESA0102RES";
        martes[5][1] = "MESA0102RES";
        martes[0][2] = "MESA0404RES";
        martes[2][8] = "MESA0404RES";
        martes[4][2] = "MESA0102RES";
        martes[5][2] = "MESA0102RES";
        martes[0][3] = "MESA0504RES";
        martes[2][2] = "MESA0102RES";
        martes[4][3] = "MESA0102RES";
        martes[5][3] = "MESA0102RES";
        martes[0][4] = "MESA0606RES";
        martes[2][3] = "MESA0102RES";
        martes[4][4] = "MESA0102RES";
        martes[5][4] = "MESA0102RES";
        martes[0][5] = "MESA0704RES";
        martes[2][4] = "MESA0102RES";
        martes[4][5] = "MESA0102RES";
        martes[5][5] = "MESA0102RES";
        martes[0][6] = "MESA0804RES";
        martes[2][5] = "MESA0102RES";
        martes[4][6] = "MESA0102RES";
        martes[5][6] = "MESA0102RES";
        martes[0][7] = "MESA0906RES";
        martes[2][6] = "MESA0102RES";
        martes[4][7] = "MESA0102RES";
        martes[5][7] = "MESA0102RES";
        martes[0][8] = "MESA0206RES";
        martes[2][7] = "MESA0102RES";
        martes[4][8] = "MESA0102RES";
        martes[5][8] = "MESA0102RES";


        martes[1][0] = "MESA0102LIB";
        martes[3][0] = "MESA0102LIB";
        martes[5][1] = "MESA0102LIB";
        martes[6][1] = "MESA0102RES";
        martes[1][1] = "MESA0204RES";
        martes[3][1] = "MESA0102RES";
        martes[5][2] = "MESA0102RES";
        martes[6][2] = "MESA0102RES";
        martes[1][2] = "MESA0304RES";
        martes[3][2] = "MESA0102RES";
        martes[5][3] = "MESA0102RES";
        martes[6][3] = "MESA0102RES";
        martes[1][3] = "MESA0402RES";
        martes[3][3] = "MESA0102RES";
        martes[5][4] = "MESA0102RES";
        martes[6][4] = "MESA0102RES";
        martes[1][5] = "MESA0506RES";
        martes[3][4] = "MESA0102RES";
        martes[5][5] = "MESA0102RES";
        martes[6][5] = "MESA0102RES";
        martes[1][6] = "MESA0102RES";
        martes[3][5] = "MESA0102RES";
        martes[5][6] = "MESA0102RES";
        martes[6][6] = "MESA0102RES";
        martes[1][7] = "MESA0204RES";
        martes[3][6] = "MESA0102RES";
        martes[5][7] = "MESA0102RES";
        martes[6][7] = "MESA0102RES";
        martes[1][8] = "MESA0304RES";
        martes[3][7] = "MESA0102RES";
        martes[5][8] = "MESA0102RES";
        martes[6][8] = "MESA0102RES";

        martes[1][4] = "MESA0304RES";
        martes[3][8] = "MESA0304RES";
        martes[5][0] = "MESA0102RES";
        martes[6][0] = "MESA0102RES";


        String[][] miercoles = new String[7][9];
        miercoles[0][0] = "MESA0102RES";
        miercoles[0][1] = "MESA0204RES";
        miercoles[0][2] = "MESA0304RES";
        miercoles[0][3] = "MESA0402RES";
        miercoles[0][4] = "MESA0506RES";
        miercoles[0][5] = "MESA0602RES";
        miercoles[0][6] = "MESA0704RES";
        miercoles[0][7] = "MESA0804RES";
        miercoles[0][8] = "MESA0902RES";

        miercoles[1][0] = "MESA0102RES";
        miercoles[1][1] = "MESA0204LIB";
        miercoles[1][2] = "MESA0304LIB";
        miercoles[1][3] = "MESA0402LIB";
        miercoles[1][4] = "MESA0506LIB";
        miercoles[1][5] = "MESA0702RES";
        miercoles[1][6] = "MESA0804LIB";
        miercoles[1][7] = "MESA0904LIB";
        miercoles[1][8] = "MESA0402LIB";


        miercoles[2][0] = "MESA0102RES";
        miercoles[2][1] = "MESA0204LIB";
        miercoles[2][2] = "MESA0304LIB";
        miercoles[2][3] = "MESA0402LIB";
        miercoles[2][4] = "MESA0506LIB";
        miercoles[2][5] = "MESA0702RES";
        miercoles[2][6] = "MESA0804LIB";
        miercoles[2][7] = "MESA0904LIB";
        miercoles[2][8] = "MESA0402LIB";

        miercoles[3][0] = "MESA0102RES";
        miercoles[3][1] = "MESA0204LIB";
        miercoles[3][2] = "MESA0304LIB";
        miercoles[3][3] = "MESA0402LIB";
        miercoles[3][4] = "MESA0506LIB";
        miercoles[3][5] = "MESA0702RES";
        miercoles[3][6] = "MESA0804LIB";
        miercoles[3][7] = "MESA0904LIB";
        miercoles[3][8] = "MESA0402LIB";


        miercoles[4][0] = "MESA0102RES";
        miercoles[4][1] = "MESA0204LIB";
        miercoles[4][2] = "MESA0304LIB";
        miercoles[4][3] = "MESA0402LIB";
        miercoles[4][4] = "MESA0506LIB";
        miercoles[4][5] = "MESA0702RES";
        miercoles[4][6] = "MESA0804LIB";
        miercoles[4][7] = "MESA0904LIB";
        miercoles[4][8] = "MESA0402LIB";


        miercoles[5][0] = "MESA0102RES";
        miercoles[5][1] = "MESA0204LIB";
        miercoles[5][2] = "MESA0304LIB";
        miercoles[5][3] = "MESA0402LIB";
        miercoles[5][4] = "MESA0506LIB";
        miercoles[5][5] = "MESA0702RES";
        miercoles[5][6] = "MESA0804LIB";
        miercoles[5][7] = "MESA0904LIB";
        miercoles[5][8] = "MESA0402LIB";

        miercoles[6][0] = "MESA0102RES";
        miercoles[6][1] = "MESA0204LIB";
        miercoles[6][2] = "MESA0304LIB";
        miercoles[6][3] = "MESA0402LIB";
        miercoles[6][4] = "MESA0506LIB";
        miercoles[6][5] = "MESA0702RES";
        miercoles[6][6] = "MESA0804LIB";
        miercoles[6][7] = "MESA0904LIB";
        miercoles[6][8] = "MESA0402LIB";

        String[][] jueves = new String[7][9];
        jueves[0][0] = "MESA0102RES";
        jueves[0][1] = "MESA0204RES";
        jueves[0][2] = "MESA0304RES";
        jueves[0][3] = "MESA0402RES";
        jueves[0][4] = "MESA0506RES";
        jueves[0][5] = "MESA0304RES";
        jueves[0][6] = "MESA0402RES";
        jueves[0][7] = "MESA0506RES";
        jueves[0][8] = "MESA0506RES";

        jueves[1][0] = "MESA0102RES";
        jueves[1][1] = "MESA0204LIB";
        jueves[1][2] = "MESA0304LIB";
        jueves[1][3] = "MESA0402LIB";
        jueves[1][4] = "MESA0506LIB";
        jueves[1][5] = "MESA0304LIB";
        jueves[1][6] = "MESA0402LIB";
        jueves[1][7] = "MESA0506LIB";
        jueves[1][8] = "MESA0506LIB";

        jueves[2][0] = "MESA0102RES";
        jueves[2][1] = "MESA0204LIB";
        jueves[2][2] = "MESA0304LIB";
        jueves[2][3] = "MESA0402LIB";
        jueves[2][4] = "MESA0506LIB";
        jueves[2][5] = "MESA0304LIB";
        jueves[2][6] = "MESA0402LIB";
        jueves[2][7] = "MESA0506LIB";
        jueves[2][8] = "MESA0506LIB";

        jueves[2][0] = "MESA0102RES";
        jueves[2][1] = "MESA0204LIB";
        jueves[2][2] = "MESA0304LIB";
        jueves[2][3] = "MESA0402LIB";
        jueves[2][4] = "MESA0506LIB";
        jueves[2][5] = "MESA0304LIB";
        jueves[2][6] = "MESA0402LIB";
        jueves[2][7] = "MESA0506LIB";
        jueves[2][8] = "MESA0706LIB";


        jueves[3][0] = "MESA0102RES";
        jueves[3][1] = "MESA0204LIB";
        jueves[3][2] = "MESA0304LIB";
        jueves[3][3] = "MESA0402LIB";
        jueves[3][4] = "MESA0506LIB";
        jueves[3][5] = "MESA0304LIB";
        jueves[3][6] = "MESA0402LIB";
        jueves[3][7] = "MESA0506LIB";
        jueves[3][8] = "MESA0506LIB";

        jueves[4][0] = "MESA0102RES";
        jueves[4][1] = "MESA0204LIB";
        jueves[4][2] = "MESA0304LIB";
        jueves[4][3] = "MESA0402LIB";
        jueves[4][4] = "MESA0506LIB";
        jueves[4][5] = "MESA0304LIB";
        jueves[4][6] = "MESA0402LIB";
        jueves[4][7] = "MESA0506LIB";
        jueves[4][8] = "MESA0506LIB";

        jueves[5][0] = "MESA0102RES";
        jueves[5][1] = "MESA0204LIB";
        jueves[5][2] = "MESA0304LIB";
        jueves[5][3] = "MESA0402LIB";
        jueves[5][4] = "MESA0506LIB";
        jueves[5][5] = "MESA0304LIB";
        jueves[5][6] = "MESA0402LIB";
        jueves[5][7] = "MESA0506LIB";
        jueves[5][8] = "MESA0506LIB";

        jueves[6][0] = "MESA0102RES";
        jueves[6][1] = "MESA0204LIB";
        jueves[6][2] = "MESA0304LIB";
        jueves[6][3] = "MESA0402LIB";
        jueves[6][4] = "MESA0506LIB";
        jueves[6][5] = "MESA0304LIB";
        jueves[6][6] = "MESA0402LIB";
        jueves[6][7] = "MESA0506LIB";
        jueves[6][8] = "MESA0506LIB";

        String[][] viernes = new String[7][9];
        viernes[0][0] = "MESA0102RES"; viernes[3][0] = "MESA0102RES";
        viernes[0][1] = "MESA0204RES"; viernes[3][1] = "MESA0102RES";
        viernes[0][2] = "MESA0304RES";viernes[3][2] = "MESA0102RES";
        viernes[0][3] = "MESA0402RES";viernes[3][3] = "MESA0102RES";
        viernes[0][4] = "MESA0506RES";viernes[3][4] = "MESA0102RES";
        viernes[0][5] = "MESA0602RES";viernes[3][5] = "MESA0102RES";
        viernes[0][6] = "MESA0704RES";viernes[3][6] = "MESA0102RES";
        viernes[0][7] = "MESA0804RES";viernes[3][7] = "MESA0102RES";
        viernes[0][8] = "MESA0902RES";viernes[3][8] = "MESA0102RES";


        viernes[1][0] = "MESA0102RES";viernes[4][0] = "MESA0102RES";
        viernes[1][1] = "MESA0204LIB";viernes[4][1] = "MESA0102RES";
        viernes[1][2] = "MESA0304LIB";viernes[4][2] = "MESA0102RES";
        viernes[1][3] = "MESA0402RES";viernes[4][3] = "MESA0102RES";
        viernes[1][4] = "MESA0506RES";viernes[4][4] = "MESA0102RES";
        viernes[1][5] = "MESA0602RES";viernes[4][5] = "MESA0102RES";
        viernes[1][6] = "MESA0704RES";viernes[4][6] = "MESA0102RES";
        viernes[1][7] = "MESA0804RES";viernes[4][7] = "MESA0102RES";
        viernes[1][8] = "MESA0902RES";viernes[4][8] = "MESA0102RES";

        viernes[2][0] = "MESA0102LIB";viernes[5][0] = "MESA0102LIB";
        viernes[2][1] = "MESA0204LIB";viernes[5][1] = "MESA0102LIB";
        viernes[2][2] = "MESA0304RES";viernes[5][2] = "MESA0102RES";
        viernes[2][3] = "MESA0402RES";viernes[5][3] = "MESA0102RES";
        viernes[2][4] = "MESA0506RES";viernes[5][4] = "MESA0102RES";
        viernes[2][5] = "MESA0602RES";viernes[5][5] = "MESA0102RES";
        viernes[2][6] = "MESA0704RES";viernes[5][6] = "MESA0102RES";
        viernes[2][7] = "MESA0804RES";viernes[5][7] = "MESA0102RES";
        viernes[2][8] = "MESA0902RES";viernes[5][8] = "MESA0102RES";

        viernes[6][0] = "MESA0102RES";
        viernes[6][1] = "MESA0102RES";
        viernes[6][2] = "MESA0102RES";
        viernes[6][3] = "MESA0102RES";
        viernes[6][4] = "MESA0102RES";
        viernes[6][5] = "MESA0102RES";
        viernes[6][6] = "MESA0102RES";
        viernes[6][7] = "MESA0102RES";
        viernes[6][8] = "MESA0102RES";

        int horaelegida = 0;
        Scanner sc = new Scanner(System.in);
        String dia = "";

        String disponibilidad = "no";
        while (disponibilidad.equals("no")) {
            System.out.println("elige un dia");
            dia = sc.nextLine();

            switch (dia) {

                case "lunes":

                    String disponiblelunes = consultarlunes( lunes);
                    System.out.println("Hay mesas disponbles: " + disponiblelunes);
                    disponibilidad = disponiblelunes;

                    break;

                case "martes":

                    String disponiblemartes = consultarmartes( martes);
                    System.out.println("Hay mesas disponbles: " + disponiblemartes);
                    disponibilidad = disponiblemartes;
                    break;

                case "miercoles":

                    String disponiblemiercoles = consultarmiercoles( miercoles);
                    System.out.println("Hay mesas disponbles: " + disponiblemiercoles);
                    disponibilidad = disponiblemiercoles;

                    break;
                case "jueves":

                    String disponiblejueves=consultarjueves(jueves);
                    System.out.println("Hay mesas disponbles: "+ disponiblejueves );
                    disponibilidad = disponiblejueves;
                    break;
                case "viernes":

                    String disponibleviernes=consultarviernes(viernes);
                    System.out.println("Hay mesas disponbles: "+ disponibleviernes );
                    disponibilidad =disponibleviernes;
            }

        }

        String disponibilidadhora = "no";
        while (disponibilidadhora.equals("no")) {

            System.out.println("Elige la hora (0, para las 12:00pm ; 1 para las 1:00pm; 2 para las 2:00pm): ");

            horaelegida = sc.nextInt();
            switch (horaelegida) {

                case 0:
                    int contadordhora0 = 0;

                    if (dia.equals("miercoles")) {

                        for (int i = 0; i < 1; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((miercoles[0][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora0 += 1;
                                }

                                if (contadordhora0 > 0) {
                                    disponibilidadhora = "si";
                                }
                            }

                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 12:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 12:00 pm");
                            }
                            System.out.println(contadordhora0);
                        }
                    }

                    int contadordhora10 = 0;

                    if (dia.equals("martes")) {

                        for (int i = 0; i < 1; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((martes[0][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora10 += 1;
                                }

                                if (contadordhora10 > 0) {
                                    disponibilidadhora = "si";
                                }
                            }




                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 12:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 12:00 pm");
                            }
                            System.out.println(contadordhora10);
                        }
                    }

                    int contadordhora1 = 0;
                    if (dia.equals("lunes")) {

                        for (int i = 0; i < 1; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((lunes[0][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora1 += 1;
                                }

                                if (contadordhora1 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 12:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 12:00 pm");
                            }
                            System.out.println(contadordhora1);
                        }
                    }

                    int contadordhora11 = 0;
                    if (dia.equals("jueves")) {

                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                                if ((jueves[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora11 += 1;
                                }

                                if (contadordhora11 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 12:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 12:00 pm");
                            }
                            System.out.println(contadordhora11);
                        }
                    }


                    int contadordhora8 = 0;
                    if (dia.equals("viernes")) {

                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < 9; j++) {
                                if ((viernes[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora8 += 1;
                                }
                                if (contadordhora8 > 0) {
                                    disponibilidadhora = "si";
                                }
                            }
                        }
                        if (disponibilidadhora.equals("si")) {
                            System.out.println("Hay  mesa disponible para la hora 12:00 pm");
                        } else {
                            System.out.println("No Hay  mesa disponible para la hora 12:00 pm");
                        }
                        System.out.println(contadordhora8);
                    }
                    break;

                case 1:
                    int contadordhora3 = 0;

                    if (dia.equals("miercoles")) {

                        for (int i = 1; i < 2; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((miercoles[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora3 += 1;
                                }

                                if (contadordhora3 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 1:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 1:00 pm");
                            }
                            System.out.println(contadordhora3);
                        }
                    }


                    int contadordhora4 = 0;
                    if (dia.equals("lunes")) {
                        for (int i = 1; i < 2; i++) {
                            for (int j = 0; j < 9; j++) {
                                if ((lunes[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora4 += 1;
                                }

                                if (contadordhora4 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 1:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 1:00 pm");
                            }
                            System.out.println(contadordhora4);

                        }
                    }

                    int contadordhora5 = 0;
                    if (dia.equals("martes")) {

                        for (int i = 1; i < 2; i++) {
                            for (int j = 0; j < 9; j++) {
                                if ((martes[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora5 += 1;
                                }

                                if (contadordhora5 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 1:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 1:00 pm");
                            }
                            System.out.println(contadordhora5);
                        }
                    }
                    int contadordhora13 = 0;

                    if (dia.equals("jueves")) {

                        for (int i = 1; i < 2; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((jueves[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora13 += 1;


                                }

                                if (contadordhora13 > 0) {
                                    disponibilidadhora = "si";

                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 1:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 1:00 pm");
                            }
                            System.out.println(contadordhora13);


                        }
                    }



                    int contadordhora14 = 0;

                    if (dia.equals("viernes")) {

                        for (int i = 1; i < 2; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((viernes[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora14 += 1;
                                }

                                if (contadordhora14 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 1:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 1:00 pm");
                            }
                            System.out.println(contadordhora14);


                        }
                    }

                    break;

                case 2:




                    int contadordhora15 = 0;

                    if (dia.equals("miercoles")) {

                        for (int i = 2; i < 3; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((miercoles[2][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora15 += 1;

                                }

                                if (contadordhora15 > 0) {
                                    disponibilidadhora = "si";

                                }


                            }


                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 2:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 2:00 pm");
                            }
                            System.out.println(contadordhora15);


                        }
                    }

                    int contadordhora16 = 0;

                    if (dia.equals("martes")) {

                        for (int i = 2; i < 3; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((martes[2][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora16 += 1;
                                }

                                if (contadordhora16 > 0) {
                                    disponibilidadhora = "si";
                                }


                            }

                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 2:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 2:00 pm");
                            }
                            System.out.println(contadordhora16);

                        }
                    }

                    int contadordhora17 = 0;
                    if (dia.equals("lunes")) {

                        for (int i = 2; i < 3; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((lunes[2][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora16 += 1;
                                }

                                if (contadordhora16 > 0) {
                                    disponibilidadhora = "si";
                                }
                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 2:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 2:00 pm");
                            }
                            System.out.println(contadordhora16);


                        }
                    }

                    int contadordhora19 = 0;
                    if (dia.equals("jueves")) {

                        for (int i = 2; i < 3; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((jueves[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora19 += 1;
                                }

                                if (contadordhora19 > 0) {
                                    disponibilidadhora = "si";
                                }

                            }
                            if (disponibilidadhora.equals("si")) {
                                System.out.println("Hay  mesa disponible para la hora 2:00 pm");
                            } else {
                                System.out.println("No Hay  mesa disponible para la hora 2:00 pm");
                            }
                            System.out.println(contadordhora17);
                        }
                    }


                    int contadordhora18 = 0;
                    if (dia.equals("viernes")) {

                        for (int i = 2; i < 3; i++) {

                            for (int j = 0; j < 9; j++) {


                                if ((viernes[i][j].substring(8, 11).equals("LIB"))) {
                                    contadordhora18 += 1;
                                }

                                if (contadordhora18 > 0) {
                                    disponibilidadhora = "si";
                                }
                            }
                        }
                        if (disponibilidadhora.equals("si")) {
                            System.out.println("Hay  mesa disponible para la hora 2:00 pm");
                        } else {
                            System.out.println("No Hay  mesa disponible para la hora 2:00 pm");
                        }
                        System.out.println(contadordhora18);
                    }

                    break;
            }
        }
        String tipodemesa="0";
        Scanner scan = new Scanner(System.in);

        String [][] quedia= new  String[7][9];
        if (dia.equals("lunes")){

            quedia=lunes;

        }

        if (dia.equals("martes")){

            quedia=martes;

        }

        if (dia.equals("miercoles")){

            quedia=miercoles;

        }

        if (dia.equals("jueves")){

            quedia=jueves;

        }

        if (dia.equals("viernes")){

            quedia=viernes;

        }

        String Disponibilidadmesas ="no";

        while (Disponibilidadmesas.equals("no")){
            System.out.println("elige el tipo de mesa(2, 4, 6): ");
            tipodemesa=scan.nextLine();
            Disponibilidadmesas=CONSULTAmesa(dia,quedia,horaelegida,tipodemesa);
        }


        System.out.println("deseas confirmar para el " + dia + " la hora  " + horaelegida  + " y mesa para " + tipodemesa + ": " );
        String confirmar=scan.nextLine();
        if (confirmar.equals("si")){
            int Reservar=confirmaryreservar(quedia,horaelegida,tipodemesa);
        }
    }



    public static  String CONSULTAmesa(String dia, String[][] quedia, int hora, String tipodemesa1){

        String disponible="no";

        switch (dia){

            case "martes":
                int contadormesa=0;


                for (int i = hora; i < hora + 1; i++) {

                    for (int j = 0; j < 5; j++) {


                        if ( quedia[hora][j].substring(7,8).equals(tipodemesa1) && quedia[hora][j].substring(8,11).equals("LIB") ) {
                            contadormesa += 1;

                        }
                        if (contadormesa>0){
                            disponible="si";

                        }

                    }
                }
                System.out.println("hay " + contadormesa + " mesas disponibles");
                break;

            case "lunes":
                int contadormesa1=0;


                for (int i = hora; i < hora + 1; i++) {

                    for (int j = 0; j < 9; j++) {


                        if ( quedia[hora][j].substring(7,8).equals(tipodemesa1) && quedia[hora][j].substring(8,11).equals("LIB") ) {
                            contadormesa1 += 1;
                        }
                        if (contadormesa1>0){
                            disponible="si";
                        }


                    }}
                System.out.println("hay " + contadormesa1 + " mesas disponibles"); break;


            case "viernes":
                int contadormesa12=0;


                for (int i = hora; i < hora + 1; i++) {

                    for (int j = 0; j < 9; j++) {


                        if ( quedia[hora][j].substring(7,8).equals(tipodemesa1) && quedia[hora][j].substring(8,11).equals("LIB") ) {
                            contadormesa12 += 1;
                        }
                        if (contadormesa12>0){
                            disponible="si";
                        }


                    }}
                System.out.println("hay " + contadormesa12 + " mesas disponibles");

        }

        return  disponible;

    }



    public static String consultarlunes( String[][] lunes) {
        int contadorl = 63;


        String disponiblelunes = "si";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                if (lunes[i][j].substring(8, 11).equals("RES")) {
                    contadorl -= 1;
                }
            }
        }
        System.out.println("hay " + contadorl + " opciones disponibles");
        if (contadorl == 0) {
            disponiblelunes = "no";
        }
        return disponiblelunes;

    }


    static String consultarmartes( String[][] martes) {
        int contadorm = 63;

        String disponiblemartes = "si";
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                if ((martes[i][j].substring(8, 11).equals("RES"))) {
                    contadorm -= 1;
                }
           }

            if (contadorm == 0) {
                disponiblemartes = "no";
            }


        }
        System.out.println("hay " + contadorm + " mesas disponibles");
        return disponiblemartes;
    }


    static String consultarmiercoles( String[][] miercoles) {
        int contadormi = 63;


        String disponiblemiercoles = "si";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++)
                if ((miercoles[i][j].substring(8, 11).equals("RES"))) {
                    contadormi -= 1;

                }
        }
        System.out.println("hay " + contadormi + " mesas disponibles");

        if (contadormi == 0) {
            disponiblemiercoles = "no";
        }
        return disponiblemiercoles;

    }



    static String consultarjueves( String[][] jueves) {
        int contadorju = 63;


        String disponiblejueves = "si";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++)
                if ((jueves[i][j].substring(8, 11).equals("RES"))) {
                    contadorju -= 1;

                }


        }
        System.out.println("hay " + contadorju + " mesas disponibles");

        if (contadorju == 0) {
            disponiblejueves = "no";
        }
        return disponiblejueves;

    }


    static String consultarviernes( String[][] viernes) {
        int contadorvi = 63;


        String disponibleviernes = "si";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++){
                if (viernes[i][j].substring(8, 11).equals("RES")) {
                    contadorvi -= 1;
                }
            }
        }
        System.out.println("hay " + contadorvi + " opciones disponibles");

        if (contadorvi == 0) {
            disponibleviernes = "no";
        }
        return disponibleviernes;
    }


    public static int confirmaryreservar(String[][] quedia, int hora, String tipodemesa1){
        int contador=0;

        for (int i = hora; i < hora + 1; i++) {

            for (int j = 0; j < 9; j++) {


                if ( quedia[hora][j].substring(7,8).equals(tipodemesa1) && quedia[hora][j].substring(8,11).equals("LIB") ){
                    while (contador<1) {
                        contador += 1;
                        System.out.println("Usted Reservo la mesa : " + quedia[hora][j].substring(5,6));
                    }
                }
            }
        }

        return contador;}}

