class a {
    int vala;

    a(int w) {
        vala = w;
    }
}

class b extends a {
    int val1b, val2b;

    b(int p, int q, int w) {
        super(w);
        val1b = p;
        val2b = q;
    }
}

class c extends b {
    int val1c, val2c, val3c;

    c(int x, int y, int z, int p, int q, int w) {
        super(p, q, w);
        val1c = x;
        val2c = y;
        val3c = z;
    }

    void printvalues() {
        System.out.println("1 value of a " + vala);
        System.out.println("2 values of b " + val1b + " " + val2b);
        System.out.println("3 values of c " + val1c + " " + val2c + " " + val3c);
    }
}


class p41 {
    public static void main(String arg[]) {
        c ob = new c(1, 2, 3, 4, 5, 6);

        ob.printvalues();
    }
}