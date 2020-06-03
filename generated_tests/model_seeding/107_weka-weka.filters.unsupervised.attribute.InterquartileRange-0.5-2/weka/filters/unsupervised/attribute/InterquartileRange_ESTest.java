/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:12:43 GMT 2019
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
import weka.core.Instance;
import weka.filters.unsupervised.attribute.InterquartileRange;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterquartileRange_ESTest extends InterquartileRange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterquartileRange interquartileRange0 = new InterquartileRange();
      assertEquals((-1), InterquartileRange.NON_NUMERIC);
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertFalse(interquartileRange0.getDebug());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertNotNull(interquartileRange0);
      
      Instance instance0 = mock(Instance.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        interquartileRange0.isOutlier(instance0, (-1893));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.InterquartileRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterquartileRange interquartileRange0 = new InterquartileRange();
      assertEquals((-1), InterquartileRange.NON_NUMERIC);
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertNotNull(interquartileRange0);
      
      double[] doubleArray0 = new double[4];
      interquartileRange0.m_UpperOutlier = doubleArray0;
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      
      InterquartileRange.ValueType interquartileRange_ValueType0 = InterquartileRange.ValueType.MEDIAN;
      double[] doubleArray1 = interquartileRange0.getValues(interquartileRange_ValueType0);
      assertEquals((-1), InterquartileRange.NON_NUMERIC);
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterquartileRange interquartileRange0 = new InterquartileRange();
      assertEquals((-1), InterquartileRange.NON_NUMERIC);
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertNotNull(interquartileRange0);
      
      double[] doubleArray0 = new double[7];
      interquartileRange0.m_IQR = doubleArray0;
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      
      InterquartileRange.ValueType interquartileRange_ValueType0 = InterquartileRange.ValueType.LOWER_OUTLIER_VALUES;
      double[] doubleArray1 = interquartileRange0.getValues(interquartileRange_ValueType0);
      assertEquals((-1), InterquartileRange.NON_NUMERIC);
      assertEquals("Turns on output of debugging information.", interquartileRange0.debugTipText());
      assertEquals("Generates an additional attribute 'Offset' that contains the multiplier the value is off the median: value = median + 'multiplier' * IQR", interquartileRange0.outputOffsetMultiplierTipText());
      assertEquals("Whether to tag extreme values also as outliers.", interquartileRange0.extremeValuesAsOutliersTipText());
      assertFalse(interquartileRange0.getOutputOffsetMultiplier());
      assertFalse(interquartileRange0.isFirstBatchDone());
      assertEquals("The factor for determining the thresholds for outliers.", interquartileRange0.outlierFactorTipText());
      assertFalse(interquartileRange0.getDetectionPerAttribute());
      assertFalse(interquartileRange0.isOutputFormatDefined());
      assertEquals("Generates Outlier/ExtremeValue attribute pair for each numeric attribute, not just a single pair for all numeric attributes together.", interquartileRange0.detectionPerAttributeTipText());
      assertFalse(interquartileRange0.getDebug());
      assertEquals(6.0, interquartileRange0.getExtremeValuesFactor(), 0.01);
      assertEquals(3.0, interquartileRange0.getOutlierFactor(), 0.01);
      assertEquals("The factor for determining the thresholds for extreme values.", interquartileRange0.extremeValuesFactorTipText());
      assertEquals("A filter for detecting outliers and extreme values based on interquartile ranges. The filter skips the class attribute.\n\nOutliers:\n  Q3 + OF*IQR < x <= Q3 + EVF*IQR\n  or\n  Q1 - EVF*IQR <= x < Q1 - OF*IQR\n\nExtreme values:\n  x > Q3 + EVF*IQR\n  or\n  x < Q1 - EVF*IQR\n\nKey:\n  Q1  = 25% quartile\n  Q3  = 75% quartile\n  IQR = Interquartile Range, difference between Q1 and Q3\n  OF  = Outlier Factor\n  EVF = Extreme Value Factor", interquartileRange0.globalInfo());
      assertFalse(interquartileRange0.getExtremeValuesAsOutliers());
      assertEquals("Specify range of attributes to act on;  this is a comma separated list of attribute indices, with \"first\" and \"last\" valid values; specify an inclusive range with \"-\", eg: \"first-3,5,6-10,last\".", interquartileRange0.attributeIndicesTipText());
      assertFalse(interquartileRange0.mayRemoveInstanceAfterFirstBatchDone());
      assertTrue(interquartileRange0.isNewBatch());
      assertNull(doubleArray1);
  }
}
