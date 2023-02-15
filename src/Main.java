import java.util.Scanner;
public class Main {
    public static Scanner entrada = new Scanner (System.in);

    public static void main (String[] args) {
        int opcio;
        String texto = new String();
        String texto2 = new String();
        System.out.println("**********************************************************");
        System.out.println("****************  ELIJA UNA OPCIÓN  **********************");
        System.out.println("**********************************************************\n");
        System.out.println("* 1. IMPRIMIR 5 NUMEROS                                  *");
        System.out.println("* 2. INVERTIR 5 NUMEROS                                  *");
        System.out.println("* 3. MEDIA DE NUMEROS POSITIVOS,NEGATIVOS Y CONTEO DE 0s *");
        System.out.println("* 4. CONTAR CARACTERES DE  UN TEXTO                      *");
        System.out.println("* 5. INVERTIR UN TEXTO                                   *");
        System.out.println("* 6. ELIMINAR ESPACIOS DE UN TEXTO                       *");
        System.out.println("* 7. UNIR 2 CADENAS                                      *");
        System.out.println("* 8. SUBSTISTUIR VOCALES POR VOCAL INTRODUCIDA           *");
        System.out.println("* 9. MOSTRAR CADENA EN ASCII                             *");
        System.out.println("**********************************************************");

        opcio= entrada.nextInt();
        entrada.nextLine();

        switch (opcio) {
            case 1:
                introducirNum();
                break;
            case 2:
                invertNumero();
                break;
            case 3:
                media();
                break;
            case 4:
                System.out.println("Introduzca el texto: ");
                texto= entrada.nextLine();
                conteoCaracter(texto);
                break;
            case 5:
                System.out.println("Introduzca el texto a invertir:");
                texto= entrada.nextLine();
                invertirTexto(texto);
                break;
            case 6:
                System.out.println("Introduzca el texto a eliminar los espacios:");
                texto= entrada.nextLine();
                sinEspacio(texto);
                break;
            case 7:
                System.out.println("Introduzca el primer texto a unir:");
                texto= entrada.nextLine();
                System.out.println("Introduzca el segundo texto a unir:");
                texto2= entrada.nextLine();
                unir(texto,texto2);
                break;
            case 8:
                System.out.println("Introduzca el texto:");
                texto= entrada.nextLine();
                System.out.println("Introduzca la vocal a remplazar por las vocales:");
                texto2= entrada.nextLine();
                replace(texto,texto2);
                break;
            case 9:
                System.out.println("Introduza el texto para convertir  a ASCII:");
                texto= entrada.nextLine();
                codiASCII(texto);
                break;
        }

    }

    //switch 1
    public static void introducirNum() {
        int[] numeros = new int [5];

        for (int i=0; i<numeros.length;i++) {
            System.out.print("Introduzca un numero: ");
            numeros[i]= entrada.nextInt();
        }
        entrada.nextLine();

        System.out.println("La lista de numeros: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }


    }


    //switch 2
    public static void invertNumero() {
        int[] numeros = new int [5];

        for (int i=0; i<numeros.length;i++) {
            System.out.print("Introduzca numero: ");
            numeros[i]= entrada.nextInt();
        }
        entrada.nextLine();

        System.out.println("La lista de los numeros: ");
        for (int i=numeros.length-1; i>=0; i--) {
            System.out.print(numeros[i]+" ");
        }
    }

    //switch 3
    public static void media() {
        int[] numeros = new int[5];
        int mediapositivos = 0, indicepositivos = 0, medianegativos = 0, indicenegativos = 0, indicezeros = 0;

        for (int i = 0; i<5; i=i+1) {
            System.out.println("Introduzca numero: ");
            numeros[i]= entrada.nextInt();
        }

        for (int i = 0; i<5; i = i+1) {
            if (numeros[i]<0) {
                medianegativos = medianegativos + numeros[i];
                indicenegativos = indicenegativos +1;
            }else if (numeros[i]>0) {
                mediapositivos = mediapositivos + numeros[i];
                indicepositivos = indicepositivos +1;
            }else {
                indicezeros = indicezeros + 1;
            }
        }

        mediapositivos=mediapositivos/indicepositivos;
        medianegativos=medianegativos/indicenegativos;

        System.out.println("La media de los positivos es : "+mediapositivos);
        System.out.println("La media de los negativos es : "+medianegativos);
        System.out.println("La cantidad de zeros es : "+indicezeros);
    }

    //switch 4
    public static void conteoCaracter(String texto) {
        String letrasmin = "abcdefghijklmnopqrstuvwxyz";
        String letrasmayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int indici=0;

        for (int i=0; i<texto.length();i=i+1) {
            if (letrasmin.contains(texto.substring(i,i+1))||letrasmayus.contains(texto.substring(i,i+1))){
                indici = indici+1;
            }
        }
        System.out.println("La frase introducida cuenta con  "+indici+" caracteres.");

    }

    //switch 5
    public static void invertirTexto(String texto) {
        String invertido = new String();

        for (int i=texto.length()-1;i>=0;i=i-1) {
            invertido=invertido+texto.charAt(i);
        }

        System.out.println("El texto invertido es :");
        System.out.println(invertido);
    }

    //switch 6
    public static void sinEspacio(String texto) {
        String sinEspacio = new String();

        for (int i=0;i<texto.length();i=i+1) {
            if (texto.charAt(i)!=' ') {
                sinEspacio=sinEspacio+texto.charAt(i);
            }
        }

        System.out.println("El texto sin espacios es :");
        System.out.println(sinEspacio);
    }

    //switch 7
    public static void unir(String texto, String texto2) {
        System.out.println(texto.concat(texto2));
    }

    //switch 8
    public static void replace (String texto, String letra) {
        System.out.println(texto.replaceAll("[aeiou]", letra));
    }

    //switch 9
    public static void codiASCII (String texto) {
        int ascii;
        System.out.println("El texto en ASCII: ");
        for (int i = 0; i<texto.length();i=i+1) {
            ascii = texto.charAt(i);
            System.out.print(ascii+" ");
        }
    }
}
