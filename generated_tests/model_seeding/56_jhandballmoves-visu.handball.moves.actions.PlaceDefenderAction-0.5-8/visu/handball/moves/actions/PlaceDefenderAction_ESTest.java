/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 20:49:12 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceDefenderAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceDefenderAction_ESTest extends PlaceDefenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(player0).getCurrent_x();
      doReturn(0).when(player0).getCurrent_y();
      MoveEvent moveEvent0 = new MoveEvent(player0, (-1));
      handballModel0.setActualMoveEvent(moveEvent0);
      assertFalse(moveEvent0.isDestinationPointSet());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      // Undeclared exception!
      try { 
        handballModel0.startAnimation(false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 2035, "", 692);
      placeDefenderAction0.actionPerformed(actionEvent0);
      assertEquals(2035, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlaceDefenderAction placeDefenderAction0 = null;
      try {
        placeDefenderAction0 = new PlaceDefenderAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceDefenderAction", e);
      }
  }
}
