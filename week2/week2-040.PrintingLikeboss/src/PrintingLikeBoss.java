public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = amount;
        while (count > 0) {
            System.out.print("*");
            count--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = amount;
        while (count > 0) {
            System.out.print(" ");
            count--;
        }

    }

    public static void printTriangle(int size) {
        // 40.2
        int heightCount = size;
        int starCount = 1;
        int whitespaceCount = size - starCount;
        while (heightCount > 0) {
            printWhitespaces(whitespaceCount);
            printStars(starCount);
            starCount++;
            whitespaceCount--;
            heightCount--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int heightCount = height;
        int starCount = 1;
        int whitespaceCount = height - starCount;
        int standHeightCount = 2;
        int standWidthCount = 3;

        while (heightCount > 0) {
            printWhitespaces(whitespaceCount);
            printStars(starCount);
            starCount += 2;
            whitespaceCount--;
            heightCount--;
        }

        while (standHeightCount > 0){
            printWhitespaces(height - 2);
            printStars(standWidthCount);
            standHeightCount--;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
