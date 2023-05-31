class robot {
}

class robotA extends robot {
}

class robotB extends robot implements Locomotion {
    public void forward() {
        System.out.println("robotB move forward");
    }

    public void reverse() {
        System.out.println("robotB take reverse");
    }

    public void stop() {
        System.out.println("robotB stop!!");
    }
}

class robotC extends robot implements Locomotion, sound {
    public void forward() {
        System.out.println("robotC move forward");
    }

    public void reverse() {
        System.out.println("robotC take reverse");
    }

    public void stop() {
        System.out.println("robotC stop!!");
    }

    public void beep() {
        System.out.println("robotC beep beep!!");
    }
}

class robotA1 extends robotA implements sound {
    public void beep() {
        System.out.println("robotA1 beep beep!!");
    }
}

class robotB1 extends robotB implements sound {
    public void beep() {
        System.out.println("robotB1 beep beep!!");
    }
}

class robotB2 extends robotB {
}

class robotC1 extends robotC {
}

interface Locomotion {
    public void forward();

    public void reverse();

    public void stop();
}

interface sound {
    public void beep();
}

public class p42 {
    public static void main(String arg[]) {
        robot[] s = new robot[7];
        s[0] = new robotA();
        s[1] = new robotB();
        s[2] = new robotC();
        s[3] = new robotA1();
        s[4] = new robotB1();
        s[5] = new robotB2();
        s[6] = new robotC1();
        for (robot si : s) {
            try {
                sound a = (sound) si;
                a.beep();
            } catch (java.lang.ClassCastException e) {
                System.out.println("beep does not exit for " + si.getClass().getName());
            }
        }
    }
}