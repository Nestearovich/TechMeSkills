package com.example.lib;

public class InterfaceandObstraction {

    public static void main(String[] args){

    }
}
abstract class Bird {

    abstract void walk();

}
interface IFlyingBird {
    void fly();
}


class Crow extends Bird implements IFlyingBird {

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}

class Popugai extends Bird {

    @Override
    void walk() {

    }
}


class Penguin extends Bird {

    @Override
    void walk() {

    }
}

