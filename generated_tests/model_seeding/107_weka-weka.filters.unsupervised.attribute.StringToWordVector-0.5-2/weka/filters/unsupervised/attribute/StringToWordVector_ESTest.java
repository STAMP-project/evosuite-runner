/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:15:14 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.filters.AllFilter;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.StringToWordVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringToWordVector_ESTest extends StringToWordVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 99;
      StringToWordVector stringToWordVector0 = new StringToWordVector(99);
      stringToWordVector0.minTermFreqTipText();
      stringToWordVector0.stopwordsTipText();
      stringToWordVector0.getLowerCaseTokens();
      stringToWordVector0.setMinTermFreq(0);
      SelectedTag selectedTag0 = mock(SelectedTag.class, new ViolatedAssumptionAnswer());
      doReturn((Tag) null).when(selectedTag0).getSelectedTag();
      doReturn(stringToWordVector0.TAGS_FILTER).when(selectedTag0).getTags();
      // Undeclared exception!
      try { 
        stringToWordVector0.setNormalizeDocLength(selectedTag0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.StringToWordVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringToWordVector stringToWordVector0 = new StringToWordVector(2511);
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      stringToWordVector0.setAttributeIndicesArray(intArray0);
      Filter.makeCopies(stringToWordVector0, 2);
      AllFilter allFilter0 = new AllFilter();
      String string0 = "st?L";
      String string1 = ":Qq^DAI?YevW4~;,$:>";
      Instances instances0 = null;
      Instances instances1 = null;
      try {
        instances1 = new Instances((Instances) null, 1156);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringToWordVector stringToWordVector0 = new StringToWordVector();
      stringToWordVector0.normalizeDocLengthTipText();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringToWordVector stringToWordVector0 = new StringToWordVector(30);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 30;
      stringToWordVector0.setAttributeIndicesArray(intArray0);
      stringToWordVector0.getOptions();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringToWordVector stringToWordVector0 = new StringToWordVector(2907);
      stringToWordVector0.setIDFTransform(false);
      stringToWordVector0.setDoNotOperateOnPerClassBasis(false);
      stringToWordVector0.doNotOperateOnPerClassBasisTipText();
  }
}
