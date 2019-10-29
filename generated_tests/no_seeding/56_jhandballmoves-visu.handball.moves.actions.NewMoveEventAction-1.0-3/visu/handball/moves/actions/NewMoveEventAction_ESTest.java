/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 15:57:37 GMT 2019
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
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewMoveEventAction_ESTest extends NewMoveEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Offender offender0 = new Offender((-1763), (-1763));
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      handballModel0.setMarkedPlayer(offender0);
      TableHandballModel tableHandballModel0 = new TableHandballModel(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(tableHandballModel0, (-1763), "Neuen Verteidiger mit linker Maustaste positionieren...");
      newMoveEventAction0.actionPerformed(actionEvent0);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      newMoveEventAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        newMoveEventAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewMoveEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewMoveEventAction newMoveEventAction0 = null;
      try {
        newMoveEventAction0 = new NewMoveEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewMoveEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Offender offender0 = new Offender((-1763), (-1763));
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setMarkedPlayer(offender0);
      ActionEvent actionEvent0 = new ActionEvent(".? 0P78X", 4, ".? 0P78X");
      newMoveEventAction0.actionPerformed(actionEvent0);
      handballModel0.setState(handballModel_State0);
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Offender offender0 = new Offender((-324), (-324));
      MoveEvent moveEvent0 = new MoveEvent(offender0, (-324), 0);
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent("0Qqd+}`d{ aHF>", 0, "visu.handball.moves.views.BallDrawer");
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
  }
}
