public class IOHelper
{
  public static boolean isValidYorN(String text) {
    return ("N".equals(text) || "Y".equals(text));
  }

  public static boolean validateRange(int value, int start, int end) {
    if (value < start || value > end) {
      System.out.printf("Value should be between %d and %d%n", start, end);
      return false;
    } else {
      return true;
    }
  }

  public static Integer tryParseInt(String str) {
    try {
      return Integer.parseInt(str);
    } catch(NumberFormatException e) {
      return null;
    }
  }
}
