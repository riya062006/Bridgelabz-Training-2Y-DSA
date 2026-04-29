class DirectorySizeRecursion {

    static int size() {
        int src_main = 100;
        int src_utils = 50;
        int docs_readme = 10;
        int guides_pdf = 200;
        int config = 20;

        int src = src_main + src_utils;
        int guides = guides_pdf;
        int docs = docs_readme + guides;

        return src + docs + config;
    }

    public static void main(String[] args) {
        System.out.println(size() + " KB");
    }
}