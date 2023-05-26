package main.java.projects;

class MatrixCalculator {

  public String matrixToString(int[][] matrix) {
    /*
     * returns a stringified matrix (for integer matrix)
     */
    String matrixString = "";
    matrixString += "[";
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrixString += " " + matrix[i][j] + " ";
      }
      matrixString += "]\n[";
    }
    matrixString = matrixString.substring(0, matrixString.length() - 2);
    return matrixString;
  }

  public int[][] add(int[][] matrix_1, int[][] matrix_2) {
    int[][] out = new int[matrix_1.length][matrix_1[0].length];
    for (int i = 0; i < matrix_1.length; i++) {
      for (int j = 0; j < matrix_1[i].length; j++) {
        out[i][j] = matrix_1[i][j] + matrix_2[i][j];
      }
    }
    return out;
  }

  public int[][] subtract(int[][] matrix_1, int[][] matrix_2) {
    /*
     * returns the difference of the two matrices (i = j)
     */
    int[][] out = new int[matrix_1.length][matrix_1[0].length];
    for (int i = 0; i < matrix_1.length; i++) {
      for (int j = 0; j < matrix_1[i].length; j++) {
        out[i][j] = matrix_1[i][j] - matrix_2[i][j];
      }
    }
    return out;
  }

  public int[][] transpose_2x2(int[][] matrix) {
    /*
     * returns the transpose of a 2x2 matrix
     */
    int temp = matrix[0][1];
    matrix[0][1] = matrix[1][0];
    matrix[1][0] = temp;
    return matrix;
  }

  public int[][] transpose_3x3(int[][] matrix) {
    /*
     * returns the transpose of a 3x3 matrix
     */;
    int[][] out = matrix;
    int temp = 0;
    temp = out[0][1];
    out[0][1] = out[1][0];
    out[1][0] = temp;

    temp = out[0][2];
    out[0][2] = out[2][0];
    out[2][0] = temp;

    temp = out[1][2];
    out[1][2] = out[2][1];
    out[2][1] = temp;
    return out;

  }

  public int determinant_2x2(int[][] matrix) {
    /*
     * returns the determinant value of a 2x2 matrix
     */
    return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
  }

  public int determinant_3x3(int[][] matrix) {
    /*
     * returns the determinant value of a 3x3 matrix
     */
    return (matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
        - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
        + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])));

  }

  public int[][] multiply(int[][] matrix_1, int[][] matrix_2, int order) {
    /*
     * returns the product matrix of two matrices
     * Currently only working for square matrices (i = j)
     */
    int[][] product = new int[order][order];
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        for (int k = 0; k < order; k++) {
          product[i][j] += matrix_1[i][k] * matrix_2[k][j];
        }
      }
    }
    return product;
  }

  public int[][] multiplyScalar(int[][] matrix, int scalar) {
    /*
     * returns the matrix multiplied by a scalar(integer)
     */
    for (int i = 0; i++ < matrix.length;){
      for(int j = 0; j++ < matrix[i].length;) {
        matrix[i][j] *= scalar;
      }
    }
    return matrix;
  }

  public static int[][] minor(int[][] matrix, int row, int column) {
    int[][] minor = new int[matrix.length][matrix[0].length];
    int Index_row = 0;
    for (int i = 0; i < matrix.length; i++) {
      if (i != row) {
        int Index_column = 0;
        for (int j = 0; j < matrix[i].length; j++) {
          if (j != column) {
            minor[Index_row][Index_column] = matrix[i][j];
            Index_column++;
          }
        }
        Index_row++;
      }
    }
    return minor;
  }

  public int[][] cofactor(int[][] matrix) {
    /*
     * returns cofactor of a matrix
     * only works for square matrices (i = j)
     */
    int[][] cofactor = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        cofactor[i][j] = determinant_2x2(minor(matrix, i, j));
      }
    }
    cofactor[0][1] *= -1;
    cofactor[1][0] *= -1;
    cofactor[1][2] *= -1;
    cofactor[2][1] *= -1;
    return cofactor;
  }

  public int[][] adjoint(int[][] matrix) {
    /*
     * returns the adjoint of a matrix
     */
    return transpose_3x3(cofactor(matrix));
  }

  public String inverse(int[][] matrix) {
    /*
     * returns the inverse of a matrix
     */

    String inverse = "[";
    for (int i = 0; i < cofactor(matrix).length; i++) {
      for (int j = 0; j < cofactor(matrix)[i].length; j++) {
        inverse += " " + cofactor(matrix)[i][j] + "/" + determinant_3x3(matrix) + " ";
      }
      inverse += "]\n[";
    }
    inverse = inverse.substring(0, inverse.length() - 2);

    return inverse;
  }
}
