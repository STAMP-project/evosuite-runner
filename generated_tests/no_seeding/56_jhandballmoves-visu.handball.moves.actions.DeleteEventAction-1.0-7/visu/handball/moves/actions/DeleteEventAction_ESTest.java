/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:56:42 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeleteEventAction_ESTest extends DeleteEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      DeleteEventAction deleteEventAction0 = new DeleteEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      deleteEventAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        deleteEventAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.DeleteEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      DeleteEventAction deleteEventAction0 = new DeleteEventAction(handballModel0);
      // Undeclared exception!
      try { 
        deleteEventAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeleteEventAction deleteEventAction0 = null;
      try {
        deleteEventAction0 = new DeleteEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.DeleteEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      DeleteEventAction deleteEventAction0 = new DeleteEventAction(handballModel0);
      deleteEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      HandballModel handballModel0 = new HandballModel();
      handballModel0.setState(handballModel_State0);
      DeleteEventAction deleteEventAction0 = new DeleteEventAction(handballModel0);
      Defender defender0 = new Defender((-2117), (-2117));
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-2117), (-569));
      handballModel0.setActualMoveEvent(moveEvent0);
      assertEquals("", handballModel0.getMoveName());
  }
}
