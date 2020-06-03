/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 17:55:52 GMT 2019
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceDefenderAction_ESTest extends PlaceDefenderAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn((HandballModel.State) null).when(handballModel0).getState();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      // Undeclared exception!
      try { 
        placeDefenderAction0.modelChanged();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceDefenderAction", e);
      }
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
      placeDefenderAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      handballModel0.setState(handballModel_State0);
      assertFalse(handballModel0.isBallSet());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceDefenderAction placeDefenderAction0 = new PlaceDefenderAction(handballModel0);
      placeDefenderAction0.actionPerformed((ActionEvent) null);
  }
}
