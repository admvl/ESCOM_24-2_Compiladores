// (a)

interface A {
    void print() [ };
}

// (b)

abstract interface A extends I1, I2 {
    abstract void print() { };
}

// (c)

abstract interface A {
    print();
}

// (d)

interface A {
    void print();
}
