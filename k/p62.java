class p62 {
    public static void main(String[] range) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Fetching Instruction " + (i + 1) * 25 + "%");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Decoding Instruction " + (i + 1) * 25 + "%");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Checking Address Bit " + (i + 1) * 25 + "%");
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("Executing Instruction " + (i + 1) * 25 + "%");
            }
        });
        t1.setPriority(1);
        t1.setPriority(8);
        t1.setPriority(3);
        t1.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
