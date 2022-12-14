/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Asis.negocio;

import javax.swing.JOptionPane;
import mx.itson.Asis.ui.Main;

/**
 * Contiene metodos para generar la CURP de un ciudadano
 *
 * @author Gabriel Leyva Esquivel
 *
 */
public class Operacion {

    /**
     * Este metodo recibira el String con el primer apellido y retornara los
     * caracteres para componer la CURP
     *
     * @param primerApellido que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarPrimerApellido(String primerApellido) {

        String apellidoTrim = primerApellido.toLowerCase().substring(0, 1);
        String apellidoTrim2 = primerApellido.toLowerCase().replaceAll("[qwrtypsdfghjklñmnbvcxz]", "").substring(0, 1);
        String primerApellido2 = apellidoTrim.concat(apellidoTrim2);

        return primerApellido2;
    }

    /**
     * Este metodo recibira el String con el segundo apellido y retornara los
     * caracteres para componer la CURP
     *
     * @param segundoApellido que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarSegundoApellido(String segundoApellido) {
        String segundoApellido1 = "";
        if (!segundoApellido.isEmpty()) {
            segundoApellido1 = segundoApellido.toLowerCase().substring(0, 1);
        } else if (segundoApellido.isEmpty()) {
            segundoApellido1 = "X";
        }

        return segundoApellido1;
    }

    /**
     * Este metodo recibira el String con el nombre y retornara los caracteres
     * para componer la CURP
     *
     * @param nombre que se procesara mediante los elementos que componen la
     * CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarNombre(String nombre) {

        String nombreDos = nombre.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
        String nombreFinal = "";
        if (nombre.contains(" ")) {
            String[] nombreSplit = nombreDos.split(" ");
            if (nombreSplit[0].equals("jose") || nombreSplit[0].equals("maria") | nombreSplit[1].equals("jose") || nombreSplit[1].equals("maria")) {
                nombreFinal = nombreSplit[1].substring(0, 1);
            } else {
                nombreFinal = nombreSplit[0].substring(0, 1);
            }

        } else {
            nombreFinal = nombre.toLowerCase().substring(0, 1);
        }

        return nombreFinal;
    }

    /**
     * Este metodo recibira el String con el año y retornara los caracteres para
     * componer la CURP
     *
     * @param ano que se procesara mediante los elementos que componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarAno(String ano) {
        String ano2 = ano.substring(2, 4);

        return ano2;
    }

    /**
     * Este metodo recibira el String con el genero y retornara los caracteres
     * para componer la CURP
     *
     * @param genero que se procesara mediante los elementos que componen la
     * CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarGenero(String genero) {
        String genero2 = "";
        if (genero.equals("Masculino")) {
            genero2 = "h";
        } else {
            genero2 = "m";
        }
        return genero2;
    }

    /**
     * Este metodo recibira el String con la entidad federativa y retornara los
     * caracteres para componer la CURP
     *
     * @param entidadFederativa que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarEntidadFederativa(String entidadFederativa) {
        String entidadFederativa2 = new String();

        switch (entidadFederativa) {
            case "AGUASCALIENTES":
                entidadFederativa2 = "AS";
                break;
            case "BAJA CALIFORNIA":
                entidadFederativa2 = "BC";
                break;
            case "BAJA CALIFORNIA SUR":
                entidadFederativa2 = "BS";
                break;
            case "CAMPECHE":
                entidadFederativa2 = "CC";
                break;
            case "COAHUILA DE ZARAGOZA":
                entidadFederativa2 = "CL";
                break;
            case "COLIMA":
                entidadFederativa2 = "CM";
                break;
            case "CHIAPAS":
                entidadFederativa2 = "CS";
                break;
            case "CHIHUAHUA":
                entidadFederativa2 = "CH";
                break;
            case "DISTRITO FEDERAL":
                entidadFederativa2 = "DF";
                break;
            case "DURANGO":
                entidadFederativa2 = "DG";
                break;
            case "GUANAJUATO":
                entidadFederativa2 = "GT";
                break;
            case "GUERRERO":
                entidadFederativa2 = "GR";
                break;
            case "HIDALGO":
                entidadFederativa2 = "HG";
                break;
            case "JALISCO":
                entidadFederativa2 = "JC";
                break;
            case "MEXICO":
                entidadFederativa2 = "MC";
                break;
            case "MICHOACAN DE OCAMPO":
                entidadFederativa2 = "MN";
                break;
            case "MORELOS":
                entidadFederativa2 = "MS";
                break;
            case "NAYARIT":
                entidadFederativa2 = "NT";
                break;
            case "NUEVO LEON":
                entidadFederativa2 = "NL";
                break;
            case "OAXACA":
                entidadFederativa2 = "OC";
                break;
            case "PUEBLA":
                entidadFederativa2 = "PL";
                break;
            case "QUERERTARO":
                entidadFederativa2 = "QT";
                break;
            case "QUINTANA ROO":
                entidadFederativa2 = "QR";
                break;
            case "SAN LUIS POTOSI":
                entidadFederativa2 = "SP";
                break;
            case "SINALOA":
                entidadFederativa2 = "SL";
                break;
            case "SONORA":
                entidadFederativa2 = "SR";
                break;
            case "TABASCO":
                entidadFederativa2 = "TC";
                break;
            case "TAMAULIPAS":
                entidadFederativa2 = "TS";
                break;
            case "TLAXCALA":
                entidadFederativa2 = "TL";
                break;
            case "VERACRUZ DE IGNACIO DE LA LLAVE":
                entidadFederativa2 = "VZ";
                break;
            case "YUCATAN":
                entidadFederativa2 = "YN";
                break;
            case "ZACATECAS":
                entidadFederativa2 = "ZS";
                break;

            case "NACIDO EN EL EXTRANJERO":
                entidadFederativa2 = "NE";
                break;
            default:
                break;
        }
        return entidadFederativa2;
    }

    /**
     * Este seleccionará la primer consonante del primero apellido (No inicial)
     * y retornara los caracteres para componer la CURP
     *
     * @param consonantePrimera que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarPrimeraConsonante(String consonantePrimera) {
        String consonantePrimera2 = "";
        consonantePrimera = consonantePrimera.toLowerCase();
        if (consonantePrimera.startsWith("a") | consonantePrimera.startsWith("e") | consonantePrimera.startsWith("i") | consonantePrimera.startsWith("o") | consonantePrimera.startsWith("u")) {
            consonantePrimera2 = consonantePrimera.toLowerCase().replaceAll("[aeiou]", "").substring(0, 1);
        } else if (consonantePrimera.isEmpty()) {
            consonantePrimera2 = "X";
        } else {
            consonantePrimera2 = consonantePrimera.toLowerCase().replaceAll("[aeiou]", "").substring(1, 2);
        }
        return consonantePrimera2;
    }

    /**
     * Este seleccionará la primer consonante del segundo apellido (No inicial)
     * y retornara los caracteres para componer la CURP
     *
     * @param consonanteSegunda que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarSegundaConsonante(String consonanteSegunda) {
        String consonanteSegunda2 = "";
        consonanteSegunda = consonanteSegunda.toLowerCase();
        if (consonanteSegunda.startsWith("a") | consonanteSegunda.startsWith("e") | consonanteSegunda.startsWith("i") | consonanteSegunda.startsWith("o") | consonanteSegunda.startsWith("u")) {
            consonanteSegunda2 = consonanteSegunda.toLowerCase().replaceAll("[aeiou]", "").substring(0, 1);
        } else if (consonanteSegunda.isEmpty()) {
            consonanteSegunda2 = "X";
        } else {
            consonanteSegunda2 = consonanteSegunda.toLowerCase().replaceAll("[aeiou]", "").substring(1, 2);
        }

        return consonanteSegunda2;
    }

    /**
     * Este seleccionará la consonante interna (No inicial) del primer apellido
     * y retornara los caracteres para componer la CURP
     *
     * @param consonanteInterna que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarConsonanteInterna(String consonanteInterna) {
        String consonanteInterna2 = "";

        consonanteInterna = consonanteInterna.toLowerCase();
        if (consonanteInterna.startsWith("a") | consonanteInterna.startsWith("e") | consonanteInterna.startsWith("i") | consonanteInterna.startsWith("o") | consonanteInterna.startsWith("u")) {
            consonanteInterna2 = consonanteInterna.toLowerCase().replaceAll("[aeiou]", "").substring(0, 1);

        } else {
            consonanteInterna2 = consonanteInterna.toLowerCase().replaceAll("[aeiou]", "").substring(1, 2);
        }

        return consonanteInterna2;

    }

    /**
     * Este metodo validará si se cumple la condicion de haber nacido en el año
     * 1999 y retornara los caracteres para componer la CURP
     *
     * @param fechaNacimiento que se procesara mediante los elementos que
     * componen la CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarFechaNacimiento(String fechaNacimiento) {
        Double fechaNacimiento2 = Double.parseDouble(fechaNacimiento);
        String fechaNacimiento3 = "";
        if (fechaNacimiento2 >= 2000) {
            fechaNacimiento3 = "A";
        } else {
            fechaNacimiento3 = "0";
        }

        return fechaNacimiento3;
    }

    /**
     * Este metodo genera el valor "1" y retornara los caracteres para componer
     * la CURP
     *
     * @param valorUno que se procesara mediante los elementos que componen la
     * CURP
     * @return String procesada mediante los elementos que componen la CURP
     */
    public String agregarValorUno() {
        String uno = "1";
        return uno;
    }

    public boolean validarNumeros(char validar) {
        if (Character.isDigit(validar)) {

            return true;
        } else {
            
            return false;
        }

    }

    public boolean validarLetras(char validar) {
        if (Character.isLetter(validar)) {
            return true;
        } else {
            return false;
        }
    }

}
