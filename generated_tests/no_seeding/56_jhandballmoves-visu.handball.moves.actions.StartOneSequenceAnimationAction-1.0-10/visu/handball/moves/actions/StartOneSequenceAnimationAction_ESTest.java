/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 04 14:34:59 GMT 2019
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
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
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
      Offender offender0 = new Offender(2, 1);
      MoveEvent moveEvent0 = new MoveEvent(offender0, (-4604), 1313);
      handballModel0.setActualMoveEvent(moveEvent0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.actionPerformed((ActionEvent) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      handballModel0.setState(handballModel_State0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.stopAnimation();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      startOneSequenceAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        startOneSequenceAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartOneSequenceAnimationAction startOneSequenceAnimationAction0 = new StartOneSequenceAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        startOneSequenceAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
