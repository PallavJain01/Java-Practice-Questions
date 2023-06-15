package main.java.projects;

class MatrixCalculator {

  /**
   * @param integerMatrix
   * @return matrix in string format
   */
  public String matrixToString(int[][] integerMatrix) {
    String matrixString = "";
    matrixString += "[";
    for (int i = 0; i < integerMatrix.length; i++) {
      for (int j = 0; j < integerMatrix[i].length; j++) {
        matrixString += " " + integerMatrix[i][j] + " ";
      }
      matrixString += "]\n[";
    }
    matrixString = matrixString.substring(0, matrixString.length() - 2);
    return matrixString;
  }

  /**
   * @param floatMatrix
   * @return matrix in string format
   */
  public String matrixToString(float[][] floatMatrix) {
    String matrixString = "";
    matrixString += "[";
    for (int i = 0; i < floatMatrix.length; i++) {
      for (int j = 0; j < floatMatrix[i].length; j++) {
        matrixString += " " + floatMatrix[i][j] + " ";
      }
      matrixString += "]\n[";
    }
    matrixString = matrixString.substring(0, matrixString.length() - 2);
    return matrixString;
  }

  /**
   * 
   * @param matrix_1
   * @param matrix_2
   * @return sum of matrices
   */
  public int[][] add(int[][] matrix_1, int[][] matrix_2) {
    int[][] out = new int[matrix_1.length][matrix_1[0].length];
    for (int i = 0; i < matrix_1.length; i++) {
      for (int j = 0; j < matrix_1[i].length; j++) {
        out[i][j] = matrix_1[i][j] + matrix_2[i][j];
      }
    }
    return out;
  }

  /**
   * 
   * @param matrix_1
   * @param matrix_2
   * @return difference of matrices
   */
  public int[][] subtract(int[][] matrix_1, int[][] matrix_2) {
    int[][] out = new int[matrix_1.length][matrix_1[0].length];
    for (int i = 0; i < matrix_1.length; i++) {
      for (int j = 0; j < matrix_1[i].length; j++) {
        out[i][j] = matrix_1[i][j] - matrix_2[i][j];
      }
    }
    return out;
  }

  /**
   * 
   * @param matrix
   * @return transpose of matrix
   */
  public int[][] transpose(int[][] matrix) {
    int[][] out = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        out[i][j] = matrix[j][i];
      }
    }
    return out;
  }

  /**
   * 
   * @param matrix of order 2
   * @return determinant of a 2x2 matrix
   */
  public int determinant_2x2(int[][] matrix) {
    return ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
  }

  /**
   * @param matrix of order 3
   * @return determinant of 3x3 matrix
   */
  public int determinant_3x3(int[][] matrix) {
    return (matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
          - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
          + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])));
  }

  /**
   * 
   * @param matrix_1
   * @param matrix_2
   * @param order    of matrix
   * @return product of matrices
   */
  public int[][] multiply(int[][] matrix_1, int[][] matrix_2, int order) {
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

  /**
   * 
   * @param matrix
   * @param scalar to be multiplied
   * @return multiplied matrix
   */
  public int[][] multiplyScalar(int[][] matrix, int scalar) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] *= scalar;
      }
    }
    return matrix;
  }

  /**
   * 
   * @param matrix
   * @param row
   * @param column
   * @return minor matrix of specified rows and columns
   */
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

  /**
   *
   * @param matrix
   * @return cofactor matrix
   */
  public int[][] cofactor(int[][] matrix) {
    int[][] cofactor = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        cofactor[i][j] = determinant_2x2(minor(matrix, i, j));
      }
    }
    for (int i = 0; i < cofactor.length; i++) {
      for (int j = 0; j < cofactor[i].length; j++) {
        if ((i + j) % 2 == 1) {
          cofactor[i][j] *= -1;
        }
      }
    }
    return cofactor;
  }

  /**
   * 
   * @param matrix
   * @return adjoint of matrix
   */
  public int[][] adjoint(int[][] matrix) {
    return transpose(cofactor(matrix));
  }

  /**
   * 
   * @param matrix
   * @return Inverse of matrix
   */
  public float[][] inverse(int[][] matrix) {
    float[][] inverse = new float[matrix.length][matrix[0].length];
    int determinant = determinant_3x3(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        inverse[i][j] = adjoint(matrix)[i][j] / determinant;
      }
    }
    return inverse;
  }
}
