# Ejercicio 1 Java – Introducción a Java

1. Prepara un menú que seleccione la ejecución de los diferentes ejercicios que se piden a continuación. Este menú se debe realizar con un switch.
2. Crea un método para todos y cada uno de los siguientes ejercicios. El método debe incorporar el calificador de acceso “public static'' y tener un nombre adecuado a lo que se solicita. La llamada al método se debe realizar desde el switch codificado en el ejercicio anterior. Los métodos a codificar deben realizar lo siguiente:
~~~
a. Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido. Los 5 números se deben almacenar en un array.

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
~~~
~~~
b. Leer 5 números y mostrarlos en orden inverso al introducido.

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
~~~
~~~
c. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.
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
~~~
~~~
d. Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.

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
~~~

~~~
e. Reciba como parámetro un texto y devuelva el texto invertido.

    public static void invertirTexto(String texto) {
        String invertido = new String();

        for (int i=texto.length()-1;i>=0;i=i-1) {
            invertido=invertido+texto.charAt(i);
        }

        System.out.println("El texto invertido es :");
        System.out.println(invertido);
    }
~~~
~~~
f. Reciba como parámetro un texto y lo devuelva sin espacios en blanco

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
~~~
~~~
g. Reciba como parámetro dos cadenas y las devuelva concatenadas.

    public static void unir(String texto, String texto2) {
        System.out.println(texto.concat(texto2));
    }
~~~
~~~
h. Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).

    public static void replace (String texto, String letra) {
        System.out.println(texto.replaceAll("[aeiou]", letra));
    }
~~~
~~~
i. Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la cadena (no devuelve nada el método).

    public static void codiASCII (String texto) {
        int ascii;
        System.out.println("El texto en ASCII: ");
        for (int i = 0; i<texto.length();i=i+1) {
            ascii = texto.charAt(i);
            System.out.print(ascii+" ");
        }
    }
~~~

