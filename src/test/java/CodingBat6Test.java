import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingBat6Test {

  static final int[][] input = {
      {1, 2, 6},
      {6, 1, 2, 3},
      {13, 6, 1, 2, 3},
      {13, 6, 1, 2, 6},
      {3, 2, 1},
      {3, 6, 1},
      {3, 6},
      {6},
      {3},
      {5, 6},
      {5, 5},
      {1, 2, 3, 4, 6},
      {1, 2, 3, 4}
  };

  static final boolean[] output = {
      true,
      true,
      false,
      true,
      false,
      false,
      true,
      true,
      false,
      true,
      false,
      true,
      false
  };


  @Test
  void firstLast6() {
    for (int i = 0; i < output.length; i++) {
      boolean expected6 = output[i];
      boolean actual = CodingBat6.firstLast6(input[i]);
      assertEquals(expected6, actual);
    }

  }

}
