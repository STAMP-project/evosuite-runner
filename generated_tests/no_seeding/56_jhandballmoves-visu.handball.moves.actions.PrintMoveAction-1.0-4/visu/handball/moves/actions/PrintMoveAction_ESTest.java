/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 17:33:25 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintMoveAction_ESTest extends PrintMoveAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(3187, 697);
      MoveEvent moveEvent0 = new MoveEvent(offender0, 3187);
      handballModel0.addMoveEvent(moveEvent0);
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      PageFormat pageFormat0 = new PageFormat();
      // Undeclared exception!
      try { 
        printMoveAction0.fillBook((Book) null, pageFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PrintMoveAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      PageFormat pageFormat0 = new PageFormat();
      // Undeclared exception!
      try { 
        printMoveAction0.fillBook((Book) null, pageFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PrintMoveAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      Book book0 = new Book();
      PageFormat pageFormat0 = new PageFormat();
      printMoveAction0.fillBook(book0, pageFormat0);
      assertEquals(1, book0.getNumberOfPages());
  }
}
