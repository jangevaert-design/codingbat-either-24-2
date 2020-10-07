public class Either24_2 {
  public boolean either24(int[] nums) {
    boolean two = false;
    boolean four = false;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        two = true;
      }
      if (nums[i] == 4 && nums[i + 1] == 4) {
        four = true;
      }
    }
    return two ^ four;
  }
// ^ is the XOR operator and is equivalent to (two AND !four) - or (!two and four) -.
// otherwise said the ^ take two booleans and returns true only and only if the operands
// are different.
}
