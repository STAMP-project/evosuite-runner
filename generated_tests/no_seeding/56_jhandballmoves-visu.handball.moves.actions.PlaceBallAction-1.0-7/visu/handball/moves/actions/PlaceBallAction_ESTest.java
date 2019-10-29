/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:56:23 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceBallAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceBallAction_ESTest extends PlaceBallAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.setState((HandballModel.State) null);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      // Undeclared exception!
      try { 
        placeBallAction0.modelChanged();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceBallAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaceBallAction placeBallAction0 = null;
      try {
        placeBallAction0 = new PlaceBallAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceBallAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      handballModel0.setState(handballModel_State0);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.actionPerformed((ActionEvent) null);
  }
}
