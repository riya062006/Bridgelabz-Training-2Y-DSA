class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 100000;
        long t1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();

        for (int i = 0; i < n; i++) sb1.append("hello");

        long t2 = System.nanoTime();

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < n; i++) sb2.append("hello");

        long t3 = System.nanoTime();

        System.out.println("Buffer time: " + (t2 - t1));
        System.out.println("Builder time: " + (t3 - t2));
    }
}