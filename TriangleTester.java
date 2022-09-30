class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c) return false;
        if (a + c <= b) return false;
        if (c + b <= a) return false;
        return true;
    }
}