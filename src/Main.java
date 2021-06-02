import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Cadet person = new Cadet("Andy Guo", "password", "WO2", "Flight commander");
        System.out.println(person);
        System.out.println(person.getEmail());
        System.out.println(person.getPassword());

        person.addSummerCourse("Survival instructor");
        System.out.println(Arrays.toString(person.getSummerTraining()));

        Officer officer = new Officer("Paul Yu", "password", "Maj", "CO", 50000);
        System.out.println(officer);
        System.out.println(officer.getSalary());

        Cadet person2 = new Cadet("Bob smith", "pw", "Cdt", "Cadet");
        Cadet person3 = new Cadet("Lucas Guo", "pw", "Sgt", "Cadet");
        Cadet person4 = new Cadet("Billy Bob", "pw", "Cpl", "Cadet");
        Cadet person5 = new Cadet("Vincent Guo", "pw", "LAC", "Cadet");

        Flight flight = new Flight("Falcon", new Cadet[]{person2, person3, person4}, person);
        flight.addCadet(person5);
        flight.removeCadet(2);

        Cadet fcomm = new Cadet("Bobby Joe", "pw", "FSgt", "Flight commander");
        Cadet cadet = new Cadet("Bill Smith", "pw", "Cdt", "Cadet");
        Flight flight2 = new Flight("Polaris", new Cadet[]{cadet}, fcomm);

        Cadet chief = new Cadet("Hanshu Pu", "pw", "WO1", "Chief");
        Officer officer2 = new Officer("Gilda Kato", "pw", "CI", "Officer", 25000);

        Squadron globemaster = new Squadron(8, "Globemaster", new Flight[]{flight}, chief, new Officer[]{officer2}, officer);
        flight2.addCadet(person4);
        globemaster.removeOfficer(0);
        globemaster.addFlight(flight2);
        globemaster.removeFlight(0);
        globemaster.removeFlight(0);
        System.out.println("\n \n" + globemaster);
    }
}