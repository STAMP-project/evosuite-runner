/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 20:49:42 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StopAnimationAction_ESTest extends StopAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StopAnimationAction stopAnimationAction0 = null;
      try {
        stopAnimationAction0 = new StopAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StopAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      HandballModel.State handballModel_State1 = HandballModel.State.ANIMATION_RUNNING;
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(handballModel_State0, handballModel_State0, handballModel_State1).when(handballModel0).getState();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, 0, "visu.handball.moves.actions.StopAnimationAction", 0, 0);
      stopAnimationAction0.actionPerformed(actionEvent0);
      stopAnimationAction0.modelChanged();
      stopAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      HandballModel.State handballModel_State1 = HandballModel.State.ANIMATION_RUNNING;
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(handballModel_State0, handballModel_State0, handballModel_State1).when(handballModel0).getState();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, 0, "visu.handball.moves.actions.StopAnimationAction", 0, 0);
      stopAnimationAction0.actionPerformed(actionEvent0);
      stopAnimationAction0.modelChanged();
      stopAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }
}
