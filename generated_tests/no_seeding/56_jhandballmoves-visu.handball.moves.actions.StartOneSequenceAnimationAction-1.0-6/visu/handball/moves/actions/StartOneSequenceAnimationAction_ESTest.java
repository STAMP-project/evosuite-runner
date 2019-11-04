/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 12:31:57 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StartOneSequenceAnimationAction_ESTest extends StartOneSequenceAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      Offender offender0 = new Offender(747, (-1014));
      MoveEvent moveEvent0 = new MoveEvent(offender0, 3189, 747);
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(startOneSequenceAnimationAction0, (-1622), "", 747, (-1622));
      startOneSequenceAnimationAction0.actionPerformed(actionEvent0);
      assertEquals((-1622), actionEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = null;
      try {
        startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StartOneSequenceAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      handballModel0.setState(handballModel_State0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      handballModel0.stopAnimation();
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(startOneSequenceAnimationAction0, 0, "\"Wd~IpTx6J|q+C@A}", 0, 3);
      // Undeclared exception!
      try { 
        startOneSequenceAnimationAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(startOneSequenceAnimationAction0, (-1622), "", 747, (-1622));
      // Undeclared exception!
      try { 
        startOneSequenceAnimationAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
