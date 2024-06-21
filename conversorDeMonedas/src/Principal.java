import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        int monto= 0;
        float saldoFinal = 0;
        String formatoSaldo = String.valueOf(0);
        DecimalFormat df = new DecimalFormat("0.00");


        //Ciclo del menú
        String menu = """
                ***********************************************
                Buen día, elija el número de la opción en la moneda que desea la equivalencia:                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Peso mexicano
                4) Peso mexicano => Dólar
                5) Dólar => Euro
                6) Euro => Dólar
                7) Salir
                **********************************************                        
                """;
        Scanner teclado = new Scanner(System.in);
        //

        while(opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    String monedaPrincipal = "USD";
                    String monedaFinal = "ARS";
                    ConsultaRate consulta = new ConsultaRate();
                    Moneda moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 2:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    monedaPrincipal = "ARS";
                    monedaFinal = "USD";
                    consulta = new ConsultaRate();
                    moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 3:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    monedaPrincipal = "USD";
                    monedaFinal = "MXN";
                    consulta = new ConsultaRate();
                    moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 4:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    monedaPrincipal = "MXN";
                    monedaFinal = "USD";
                    consulta = new ConsultaRate();
                    moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 5:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    monedaPrincipal = "USD";
                    monedaFinal = "EUR";
                    consulta = new ConsultaRate();
                    moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 6:
                    System.out.println("\n¿Qué cantidad deseacambiar?");
                    monto = teclado.nextInt();
                    monedaPrincipal = "EUR";
                    monedaFinal = "USD";
                    consulta = new ConsultaRate();
                    moneda = consulta.cambioPeso(monedaPrincipal, monedaFinal);
                    saldoFinal = moneda.conversion_rate()*monto;
                    formatoSaldo = df.format(saldoFinal);
                    System.out.println("\n" +monto+" en ["+monedaPrincipal+ "] son "+formatoSaldo+" en [" +monedaFinal+ "]");
                    break;
                case 7:
                    System.out.println("Gracias por usar el servicio de cambio, tenga buen día");
                    break;
                default:
                    System.out.println("Debe escribir un número del 1 al 7");
            }
        }


    }
}
