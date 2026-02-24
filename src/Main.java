import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        // Lista para guardar el historial
        List<String> historial = new ArrayList<>();
        int opcion = 0;

        System.out.println("Bienvenido/a al convertidor de Moneda =)");

        while (opcion != 9) {
            String menu = """
                    \n--- Elija una opción válida ---
                    1) Dólar (USD) => Peso Argentino (ARS)
                    2) Peso Argentino (ARS) => Dólar (USD)
                    3) Dólar (USD) => Real Brasileño (BRL)
                    4) Real Brasileño (BRL) => Dólar (USD)
                    5) Dólar (USD) => Peso Colombiano (COP)
                    6) Peso Colombiano (COP) => Dólar (USD)
                    7) Dólar (USD) => Peso Chileno (CLP)
                    8) Ver Historial de Conversiones
                    9) Salir
                    *************************************************
                    """;
            System.out.println(menu);
            try {
                System.out.print("opcion");
                opcion = Integer.parseInt(lectura.nextLine);

                String baseCode = "";
                String targetCode = "";
                switch (opcion) {
                    case 1:
                        baseCode = "USD";
                        targetCode = "ARS";
                        break;
                    case 2:
                        baseCode = "ARS";
                        targetCode = "USD";
                        break;
                    case 3:
                        baseCode = "USD";
                        targetCode = "BRL";
                        break;
                    case 4:
                        baseCode = "BRL";
                        targetCode = "USD";
                        break;
                    case 5:
                        baseCode = "USD";
                        targetCode = "COP";
                        break;
                    case 6:
                        baseCode = "COP";
                        targetCode = "USD";
                        break;
                    case 7:
                        baseCode = "USD";
                        targetCode = "CLP";
                        break;
                    case 8:
                        System.out.println("\n--- Historial de Conversiones ---");
                        if (historial.isEmpty()) {
                            System.out.println("No hay converciones registradas aún");
                        } else {
                            for (String registro : historial) {
                                System.out.println(registro);
                            }
                        }
                        continue;
                    case 9:
                        System.out.println("Gracias por usar el conversor de monedas.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        continue;
                }
                if (opcion != 9) {
                    System.out.println("Ingrese el valor que desea convertir:");
                    try {
                        double cantidad = Double.parseDouble(lectura.nextLine());

                        Moneda moneda = consulta.buscarMoneda(baseCode, targetCode, cantidad);

                        System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]\n",
                                cantidad, baseCode, moneda.conversion_result(), targetCode);

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String registro = String.format("[%s] %.2f %s -> %.2f %s",
                                LocalDateTime.now().format(formatter),
                                cantidad, baseCode,
                                moneda.conversion_result(), targetCode);
                        historial.add(registro);

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor ingrese un número válido.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero para seleccionar la opción.");
            } catch (RuntimeException | JsonSyntaxException e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
        lectura.close();
    }
}