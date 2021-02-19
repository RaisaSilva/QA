package CalculadoraNextDayTest;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)

public class CalculadoraNextDayTest {

    private int hora;
    private int min;
    private int seg;
    private int dia;
    private String mes;
    private int a_o;

    public CalculadoraNextDayTest(int dia, String mes, int a_o,int hora, int min, int seg){
        this.dia = dia;
        this.mes = mes;
        this.a_o = a_o;
        this.hora = hora;
        this.min = min;
        this.seg = seg;

    }
    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{1, "enero", 1, 0, 0, 0, "1 de Enero 1 00:00:01"});
        objects.add(new Object[]{15, "julio", 200, 12, 30, 59, "15 de Julio 15 12:31:00"});
        objects.add(new Object[]{28, "febrero", 2021, 23, 59, 59, "1 de marzo 2021 :00:00"});
        objects.add(new Object[]{31, "diciembre", 2000, 23, 59, 59, "31 de diciembre 2001 00:00:00"});
        objects.add(new Object[]{1, "enero", -1, 0, 0, 0, "No es valido"});
        objects.add(new Object[]{4, "mayo", 2000, -1, 0, 0, "No es valido"});
        objects.add(new Object[]{30, "febrero", 1, 0, 0, 0, "No es valido"});
        objects.add(new Object[]{1, "septiembre", 2001, 0, -10, 0, "No es valido"});
        objects.add(new Object[]{1, "septiembre", 2001, 0, 10, -20, "No es valido"});
        objects.add(new Object[]{29, "febrero", 1, 0, 0, 0, "No es valid"});
        return objects;
    }
}

