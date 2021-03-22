package co.edu.unipiloto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Paula Sabogal
 */
public class NameHandler {

    private String name;
    private String date;
    private int age;
    private String hour;

    public NameHandler() {
        name = null;
        date = null;
        age = 0;
        hour = null;

    }

    public String getHour() {
        Format f = new SimpleDateFormat("HH:mm");
        hour = f.format(new Date());
        return hour;
    }

    public void setHour(String hour) {

        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        LocalDate fechaNacimiento = LocalDate.parse(date);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        age = periodo.getYears();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
