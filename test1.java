class animal {
    void eat() {
        System.out.println("Eating ");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Barking ");
    }
}

class cat extends animal {
    void meaw() {
        System.out.println("Meawing");
    }
}

class test1 {
    public static void main(String[] args) {
        cat c = new cat();
        c.meaw();
        c.eat();
        dog d = new dog();
        d.bark();
        d.eat();
    }
}