class animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends animal {
    void bark() {
        System.out.println("Barking");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping");
    }
}

class test {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}