/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:27:41 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractExportAction_ESTest extends AbstractExportAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      // Undeclared exception!
      try { 
        printActualSequenzAction0.drawHeader((Graphics) null, 2576.28788, 2012, 2576.28788);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction((HandballModel) null);
      printActualSequenzAction0.createCopy();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        createMovePdfAction0.drawHeader(debugGraphics0, 424.1, 424.1, 424.1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("visu.handball.moves.actions.AbstractExportAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      BufferedImage bufferedImage0 = new BufferedImage(12, 695, 4);
      Graphics graphics0 = bufferedImage0.getGraphics();
      Graphics2D graphics2D0 = printActualSequenzAction0.drawHeader(graphics0, 12, 12, (-206.0));
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      createMovePdfAction0.createCopy();
      // Undeclared exception!
      try { 
        createMovePdfAction0.drawSequence(graphics2D0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.views.FieldDrawer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      CreateMovePdfAction createMovePdfAction0 = new CreateMovePdfAction(handballModel0);
      // Undeclared exception!
      try { 
        createMovePdfAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
