package com.ibm.project;

class Eye {
    public String color;
    public float power;

    public Eye() {
        this.color = "Brown";
        this.power = 0.0f;
    }

    public Eye(String color, float power) {
        this.color = color;
        this.power = power;
    }

    public void displayInfo() {
        System.out.println("Eye color: " + color + ", Power: " + power);
    }
}

class Human {
    public HumanEye leftEye;
    public HumanEye rightEye;

    public Human() {
        leftEye = new HumanEye("Black", 1.5f);
        rightEye = new HumanEye("Black", 1.5f);
    }

    // Static inner class: does not need an instance of Human to be created
    static class HumanEye extends Eye {
        static int count = 0;

        public HumanEye() {
            super();
            count++;
        }

        public HumanEye(String color, float power) {
            super(color, power);
            count++;
        }

        public void showDetails() {
            System.out.println("Eye Details: Color = " + color + ", Power = " + power);
        }

        public static void showCount() {
            System.out.println("Total HumanEyes created: " + count);
        }
    }
}

class Man extends Human {
    public void showEyes() {
        System.out.println("Man's Left Eye:");
        leftEye.showDetails();                                 //Also research about the static import
        System.out.println("Man's Right Eye:");
        rightEye.showDetails();
    }
}

public class staticInnerClass {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();

        man1.showEyes();
        man2.showEyes();

        // Using static method from static inner class
        Human.HumanEye.showCount();
    }
}
