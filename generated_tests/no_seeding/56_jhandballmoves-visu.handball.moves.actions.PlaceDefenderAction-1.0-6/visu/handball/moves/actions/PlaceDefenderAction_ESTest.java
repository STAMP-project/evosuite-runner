/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 19:40:25 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceDefenderAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      Defender defender0 = new Defender((-1), (-1));
      MoveEvent moveEvent0 = new MoveEvent(defender0, (byte) (-97));
      handballModel0.setActualMoveEvent(moveEvent0);
      assertEquals((-97), handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
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
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.actionPerformed((ActionEvent) null);
  }
}
