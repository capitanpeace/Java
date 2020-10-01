package homework2_2;



public class Main {

    public static void main(String[] args) {
	String b ="10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
	String[][] arr= convertStringToArray(b);
        System.out.println(calculate(arr));
	 
    }
    static String[][] convertStringToArray(String b)  {
        String k= b + "\n";
        for (int i=0,space=0,n=0;i<k.length();i++) {
            if (k.charAt(i) == ' ') space++;
            if (k.charAt(i) == '\n') {
                if (space == 3) space = 0;
                else throw new ArithmeticException("размер матрицы, полученной из строки, не равен 4x4");
            }




            }

        int length= b.split("\n").length;
        String[][] result = new String[length][length];
        String[] clearN = b.split("\n");

        for (int i = 0; i < length; i++) {
            String[] clearSpaces = clearN[i].split(" ");
            for (int j = 0; j < length; j++) {
                result[i][j] = clearSpaces[j];
            }
        }

        return result;
    }

    static int calculate(String[][] b) {
        int sum = 0;

        for (String[] b1 : b) {
            for (String b2 : b1) {
                try {
                    sum += Integer.parseInt(b2);
                } catch (NumberFormatException e) {
                    System.out.println("в одной из ячеек полученной матрицы не число");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }

        return sum / 2;
    }
}

