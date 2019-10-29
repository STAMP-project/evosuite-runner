/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 14:42:14 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewPassEventAction_ESTest extends NewPassEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      newPassEventAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        newPassEventAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewPassEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(6, 400);
      handballModel0.setBallOwnerSilent(offender0);
      handballModel0.setMarkedPlayer(offender0);
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      newPassEventAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        newPassEventAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewPassEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewPassEventAction newPassEventAction0 = null;
      try {
        newPassEventAction0 = new NewPassEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewPassEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      Offender offender0 = new Offender((-3260), 0);
      HandballModel handballModel1 = new HandballModel();
      handballModel1.setBallOwnerSilent(offender0);
      handballModel0.setMarkedPlayer(offender0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel_State0, 154, "Angreifer 1", 154, 1);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      Defender defender0 = new Defender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-2765));
      handballModel0.addMoveEvent(moveEvent0);
      handballModel0.setState(handballModel_State0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, (-1921), (String) null, (-1921));
      Offender offender0 = new Offender(2737, 1);
      handballModel0.setBallOwnerSilent(offender0);
      handballModel0.setMarkedPlayer(offender0);
      // Undeclared exception!
      try { 
        newPassEventAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.MoveEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 7, "", 7);
      Offender offender0 = new Offender(7, 7);
      handballModel0.setMarkedPlayer(offender0);
      newPassEventAction0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewPassEventAction newPassEventAction0 = new NewPassEventAction(handballModel0);
      newPassEventAction0.actionPerformed((ActionEvent) null);
  }
}
