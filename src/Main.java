import food.Sandwich;
import polygraphy.RoundGlyph;
import refcount.*;
import test.*;
import theater.Starship;
import vehicle.*;
import figures.*;
import music.*;
import rodents.*;

public class Main {
    private static final RandomShapeGenerator shapeGen
            = new RandomShapeGenerator();
    private static final RandomInstrumentGenerator instrumentGen
            = new RandomInstrumentGenerator();

    public static void ride(Cycle cycle) {
        cycle.ride();
    }

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for(Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {

        // Task 1
//        Unicycle unicycle = new Unicycle();
//        Bicycle bicycle = new Bicycle();
//        Tricycle tricycle = new Tricycle();
//
//        ride(unicycle);
//        ride(bicycle);
//        ride(tricycle);

        // Task 2
//        Shape[] shapes = new Shape[10];
//        for (int i = 0; i < shapes.length; i++){
//            shapes[i] = gen.next();
//        }
//        for (Shape shape : shapes){
//            shape.draw();
//        }

//        Instrument[] instruments = new Instrument[10];
//        for (int i = 0; i < instruments.length; i++){
//            instruments[i] = instrumentGen.next();
//        }
//        tuneAll(instruments);
//        for(Instrument instrument : instruments) {
//            System.out.println(instrument);
//        }

//        Rodent[] rodents = {
//            new Mouse(),
//            new Hamster(),
//            new Hamster(),
//            new Mouse()
//        };
//        for(Rodent rodent : rodents) {
//            rodent.run();
//            System.out.println(rodent);
//        }

//        Parent child = new Child();
//        child.fun1();

//        Sandwich sandwich = new Sandwich();

//        Hamster hamster = new Hamster();
//        hamster.dispose();
//        System.out.println();
//        Mouse mouse = new Mouse();
//        mouse.dispose();

//        Shared shared = new Shared();
//        Composing[] composings = {
//          new Composing(shared),
//          new Composing(shared),
//          new Composing(shared),
//          new Composing(shared),
//          new Composing(shared)
//        };
//        for(Composing c : composings)
//            c.dispose();

//        Color color = new Color("brown");
//        Rodent[] rodents = {
//            new Mouse(color),
//            new Hamster(color)
//        };
//        System.out.println();
//        for (Rodent rodent : rodents)
//            rodent.dispose();

//        new RoundGlyph(5);

//        var starship = new Starship();
//        starship.info();
//        starship.show();
//        starship.warning();
//        starship.show();
//        starship.error();
//        starship.show();

        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle triCycle = new Tricycle();
        Cycle[] vehicles = {
            unicycle,
            bicycle,
            triCycle
        };

        for(Cycle cycle : vehicles)
            cycle.balance();

        ((Unicycle)unicycle).balance();
        ((Bicycle)unicycle).bicycle();
        ((Tricycle)unicycle).triCycle();
    }
}