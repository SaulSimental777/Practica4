package com.company;

import java.util.Scanner;
import java.util.Random;

class mexicano{
    public String curp="";
    public String RFC="";
    public String fecha;
    public String nombre;
    public String ap;
    public String am;
    public String estado;
    public String genero;

}

public class Pro {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int f=0;
        boolean salir=false;
        while(!salir) {

            System.out.println("1. Curp");
            System.out.println("2. RFC");
            System.out.println("3. Curp y RFC");
            System.out.println("4. Salir");
            f=sc.nextInt();

            Scanner sI = new Scanner(System.in);
            Scanner sI2 = new Scanner(System.in);
            mexicano n1 = new mexicano();
            mexicano n2 = new mexicano();
            Random random = new Random();
            int valor1 = random.nextInt(9 - 1) + 1;
            int valor2 = random.nextInt(9 - 1) + 1;
            int valor3 = random.nextInt(9 - 1) + 1;

            if(f==1 || f==3) {
                System.out.println("1. Curp");
                String curp = "";

                System.out.println("Ingrese su apellido Paterno: ");
                n1.ap = sI.nextLine();
                n1.ap = n1.ap.toUpperCase();

                System.out.println("Ingrese su Apellido Materno: ");
                n1.am = sI.nextLine();
                n1.am = n1.am.toUpperCase();

                System.out.println("Ingrese su nombre(s): ");
                n1.nombre = sI.nextLine();
                n1.nombre = n1.nombre.toUpperCase();

                System.out.println("Ingrese una fecha de nacimiento (DD/MM/AAAA): ");
                n1.fecha = sI.nextLine();
                n1.fecha = n1.fecha.toUpperCase();

                System.out.println("Ingrese su genero (H/M): ");
                n1.genero = sI.nextLine();
                n1.genero = n1.genero.toUpperCase();

                System.out.println("Ingrese su estado de nacimiento: ");
                n1.estado = sI.nextLine();
                n1.estado = n1.estado.toUpperCase();


                char[] cadenaap;
                cadenaap = n1.ap.toCharArray();
                curp = String.valueOf(cadenaap[0]);
                for (int j = 1; j < n1.ap.length(); j++) {
                    if (cadenaap[j] == 'A' || cadenaap[j] == 'E' || cadenaap[j] == 'I' || cadenaap[j] == 'O' || cadenaap[j] == 'U') {
                        curp = curp.concat(String.valueOf(cadenaap[j]));
                        j = n1.ap.length();
                    }
                }
                char[] cadenaam = new char[n1.am.length()];
                if (n1.am.length() != 0) {
                    cadenaam = n1.am.toCharArray();
                    curp = curp.concat(String.valueOf(cadenaam[0]));
                } else {
                    curp = curp.concat("X");
                }
                char[] cadenan;
                cadenan = n1.nombre.toCharArray();
                if (cadenan[0] == 'J' && cadenan[1] == 'O' && cadenan[2] == 'S' && cadenan[3] == 'E') {
                    if (n1.nombre.length() > 4) {
                        curp = curp.concat(String.valueOf(cadenan[5]));
                    } else {
                        curp = curp.concat(String.valueOf(cadenan[0]));
                    }
                } else {
                    if (cadenan[0] == 'M' && cadenan[1] == 'A' && cadenan[2] == 'R' && cadenan[3] == 'I' && cadenan[4] == 'A') {
                        if (n1.nombre.length() > 5) {
                            curp = curp.concat(String.valueOf(cadenan[6]));
                        }
                    } else {
                        curp = curp.concat(String.valueOf(cadenan[0]));
                    }
                }

                char[] cadenaf;
                cadenaf = n1.fecha.toCharArray();
                int dia = ((cadenaf[0] - 48) * 10) + (cadenaf[1] - 48);
                int mes = ((cadenaf[3] - 48) * 10) + (cadenaf[4] - 48);
                int an = ((cadenaf[8] - 48) * 10) + (cadenaf[9] - 48);
                if (an < 10) {
                    curp = curp.concat("0" + an);
                } else {
                    curp = curp.concat(String.valueOf(an));
                }
                if (mes < 10) {
                    curp = curp.concat("0" + mes);
                } else {
                    curp = curp.concat(String.valueOf(mes));
                }
                if (dia < 10) {
                    curp = curp.concat("0" + dia);
                } else {
                    curp = curp.concat(String.valueOf(dia));
                }

                curp = curp.concat(n1.genero);
                curp = switch (n1.estado) {
                    case "AGUASCALIENTES" -> curp.concat("AS");
                    case "BAJA CALIFORNIA" -> curp.concat("BC");
                    case "BAJA CALIFORNIA SUR" -> curp.concat("BS");
                    case "CAMPECHE" -> curp.concat("CC");
                    case "CHIAPAS" -> curp.concat("CS");
                    case "CHIHUAHUA" -> curp.concat("CH");
                    case "COAHUILA" -> curp.concat("CL");
                    case "COLIMA" -> curp.concat("CM");
                    case "DF" -> curp.concat("DF");
                    case "DURANGO" -> curp.concat("DG");
                    case "GUANAJUATO" -> curp.concat("GT");
                    case "GUERRERO" -> curp.concat("GR");
                    case "HIDALGO" -> curp.concat("HG");
                    case "JALISCO" -> curp.concat("JC");
                    case "ESTADO DE MEXICO" -> curp.concat("MC");
                    case "MICHOACAN" -> curp.concat("MN");
                    case "MORELOS" -> curp.concat("MS");
                    case "NAYARIT" -> curp.concat("NT");
                    case "NUEVO LEON" -> curp.concat("NL");
                    case "OAXACA" -> curp.concat("OC");
                    case "PUEBLA" -> curp.concat("PL");
                    case "QUERETARO" -> curp.concat("QT");
                    case "QUINTANA ROO" -> curp.concat("QR");
                    case "SAN LUIS POTOSI" -> curp.concat("SP");
                    case "SINALOA" -> curp.concat("SL");
                    case "SONORA" -> curp.concat("SR");
                    case "TABASCO" -> curp.concat("TC");
                    case "TAMAULIPAS" -> curp.concat("TS");
                    case "TLAXCALA" -> curp.concat("TL");
                    case "VERACRUZ" -> curp.concat("VZ");
                    case "YUCATAN" -> curp.concat("YN");
                    case "ZACATECAS" -> curp.concat("ZS");
                    default -> curp.concat("NE");
                };

                for (int i = 1; i < n1.ap.length(); i++) {
                    if (cadenaap[i] != 'A' && cadenaap[i] != 'E' && cadenaap[i] != 'I' && cadenaap[i] != 'O' && cadenaap[i] != 'U') {
                        curp = curp.concat(String.valueOf(cadenaap[i]));
                        i = n1.ap.length();
                    }
                }
                if (n1.am.length() != 0) {
                    for (int i = 1; i < n1.am.length(); i++) {
                        if (cadenaam[i] != 'A' && cadenaam[i] != 'E' && cadenaam[i] != 'I' && cadenaam[i] != 'O' && cadenaam[i] != 'U') {
                            int v = cadenaam[i];
                            if (v == 65533) {
                                curp = curp.concat("X");
                            } else {
                                curp = curp.concat(String.valueOf(cadenaam[i]));
                                i = n1.am.length();
                            }
                        }
                    }
                } else {
                    curp = curp.concat("X");
                }
                for (int i = 1; i < n1.nombre.length(); i++) {
                    if (cadenan[i] != 'A' && cadenan[i] != 'E' && cadenan[i] != 'I' && cadenan[i] != 'O' && cadenan[i] != 'U') {
                        curp = curp.concat(String.valueOf(cadenan[i]));
                        i = n1.nombre.length();
                    }
                }


                curp = curp.concat(String.valueOf(valor1));
                curp = curp.concat(String.valueOf(valor2));
                System.out.println("Su CURP es: " + curp);
            }
            ///////////////////////////////
            if(f==2||f==3) {
                System.out.println("2. RFC");
                String RFC = "";

                System.out.println("Ingrese su apellido Paterno: ");
                n2.ap = sI2.nextLine();
                n2.ap = n2.ap.toUpperCase();
                System.out.println("Ingrese su Apellido Materno: ");
                n2.am = sI2.nextLine();
                n2.am = n2.am.toUpperCase();
                System.out.println("Ingrese su nombre(s): ");
                n2.nombre = sI2.nextLine();
                n2.nombre = n2.nombre.toUpperCase();
                System.out.println("Ingrese una fecha de nacimiento (DD/MM/AAAA): ");
                n2.fecha = sI2.nextLine();
                n2.fecha = n2.fecha.toUpperCase();


                char[] cadenaapp;
                cadenaapp = n2.ap.toCharArray();
                RFC = String.valueOf(cadenaapp[0]);
                for (int j = 1; j < n2.ap.length(); j++) {
                    if (cadenaapp[j] == 'A' || cadenaapp[j] == 'E' || cadenaapp[j] == 'I' || cadenaapp[j] == 'O' || cadenaapp[j] == 'U') {
                        RFC = RFC.concat(String.valueOf(cadenaapp[j]));
                        j = n2.ap.length();
                    }
                }
                char[] cadenaamm;
                if (n2.am.length() != 0) {
                    cadenaamm = n2.am.toCharArray();
                    RFC = RFC.concat(String.valueOf(cadenaamm[0]));
                } else {
                    RFC = RFC.concat("X");
                }
                char[] cadenann;
                cadenann = n2.nombre.toCharArray();
                if (cadenann[0] == 'J' && cadenann[1] == 'O' && cadenann[2] == 'S' && cadenann[3] == 'E') {
                    if (n2.nombre.length() > 4) {
                        RFC = RFC.concat(String.valueOf(cadenann[5]));
                    } else {
                        RFC = RFC.concat(String.valueOf(cadenann[0]));
                    }
                } else {
                    if (cadenann[0] == 'M' && cadenann[1] == 'A' && cadenann[2] == 'R' && cadenann[3] == 'I' && cadenann[4] == 'A') {
                        if (n2.nombre.length() > 5) {
                            RFC = RFC.concat(String.valueOf(cadenann[6]));
                        }
                    } else {
                        RFC = RFC.concat(String.valueOf(cadenann[0]));
                    }
                }

                char[] cadenaff;
                cadenaff = n2.fecha.toCharArray();
                int dian = ((cadenaff[0] - 48) * 10) + (cadenaff[1] - 48);
                int mesm = ((cadenaff[3] - 48) * 10) + (cadenaff[4] - 48);
                int anm = ((cadenaff[8] - 48) * 10) + (cadenaff[9] - 48);
                if (anm < 10) {
                    RFC = RFC.concat("0" + anm);
                } else {
                    RFC = RFC.concat(String.valueOf(anm));
                }
                if (mesm < 10) {
                    RFC = RFC.concat("0" + mesm);
                } else {
                    RFC = RFC.concat(String.valueOf(mesm));
                }
                if (dian < 10) {
                    RFC = RFC.concat("0" + dian);
                } else {
                    RFC = RFC.concat(String.valueOf(dian));
                }


                RFC = RFC.concat(String.valueOf(valor1));
                RFC = RFC.concat(String.valueOf(valor2));
                RFC = RFC.concat(String.valueOf(valor3));
                System.out.println("Su RFC es: " + RFC);
            }
            if(f==4){
                salir=true;
            }
        }
    }


}