import test.Child;
import test.Parent;
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


    }
}