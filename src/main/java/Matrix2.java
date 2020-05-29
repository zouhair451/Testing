/** 2020 **/

public class Matrix2
{

    private static double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

    public static void print(double[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }

    /*-----------------------------------addition------------------------------------------*/
    public static double[][] addition(double[][] firstMatrix, double[][] secondMatrix)
    {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
        for (int row = 0; row < result.length; row++)
        {
            for (int col = 0; col < result[row].length; col++)
            {
                result[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
            }
        }
        print(result);
        return result;
    }

    /*-----------------------------------subtraction------------------------------------------*/
    public static double[][] subtraction(double[][] firstMatrix, double[][] secondMatrix)
    {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
        for (int row = 0; row < result.length; row++)
        {
            for (int col = 0; col < result[row].length; col++)
            {
                result[row][col] = firstMatrix[row][col] - secondMatrix[row][col];
            }
        }
        print(result);
        return result;
    }

    /*-----------------------------------multiplication------------------------------------------*/
    public static double[][] multiply(double[][] firstMatrix, double[][] secondMatrix)
    {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++)
            {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }
        print(result);
        return result;
    }

    /*-----------------------------------division------------------------------------------*/
    public static double[][] division(double[][] firstMatrix, double[][] secondMatrix)
    {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = 0; i < secondMatrix.length; i++) {
                    result[row][col] += firstMatrix[row][i] * Math.pow(secondMatrix[i][col], -1);
                }
            }
        }
        print(result);
        return result;
    }

    /*-----------------------------------Palindrome------------------------------------------*/
    static boolean palindrome(String arr)
    {
        char[] chars = arr.toCharArray();
        int length = chars.length;
        for (int i = 0; i <= length / 2 && length != 0; i++) {
            if ( chars[i] != chars[length - i - 1]) {
                return true;
            }
            return false;
        }
        return false;
    }

    /*-----------------------------------Comparison------------------------------------------*/
    public static int comparison(double[][] firstMatrix, double[][] secondMatrix) {
        int result = 0;
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(firstMatrix[row][col] != secondMatrix[row][col]) {
                    result =-1;
                }
            }
        }
        return result;
    }


}