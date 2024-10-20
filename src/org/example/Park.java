package org.example;
import java.time.LocalTime;
public class Park {
    String name;
    String address;
    public Park(String _name, String _address) {
        name = _name;
        address = _address;
    }
    public static class Attraction {
        String name;
        String startWork;
        String endWork;
        double price;
        public Attraction(String _name, String _startWork, String _endWork, double _price) {
            name = _name;
            startWork = _startWork;
            endWork = _endWork;
            price = _price;
        }
    }
}