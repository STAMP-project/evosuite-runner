/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 17:09:33 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceOffenderAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceOffenderAction_ESTest extends PlaceOffenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      placeOffenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaceOffenderAction placeOffenderAction0 = null;
      try {
        placeOffenderAction0 = new PlaceOffenderAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceOffenderAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      Defender defender0 = new Defender((-2823), 0);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-572));
      handballModel0.setActualMoveEvent(moveEvent0);
      assertEquals((-572), moveEvent0.getSequenceNr());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceOffenderAction placeOffenderAction0 = new PlaceOffenderAction(handballModel0);
      DefaultTableCellRenderer defaultTableCellRenderer0 = new DefaultTableCellRenderer();
      ActionEvent actionEvent0 = new ActionEvent(defaultTableCellRenderer0, 1359, "YIP9o/7YKv&B-k", 1359);
      placeOffenderAction0.actionPerformed(actionEvent0);
      assertEquals(1359, actionEvent0.getID());
  }
}
