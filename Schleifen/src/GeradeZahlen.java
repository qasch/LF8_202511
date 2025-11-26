public class GeradeZahlen {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            // nur wenn Zahl ohne Rest durch 2 teilbar ist
            // Modulo Operator %
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

// Modulo: Rest der **ganzzahligen** Division
// 2 % 2 = 0    (2/2 = 1 R 0)
// 13 % 2 = 1   (13/2 = 6 R 1)
// 111 % 2 = 1  (111/2 = 55 R 1)
// 123412341234123412341234123412341234 % 2 = 0
// 123412341234123412344123421343 % 2 = 1
// 123412341234 % 5 = 4
// 42341234123412342 % 4 = 2