package TiposAvanzados;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TiposAvanzadosDoc {
    /**
     * Método principal de la aplicación.
     */
    public void PrintAdvancedTypes() {

        // ============================================================================
        // === BIGDECIMAL: IDEAL PARA FINANZAS ========================================
        // ============================================================================
        System.out.println("BigDecimal (finanzas):");

        // BigDecimal evita errores de precisión típicos de double
        BigDecimal precio = new BigDecimal("2500.75");
        BigDecimal iva = new BigDecimal("0.16");
        BigDecimal descuento = new BigDecimal("0.10");

        // Cálculo de IVA y descuento → precisión exacta
        BigDecimal conIva = precio.add(precio.multiply(iva));
        BigDecimal conDescuento = conIva.subtract(conIva.multiply(descuento));

        System.out.println("Precio base: " + precio);
        System.out.println("Con IVA (16%): " + conIva);
        System.out.println("Con descuento (10%): " + conDescuento);

        // Interés compuesto: montoFinal = monto * (1 + tasa)^años
        BigDecimal monto = new BigDecimal("100056415645465465456465150");
        BigDecimal tasa = new BigDecimal("0.05"); // 5% anual
        int anios = 10;
        BigDecimal montoFinal = monto.multiply((BigDecimal.ONE.add(tasa)).pow(anios));

        System.out.println("Interés compuesto (10 años, 5%): " + montoFinal + "\n");

        // ============================================================================
        // === BIGINTEGER: PARA NÚMEROS MUY GRANDES ==================================
        // ============================================================================
        System.out.println("BigInteger (números enormes):");

        int n = 30;
        BigInteger factorial = BigInteger.ONE;

        // Cálculo del factorial de 30 (que supera el límite de long)
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial de " + n + ": " + factorial + "\n");

        // ============================================================================
        // === LOCALDATE: FECHAS SIN HORA =============================================
        // ============================================================================
        System.out.println("LocalDate (fechas):");

        LocalDate hoy = LocalDate.now();
        LocalDate navidad = LocalDate.of(2025, 12, 25);

        // Period calcula diferencia en años, meses y días
        Period periodo = Period.between(hoy, navidad);

        System.out.println("Hoy: " + hoy);
        System.out.println("Navidad: " + navidad);
        System.out.println("Faltan: " +
                periodo.getMonths() + " meses y " +
                periodo.getDays() + " días\n");

        // ============================================================================
        // === LOCALDATETIME: FECHA + HORA ============================================
        // ============================================================================
        System.out.println("LocalDateTime (fecha y hora):");

        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime evento = LocalDateTime.of(2025, 10, 10, 15, 30);

        // Formato personalizado de fecha y hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Ahora: " + ahora.format(formato));
        System.out.println("Evento: " + evento.format(formato));

        // Duration calcula diferencia en horas/minutos/segundos
        Duration duracion = Duration.between(ahora, evento);

        System.out.println("Faltan " + duracion.toHours() + " horas (" + duracion.toDays() + " días)");
    }
}
