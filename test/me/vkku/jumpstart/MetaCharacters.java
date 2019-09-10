package me.vkku.jumpstart;

import static me.vkku.utils.RegExUtils.runTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MetaCharacters {

  @Test
  public void givenText_whenMatchesWithDot_thenShouldMatchAll() {
    int matches = runTest(".", "any-String");
    System.out.println(matches);
    assertTrue(matches > 0);
  }

  @Test
  public void givenRepeatedText_whenMatchesOnceWithDot_theMatchOnce() {
    int matches = runTest("any.", "anyany");
    assertTrue(matches > 0);
    assertEquals(matches, 1);
  }

  @Test
  public void givenNotRepeatedText_whenMatchesOnceWithDot_theMatchOnce() {
    int matches = runTest("any.", "anyNot");
    assertTrue(matches > 0);
    assertEquals(matches, 1);
  }

}
